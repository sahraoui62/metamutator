package org.apache.commons.lang3.builder;


public class DiffBuilder implements org.apache.commons.lang3.builder.Builder<org.apache.commons.lang3.builder.DiffResult> {
    private final java.util.List<org.apache.commons.lang3.builder.Diff<?>> diffs;

    private final boolean objectsTriviallyEqual;

    private final java.lang.Object left;

    private final java.lang.Object right;

    private final org.apache.commons.lang3.builder.ToStringStyle style;

    public DiffBuilder(final java.lang.Object lhs ,final java.lang.Object rhs ,final org.apache.commons.lang3.builder.ToStringStyle style ,final boolean testTriviallyEqual) {
        if (lhs == null) {
            throw new java.lang.IllegalArgumentException("lhs cannot be null");
        } 
        if (rhs == null) {
            throw new java.lang.IllegalArgumentException("rhs cannot be null");
        } 
        this.diffs = new java.util.ArrayList<org.apache.commons.lang3.builder.Diff<?>>();
        this.left = lhs;
        this.right = rhs;
        this.style = style;
        this.objectsTriviallyEqual = testTriviallyEqual && ((lhs == rhs) || (lhs.equals(rhs)));
    }

    public DiffBuilder(final java.lang.Object lhs ,final java.lang.Object rhs ,final org.apache.commons.lang3.builder.ToStringStyle style) {
        this(lhs, rhs, style, true);
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final boolean lhs, final boolean rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Boolean>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Boolean getLeft() {
                    return java.lang.Boolean.valueOf(lhs);
                }

                @java.lang.Override
                public java.lang.Boolean getRight() {
                    return java.lang.Boolean.valueOf(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final boolean[] lhs, final boolean[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Boolean[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Boolean[] getLeft() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(lhs);
                }

                @java.lang.Override
                public java.lang.Boolean[] getRight() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final byte lhs, final byte rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Byte>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Byte getLeft() {
                    return java.lang.Byte.valueOf(lhs);
                }

                @java.lang.Override
                public java.lang.Byte getRight() {
                    return java.lang.Byte.valueOf(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final byte[] lhs, final byte[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Byte[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Byte[] getLeft() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(lhs);
                }

                @java.lang.Override
                public java.lang.Byte[] getRight() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final char lhs, final char rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Character>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Character getLeft() {
                    return java.lang.Character.valueOf(lhs);
                }

                @java.lang.Override
                public java.lang.Character getRight() {
                    return java.lang.Character.valueOf(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final char[] lhs, final char[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Character[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Character[] getLeft() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(lhs);
                }

                @java.lang.Override
                public java.lang.Character[] getRight() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final double lhs, final double rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if ((java.lang.Double.doubleToLongBits(lhs)) != (java.lang.Double.doubleToLongBits(rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Double>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Double getLeft() {
                    return java.lang.Double.valueOf(lhs);
                }

                @java.lang.Override
                public java.lang.Double getRight() {
                    return java.lang.Double.valueOf(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final double[] lhs, final double[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Double[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Double[] getLeft() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(lhs);
                }

                @java.lang.Override
                public java.lang.Double[] getRight() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final float lhs, final float rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if ((java.lang.Float.floatToIntBits(lhs)) != (java.lang.Float.floatToIntBits(rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Float>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Float getLeft() {
                    return java.lang.Float.valueOf(lhs);
                }

                @java.lang.Override
                public java.lang.Float getRight() {
                    return java.lang.Float.valueOf(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final float[] lhs, final float[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Float[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Float[] getLeft() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(lhs);
                }

                @java.lang.Override
                public java.lang.Float[] getRight() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final int lhs, final int rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Integer>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Integer getLeft() {
                    return java.lang.Integer.valueOf(lhs);
                }

                @java.lang.Override
                public java.lang.Integer getRight() {
                    return java.lang.Integer.valueOf(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final int[] lhs, final int[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Integer[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Integer[] getLeft() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(lhs);
                }

                @java.lang.Override
                public java.lang.Integer[] getRight() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final long lhs, final long rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Long>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Long getLeft() {
                    return java.lang.Long.valueOf(lhs);
                }

                @java.lang.Override
                public java.lang.Long getRight() {
                    return java.lang.Long.valueOf(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final long[] lhs, final long[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Long[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Long[] getLeft() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(lhs);
                }

                @java.lang.Override
                public java.lang.Long[] getRight() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final short lhs, final short rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Short>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Short getLeft() {
                    return java.lang.Short.valueOf(lhs);
                }

                @java.lang.Override
                public java.lang.Short getRight() {
                    return java.lang.Short.valueOf(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final short[] lhs, final short[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Short[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Short[] getLeft() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(lhs);
                }

                @java.lang.Override
                public java.lang.Short[] getRight() {
                    return org.apache.commons.lang3.ArrayUtils.toObject(rhs);
                }
            });
        } 
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final java.lang.Object lhs, final java.lang.Object rhs) {
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (lhs == rhs) {
            return this;
        } 
        java.lang.Object objectToTest;
        if (lhs != null) {
            objectToTest = lhs;
        } else {
            objectToTest = rhs;
        }
        if (objectToTest.getClass().isArray()) {
            if (objectToTest instanceof boolean[]) {
                return append(fieldName, ((boolean[])(lhs)), ((boolean[])(rhs)));
            } 
            if (objectToTest instanceof byte[]) {
                return append(fieldName, ((byte[])(lhs)), ((byte[])(rhs)));
            } 
            if (objectToTest instanceof char[]) {
                return append(fieldName, ((char[])(lhs)), ((char[])(rhs)));
            } 
            if (objectToTest instanceof double[]) {
                return append(fieldName, ((double[])(lhs)), ((double[])(rhs)));
            } 
            if (objectToTest instanceof float[]) {
                return append(fieldName, ((float[])(lhs)), ((float[])(rhs)));
            } 
            if (objectToTest instanceof int[]) {
                return append(fieldName, ((int[])(lhs)), ((int[])(rhs)));
            } 
            if (objectToTest instanceof long[]) {
                return append(fieldName, ((long[])(lhs)), ((long[])(rhs)));
            } 
            if (objectToTest instanceof short[]) {
                return append(fieldName, ((short[])(lhs)), ((short[])(rhs)));
            } 
            return append(fieldName, ((java.lang.Object[])(lhs)), ((java.lang.Object[])(rhs)));
        } 
        if ((lhs != null) && (lhs.equals(rhs))) {
            return this;
        } 
        diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Object>(fieldName) {
            private static final long serialVersionUID = 1L;

            @java.lang.Override
            public java.lang.Object getLeft() {
                return lhs;
            }

            @java.lang.Override
            public java.lang.Object getRight() {
                return rhs;
            }
        });
        return this;
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final java.lang.Object[] lhs, final java.lang.Object[] rhs) {
        if (objectsTriviallyEqual) {
            return this;
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Object[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Object[] getLeft() {
                    return lhs;
                }

                @java.lang.Override
                public java.lang.Object[] getRight() {
                    return rhs;
                }
            });
        } 
        return this;
    }

    @java.lang.Override
    public org.apache.commons.lang3.builder.DiffResult build() {
        return new org.apache.commons.lang3.builder.DiffResult(left , right , diffs , style);
    }
}

