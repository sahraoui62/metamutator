package org.jsoup.select;


class QueryParser {
    private static final java.lang.String[] combinators = new java.lang.String[]{ "," , ">" , "+" , "~" , " " };

    private static final java.lang.String[] AttributeEvals = new java.lang.String[]{ "=" , "!=" , "^=" , "$=" , "*=" , "~=" };

    private org.jsoup.parser.TokenQueue tq;

    private java.lang.String query;

    private java.util.List<org.jsoup.select.Evaluator> evals = new java.util.ArrayList<org.jsoup.select.Evaluator>();

    private QueryParser(java.lang.String query) {
        this.query = query;
        this.tq = new org.jsoup.parser.TokenQueue(query);
    }

    public static org.jsoup.select.Evaluator parse(java.lang.String query) {
        org.jsoup.select.QueryParser p = new org.jsoup.select.QueryParser(query);
        return p.parse();
    }

    org.jsoup.select.Evaluator parse() {
        tq.consumeWhitespace();
        if (tq.matchesAny(combinators)) {
            evals.add(new org.jsoup.select.StructuralEvaluator.Root());
            combinator(tq.consume());
        } else {
            findElements();
        }
        while (!(tq.isEmpty())) {
            boolean seenWhite = tq.consumeWhitespace();
            if (tq.matchesAny(combinators)) {
                combinator(tq.consume());
            } else if (seenWhite) {
                combinator(' ');
            } else {
                findElements();
            }
        }
        if ((evals.size()) == 1)
            return evals.get(0);
        
        return new org.jsoup.select.CombiningEvaluator.And(evals);
    }

    private void combinator(char combinator) {
        tq.consumeWhitespace();
        java.lang.String subQuery = consumeSubQuery();
        org.jsoup.select.Evaluator rootEval;
        org.jsoup.select.Evaluator currentEval;
        org.jsoup.select.Evaluator newEval = org.jsoup.select.QueryParser.parse(subQuery);
        boolean replaceRightMost = false;
        if ((evals.size()) == 1) {
            rootEval = currentEval = evals.get(0);
            if ((rootEval instanceof org.jsoup.select.CombiningEvaluator.Or) && (combinator != ',')) {
                currentEval = ((org.jsoup.select.CombiningEvaluator.Or)(currentEval)).rightMostEvaluator();
                replaceRightMost = true;
            } 
        } else {
            rootEval = currentEval = new org.jsoup.select.CombiningEvaluator.And(evals);
        }
        evals.clear();
        if (combinator == '>')
            currentEval = new org.jsoup.select.CombiningEvaluator.And(newEval , new org.jsoup.select.StructuralEvaluator.ImmediateParent(currentEval));
        else if (combinator == ' ')
            currentEval = new org.jsoup.select.CombiningEvaluator.And(newEval , new org.jsoup.select.StructuralEvaluator.Parent(currentEval));
        else if (combinator == '+')
            currentEval = new org.jsoup.select.CombiningEvaluator.And(newEval , new org.jsoup.select.StructuralEvaluator.ImmediatePreviousSibling(currentEval));
        else if (combinator == '~')
            currentEval = new org.jsoup.select.CombiningEvaluator.And(newEval , new org.jsoup.select.StructuralEvaluator.PreviousSibling(currentEval));
        else if (combinator == ',') {
            org.jsoup.select.CombiningEvaluator.Or or;
            if (currentEval instanceof org.jsoup.select.CombiningEvaluator.Or) {
                or = ((org.jsoup.select.CombiningEvaluator.Or)(currentEval));
                or.add(newEval);
            } else {
                or = new org.jsoup.select.CombiningEvaluator.Or();
                or.add(currentEval);
                or.add(newEval);
            }
            currentEval = or;
        } else
            throw new org.jsoup.select.Selector.SelectorParseException(((_arithmeticOperatorHotSpot120.is("PLUS") ? (("Unknown combinator: " + combinator))) : (_arithmeticOperatorHotSpot120.is("MINUS") ? (("Unknown combinator: " - combinator))) : (_arithmeticOperatorHotSpot120.is("MUL") ? (("Unknown combinator: " * combinator))) : (_arithmeticOperatorHotSpot120.is("DIV") ? (("Unknown combinator: " / combinator)))));
        
        if (replaceRightMost)
            ((org.jsoup.select.CombiningEvaluator.Or)(rootEval)).replaceRightMostEvaluator(currentEval);
        else
            rootEval = currentEval;
        
        evals.add(rootEval);
    }

    private java.lang.String consumeSubQuery() {
        java.lang.StringBuilder sq = new java.lang.StringBuilder();
        while (!(tq.isEmpty())) {
            if (tq.matches("("))
                sq.append("(").append(tq.chompBalanced('(', ')')).append(")");
            else if (tq.matches("["))
                sq.append("[").append(tq.chompBalanced('[', ']')).append("]");
            else if (tq.matchesAny(combinators))
                break;
            else
                sq.append(tq.consume());
            
        }
        return sq.toString();
    }

