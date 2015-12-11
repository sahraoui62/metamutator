package org.jsoup.select;


abstract class CombiningEvaluator extends org.jsoup.select.Evaluator {
    final java.util.ArrayList<org.jsoup.select.Evaluator> evaluators;

    int num = 0;

    CombiningEvaluator() {
        super();
        evaluators = new java.util.ArrayList<org.jsoup.select.Evaluator>();
    }

    CombiningEvaluator(java.util.Collection<org.jsoup.select.Evaluator> evaluators) {
        this();
        this.evaluators.addAll(evaluators);
        updateNumEvaluators();
    }

    org.jsoup.select.Evaluator rightMostEvaluator() {
        return (num) > 0 ? evaluators.get(((num) - 1)) : null;
    }

    void replaceRightMostEvaluator(org.jsoup.select.Evaluator replacement) {
        evaluators.set(((num) - 1), replacement);
    }

    void updateNumEvaluators() {
        num = evaluators.size();
    }

    static final class And extends org.jsoup.select.CombiningEvaluator {
        And(java.util.Collection<org.jsoup.select.Evaluator> evaluators) {
            super(evaluators);
        }

        And(org.jsoup.select.Evaluator... evaluators) {
            this(java.util.Arrays.asList(evaluators));
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element node) {
            for (int i = 0 ; i < (num) ; i++) {
                org.jsoup.select.Evaluator s = evaluators.get(i);
                if (!(s.matches(root, node)))
                    return false;
                
            }
            return true;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return org.jsoup.helper.StringUtil.join(evaluators, " ");
        }
    }

    static final class Or extends org.jsoup.select.CombiningEvaluator {
        Or(java.util.Collection<org.jsoup.select.Evaluator> evaluators) {
            super();
            if ((num) > 1)
                this.evaluators.add(new org.jsoup.select.CombiningEvaluator.And(evaluators));
            else
                this.evaluators.addAll(evaluators);
            
            updateNumEvaluators();
        }

        Or() {
            super();
        }

        public void add(org.jsoup.select.Evaluator e) {
            evaluators.add(e);
            updateNumEvaluators();
        }

        @java.lang.Override
        public boolean matches(org.jsoup.nodes.Element root, org.jsoup.nodes.Element node) {
            for (int i = 0 ; i < (num) ; i++) {
                org.jsoup.select.Evaluator s = evaluators.get(i);
                if (s.matches(root, node))
                    return true;
                
            }
            return false;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return java.lang.String.format(":or%s", evaluators);
        }
    }
}

