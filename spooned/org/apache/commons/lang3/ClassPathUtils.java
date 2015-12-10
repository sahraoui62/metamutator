package org.apache.commons.lang3;


public class ClassPathUtils {
    public ClassPathUtils() {
        super();
    }

    public static java.lang.String toFullyQualifiedName(final java.lang.Class<?> context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return ((_returnReplacementOperator2553.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassPathUtils.toFullyQualifiedName(context.getPackage(), resourceName)));
    }

    public static java.lang.String toFullyQualifiedName(final java.lang.Package context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return ((_returnReplacementOperator2554.is("NULL")) ? ( null ) : (((context.getName()) + ".") + resourceName));
    }

    public static java.lang.String toFullyQualifiedPath(final java.lang.Class<?> context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return ((_returnReplacementOperator2555.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ClassPathUtils.toFullyQualifiedPath(context.getPackage(), resourceName)));
    }

    public static java.lang.String toFullyQualifiedPath(final java.lang.Package context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return ((_returnReplacementOperator2556.is("NULL")) ? ( null ) : (((context.getName().replace('.', '/')) + "/") + resourceName));
    }

    private static final metamutator.Selector _returnReplacementOperator2553 = metamutator.Selector.of(2553,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassPathUtils.class).id("_returnReplacementOperator2553");

    private static final metamutator.Selector _returnReplacementOperator2554 = metamutator.Selector.of(2554,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassPathUtils.class).id("_returnReplacementOperator2554");

    private static final metamutator.Selector _returnReplacementOperator2555 = metamutator.Selector.of(2555,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassPathUtils.class).id("_returnReplacementOperator2555");

    private static final metamutator.Selector _returnReplacementOperator2556 = metamutator.Selector.of(2556,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.ClassPathUtils.class).id("_returnReplacementOperator2556");
}

