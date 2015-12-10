package org.apache.commons.lang3;


public class ClassPathUtils {
    public ClassPathUtils() {
        super();
    }

    public static java.lang.String toFullyQualifiedName(final java.lang.Class<?> context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return org.apache.commons.lang3.ClassPathUtils.toFullyQualifiedName(context.getPackage(), resourceName);
    }

    public static java.lang.String toFullyQualifiedName(final java.lang.Package context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return ((context.getName()) + ".") + resourceName;
    }

    public static java.lang.String toFullyQualifiedPath(final java.lang.Class<?> context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return org.apache.commons.lang3.ClassPathUtils.toFullyQualifiedPath(context.getPackage(), resourceName);
    }

    public static java.lang.String toFullyQualifiedPath(final java.lang.Package context, final java.lang.String resourceName) {
        org.apache.commons.lang3.Validate.notNull(context, "Parameter '%s' must not be null!", "context");
        org.apache.commons.lang3.Validate.notNull(resourceName, "Parameter '%s' must not be null!", "resourceName");
        return ((context.getName().replace('.', '/')) + "/") + resourceName;
    }
}