    private void findElements() {
        if (tq.matchChomp("#"))
            byId();
        else if (tq.matchChomp("."))
            byClass();
        else if (tq.matchesWord())
            byTag();
        else if (tq.matches("["))
            byAttribute();
        else if (tq.matchChomp("*"))
            allElements();
        else if (tq.matchChomp(":lt("))
            indexLessThan();
        else if (tq.matchChomp(":gt("))
            indexGreaterThan();
        else if (tq.matchChomp(":eq("))
            indexEquals();
        else if (tq.matches(":has("))
            has();
        else if (tq.matches(":contains("))
            contains(false);
        else if (tq.matches(":containsOwn("))
            contains(true);
        else if (tq.matches(":matches("))
            matches(false);
        else if (tq.matches(":matchesOwn("))
            matches(true);
        else if (tq.matches(":not("))
            not();
        else if (tq.matchChomp(":nth-child("))
            cssNthChild(false, false);
        else if (tq.matchChomp(":nth-last-child("))
            cssNthChild(true, false);
        else if (tq.matchChomp(":nth-of-type("))
            cssNthChild(false, true);
        else if (tq.matchChomp(":nth-last-of-type("))
            cssNthChild(true, true);
        else if (tq.matchChomp(":first-child"))
            evals.add(new org.jsoup.select.Evaluator.IsFirstChild());
        else if (tq.matchChomp(":last-child"))
            evals.add(new org.jsoup.select.Evaluator.IsLastChild());
        else if (tq.matchChomp(":first-of-type"))
            evals.add(new org.jsoup.select.Evaluator.IsFirstOfType());
        else if (tq.matchChomp(":last-of-type"))
            evals.add(new org.jsoup.select.Evaluator.IsLastOfType());
        else if (tq.matchChomp(":only-child"))
            evals.add(new org.jsoup.select.Evaluator.IsOnlyChild());
        else if (tq.matchChomp(":only-of-type"))
            evals.add(new org.jsoup.select.Evaluator.IsOnlyOfType());
        else if (tq.matchChomp(":empty"))
            evals.add(new org.jsoup.select.Evaluator.IsEmpty());
        else if (tq.matchChomp(":root"))
            evals.add(new org.jsoup.select.Evaluator.IsRoot());
        else
            throw new org.jsoup.select.Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'" , query , tq.remainder());
        
    }

    private void byId() {
        java.lang.String id = tq.consumeCssIdentifier();
        org.jsoup.helper.Validate.notEmpty(id);
        evals.add(new org.jsoup.select.Evaluator.Id(id));
    }

    private void byClass() {
        java.lang.String className = tq.consumeCssIdentifier();
        org.jsoup.helper.Validate.notEmpty(className);
        evals.add(new org.jsoup.select.Evaluator.Class(className.trim().toLowerCase()));
    }

    private void byTag() {
        java.lang.String tagName = tq.consumeElementSelector();
        org.jsoup.helper.Validate.notEmpty(tagName);
        if (tagName.contains("|"))
            tagName = tagName.replace("|", ":");
        
        evals.add(new org.jsoup.select.Evaluator.Tag(tagName.trim().toLowerCase()));
    }

    private void byAttribute() {
        org.jsoup.parser.TokenQueue cq = new org.jsoup.parser.TokenQueue(tq.chompBalanced('[', ']'));
        java.lang.String key = cq.consumeToAny(AttributeEvals);
        org.jsoup.helper.Validate.notEmpty(key);
        cq.consumeWhitespace();
        if (cq.isEmpty()) {
            if (key.startsWith("^"))
                evals.add(new org.jsoup.select.Evaluator.AttributeStarting(key.substring(1)));
            else
                evals.add(new org.jsoup.select.Evaluator.Attribute(key));
            
        } else {
            if (cq.matchChomp("="))
                evals.add(new org.jsoup.select.Evaluator.AttributeWithValue(key , cq.remainder()));
            else if (cq.matchChomp("!="))
                evals.add(new org.jsoup.select.Evaluator.AttributeWithValueNot(key , cq.remainder()));
            else if (cq.matchChomp("^="))
                evals.add(new org.jsoup.select.Evaluator.AttributeWithValueStarting(key , cq.remainder()));
            else if (cq.matchChomp("$="))
                evals.add(new org.jsoup.select.Evaluator.AttributeWithValueEnding(key , cq.remainder()));
            else if (cq.matchChomp("*="))
                evals.add(new org.jsoup.select.Evaluator.AttributeWithValueContaining(key , cq.remainder()));
            else if (cq.matchChomp("~="))
                evals.add(new org.jsoup.select.Evaluator.AttributeWithValueMatching(key , java.util.regex.Pattern.compile(cq.remainder())));
            else
                throw new org.jsoup.select.Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'" , query , cq.remainder());
            
        }
    }

