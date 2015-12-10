package org.apache.commons.lang3;


public class ClassPathUtils {
    public ClassPathUtils() {
        super();
    }

    public static java.lang.String toFullyQualifiedName(final java.lang.Class<?> context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return ((_returnReplacementOperatorHotSpot2553.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassPathUtils.toFullyQualifiedName(context.getPackage(), resourceName)));
    }

    public static java.lang.String toFullyQualifiedName(final java.lang.Package context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return ((_returnReplacementOperatorHotSpot2554.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((context.getName()) + ".") + resourceName));
    }

    public static java.lang.String toFullyQualifiedPath(final java.lang.Class<?> context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return ((_returnReplacementOperatorHotSpot2555.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ClassPathUtils.toFullyQualifiedPath(context.getPackage(), resourceName)));
    }

    public static java.lang.String toFullyQualifiedPath(final java.lang.Package context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return ((_returnReplacementOperatorHotSpot2556.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (((context.getName().replace('.', '/')) + "/") + resourceName));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2553 = metamutator.Selector.of(2553,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassPathUtils.class).id("_returnReplacementOperatorHotSpot2553");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2554 = metamutator.Selector.of(2554,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassPathUtils.class).id("_returnReplacementOperatorHotSpot2554");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2555 = metamutator.Selector.of(2555,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassPathUtils.class).id("_returnReplacementOperatorHotSpot2555");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot2556 = metamutator.Selector.of(2556,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.ClassPathUtils.class).id("_returnReplacementOperatorHotSpot2556");
}