    private void allElements() {
        evals.add(new org.jsoup.select.Evaluator.AllElements());
    }

    private void indexLessThan() {
        evals.add(new org.jsoup.select.Evaluator.IndexLessThan(consumeIndex()));
    }

    private void indexGreaterThan() {
        evals.add(new org.jsoup.select.Evaluator.IndexGreaterThan(consumeIndex()));
    }

    private void indexEquals() {
        evals.add(new org.jsoup.select.Evaluator.IndexEquals(consumeIndex()));
    }

    private static final java.util.regex.Pattern NTH_AB = java.util.regex.Pattern.compile("((\\+|-)?(\\d+)?)n(\\s*(\\+|-)?\\s*\\d+)?", java.util.regex.Pattern.CASE_INSENSITIVE);

    private static final java.util.regex.Pattern NTH_B = java.util.regex.Pattern.compile("(\\+|-)?(\\d+)");

    private void cssNthChild(boolean backwards, boolean ofType) {
        java.lang.String argS = tq.chompTo(")").trim().toLowerCase();
        java.util.regex.Matcher mAB = NTH_AB.matcher(argS);
        java.util.regex.Matcher mB = NTH_B.matcher(argS);
        final int a;
        final int b;
        if ("odd".equals(argS)) {
            a = 2;
            b = 1;
        } else if ("even".equals(argS)) {
            a = 2;
            b = 0;
        } else if (mAB.matches()) {
            a = (mAB.group(3)) != null ? java.lang.Integer.parseInt(mAB.group(1).replaceFirst("^\\+", "")) : 1;
            b = (mAB.group(4)) != null ? java.lang.Integer.parseInt(mAB.group(4).replaceFirst("^\\+", "")) : 0;
        } else if (mB.matches()) {
            a = 0;
            b = java.lang.Integer.parseInt(mB.group().replaceFirst("^\\+", ""));
        } else {
            throw new org.jsoup.select.Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format" , argS);
        }
        if (ofType)
            if (backwards)
                evals.add(new org.jsoup.select.Evaluator.IsNthLastOfType(a , b));
            else
                evals.add(new org.jsoup.select.Evaluator.IsNthOfType(a , b));
            
        else {
            if (backwards)
                evals.add(new org.jsoup.select.Evaluator.IsNthLastChild(a , b));
            else
                evals.add(new org.jsoup.select.Evaluator.IsNthChild(a , b));
            
        }
    }

    private int consumeIndex() {
        java.lang.String indexS = tq.chompTo(")").trim();
        org.jsoup.helper.Validate.isTrue(org.jsoup.helper.StringUtil.isNumeric(indexS), "Index must be numeric");
        return java.lang.Integer.parseInt(indexS);
    }

    private void has() {
        tq.consume(":has");
        java.lang.String subQuery = tq.chompBalanced('(', ')');
        org.jsoup.helper.Validate.notEmpty(subQuery, ":has(el) subselect must not be empty");
        evals.add(new org.jsoup.select.StructuralEvaluator.Has(org.jsoup.select.QueryParser.parse(subQuery)));
    }

    private void contains(boolean own) {
        tq.consume((own ? ":containsOwn" : ":contains"));
        java.lang.String searchText = org.jsoup.parser.TokenQueue.unescape(tq.chompBalanced('(', ')'));
        org.jsoup.helper.Validate.notEmpty(searchText, ":contains(text) query must not be empty");
        if (own)
            evals.add(new org.jsoup.select.Evaluator.ContainsOwnText(searchText));
        else
            evals.add(new org.jsoup.select.Evaluator.ContainsText(searchText));
        
    }

    private void matches(boolean own) {
        tq.consume((own ? ":matchesOwn" : ":matches"));
        java.lang.String regex = tq.chompBalanced('(', ')');
        org.jsoup.helper.Validate.notEmpty(regex, ":matches(regex) query must not be empty");
        if (own)
            evals.add(new org.jsoup.select.Evaluator.MatchesOwn(java.util.regex.Pattern.compile(regex)));
        else
            evals.add(new org.jsoup.select.Evaluator.Matches(java.util.regex.Pattern.compile(regex)));
        
    }

    private void not() {
        tq.consume(":not");
        java.lang.String subQuery = tq.chompBalanced('(', ')');
        org.jsoup.helper.Validate.notEmpty(subQuery, ":not(selector) subselect must not be empty");
        evals.add(new org.jsoup.select.StructuralEvaluator.Not(org.jsoup.select.QueryParser.parse(subQuery)));
    }

    private static final metamutator.Selector _arithmeticOperatorHotSpot120 = metamutator.Selector.of(120,new String[]{"PLUS","MINUS","MUL","DIV"}).in(org.jsoup.select.QueryParser.class).id("_arithmeticOperatorHotSpot120");
}

