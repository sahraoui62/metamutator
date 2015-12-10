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
            return ((_returnReplacementOperatorHotSpot92.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
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
        return ((_returnReplacementOperatorHotSpot93.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final boolean[] lhs, final boolean[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot94.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Boolean[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Boolean[] getLeft() {
                    return ((_returnReplacementOperatorHotSpot95.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Boolean[] getRight() {
                    return ((_returnReplacementOperatorHotSpot96.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot97.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final byte lhs, final byte rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot98.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Byte>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Byte getLeft() {
                    return ((_returnReplacementOperatorHotSpot99.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Byte.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Byte getRight() {
                    return ((_returnReplacementOperatorHotSpot100.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Byte.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot101.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final byte[] lhs, final byte[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot102.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Byte[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Byte[] getLeft() {
                    return ((_returnReplacementOperatorHotSpot103.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Byte[] getRight() {
                    return ((_returnReplacementOperatorHotSpot104.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot105.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final char lhs, final char rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot106.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Character>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Character getLeft() {
                    return ((_returnReplacementOperatorHotSpot107.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Character.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Character getRight() {
                    return ((_returnReplacementOperatorHotSpot108.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Character.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot109.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final char[] lhs, final char[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot110.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Character[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Character[] getLeft() {
                    return ((_returnReplacementOperatorHotSpot111.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Character[] getRight() {
                    return ((_returnReplacementOperatorHotSpot112.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot113.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final double lhs, final double rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot114.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((java.lang.Double.doubleToLongBits(lhs)) != (java.lang.Double.doubleToLongBits(rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Double>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Double getLeft() {
                    return ((_returnReplacementOperatorHotSpot115.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Double.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Double getRight() {
                    return ((_returnReplacementOperatorHotSpot116.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Double.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot117.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final double[] lhs, final double[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot118.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Double[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Double[] getLeft() {
                    return ((_returnReplacementOperatorHotSpot119.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Double[] getRight() {
                    return ((_returnReplacementOperatorHotSpot120.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot121.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final float lhs, final float rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot122.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if ((java.lang.Float.floatToIntBits(lhs)) != (java.lang.Float.floatToIntBits(rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Float>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Float getLeft() {
                    return ((_returnReplacementOperatorHotSpot123.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Float.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Float getRight() {
                    return ((_returnReplacementOperatorHotSpot124.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Float.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot125.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final float[] lhs, final float[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot126.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Float[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Float[] getLeft() {
                    return ((_returnReplacementOperatorHotSpot127.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Float[] getRight() {
                    return ((_returnReplacementOperatorHotSpot128.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot129.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final int lhs, final int rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot130.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Integer>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Integer getLeft() {
                    return ((_returnReplacementOperatorHotSpot131.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Integer.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Integer getRight() {
                    return ((_returnReplacementOperatorHotSpot132.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Integer.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot133.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final int[] lhs, final int[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot134.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Integer[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Integer[] getLeft() {
                    return ((_returnReplacementOperatorHotSpot135.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Integer[] getRight() {
                    return ((_returnReplacementOperatorHotSpot136.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot137.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final long lhs, final long rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot157.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Long>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Long getLeft() {
                    return ((_returnReplacementOperatorHotSpot158.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Long.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Long getRight() {
                    return ((_returnReplacementOperatorHotSpot159.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Long.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot160.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final long[] lhs, final long[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot161.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Long[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Long[] getLeft() {
                    return ((_returnReplacementOperatorHotSpot162.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Long[] getRight() {
                    return ((_returnReplacementOperatorHotSpot163.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot164.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final short lhs, final short rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot165.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Short>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Short getLeft() {
                    return ((_returnReplacementOperatorHotSpot166.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Short.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Short getRight() {
                    return ((_returnReplacementOperatorHotSpot167.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (java.lang.Short.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot168.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final short[] lhs, final short[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot169.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Short[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Short[] getLeft() {
                    return ((_returnReplacementOperatorHotSpot170.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Short[] getRight() {
                    return ((_returnReplacementOperatorHotSpot171.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot172.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final java.lang.Object lhs, final java.lang.Object rhs) {
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot138.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperatorHotSpot139.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        java.lang.Object objectToTest;
        if (lhs != null) {
            objectToTest = lhs;
        } else {
            objectToTest = rhs;
        }
        if (objectToTest.getClass().isArray()) {
            if (objectToTest instanceof boolean[]) {
                return ((_returnReplacementOperatorHotSpot140.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(fieldName, ((boolean[])(lhs)), ((boolean[])(rhs)))));
            } 
            if (objectToTest instanceof byte[]) {
                return ((_returnReplacementOperatorHotSpot141.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(fieldName, ((byte[])(lhs)), ((byte[])(rhs)))));
            } 
            if (objectToTest instanceof char[]) {
                return ((_returnReplacementOperatorHotSpot142.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(fieldName, ((char[])(lhs)), ((char[])(rhs)))));
            } 
            if (objectToTest instanceof double[]) {
                return ((_returnReplacementOperatorHotSpot143.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(fieldName, ((double[])(lhs)), ((double[])(rhs)))));
            } 
            if (objectToTest instanceof float[]) {
                return ((_returnReplacementOperatorHotSpot144.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(fieldName, ((float[])(lhs)), ((float[])(rhs)))));
            } 
            if (objectToTest instanceof int[]) {
                return ((_returnReplacementOperatorHotSpot145.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(fieldName, ((int[])(lhs)), ((int[])(rhs)))));
            } 
            if (objectToTest instanceof long[]) {
                return ((_returnReplacementOperatorHotSpot146.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(fieldName, ((long[])(lhs)), ((long[])(rhs)))));
            } 
            if (objectToTest instanceof short[]) {
                return ((_returnReplacementOperatorHotSpot147.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(fieldName, ((short[])(lhs)), ((short[])(rhs)))));
            } 
            return ((_returnReplacementOperatorHotSpot148.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (append(fieldName, ((java.lang.Object[])(lhs)), ((java.lang.Object[])(rhs)))));
        } 
        if ((lhs != null) && (lhs.equals(rhs))) {
            return ((_returnReplacementOperatorHotSpot149.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Object>(fieldName) {
            private static final long serialVersionUID = 1L;

            @java.lang.Override
            public java.lang.Object getLeft() {
                return ((_returnReplacementOperatorHotSpot150.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (lhs));
            }

            @java.lang.Override
            public java.lang.Object getRight() {
                return ((_returnReplacementOperatorHotSpot151.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (rhs));
            }
        });
        return ((_returnReplacementOperatorHotSpot152.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final java.lang.Object[] lhs, final java.lang.Object[] rhs) {
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperatorHotSpot153.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Object[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Object[] getLeft() {
                    return ((_returnReplacementOperatorHotSpot154.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (lhs));
                }

                @java.lang.Override
                public java.lang.Object[] getRight() {
                    return ((_returnReplacementOperatorHotSpot155.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (rhs));
                }
            });
        } 
        return ((_returnReplacementOperatorHotSpot156.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (this));
    }

    @java.lang.Override
    public org.apache.commons.lang3.builder.DiffResult build() {
        return ((_returnReplacementOperatorHotSpot173.is(metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL)) ? ( null ) : (new org.apache.commons.lang3.builder.DiffResult(left , right , diffs , style)));
    }

    private static final metamutator.Selector _returnReplacementOperatorHotSpot92 = metamutator.Selector.of(92,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot92");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot93 = metamutator.Selector.of(93,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot93");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot94 = metamutator.Selector.of(94,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot94");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot95 = metamutator.Selector.of(95,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot95");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot96 = metamutator.Selector.of(96,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot96");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot97 = metamutator.Selector.of(97,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot97");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot98 = metamutator.Selector.of(98,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot98");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot99 = metamutator.Selector.of(99,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot99");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot100 = metamutator.Selector.of(100,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot100");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot101 = metamutator.Selector.of(101,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot101");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot102 = metamutator.Selector.of(102,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot102");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot103 = metamutator.Selector.of(103,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot103");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot104 = metamutator.Selector.of(104,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot104");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot105 = metamutator.Selector.of(105,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot105");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot106 = metamutator.Selector.of(106,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot106");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot107 = metamutator.Selector.of(107,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot107");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot108 = metamutator.Selector.of(108,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot108");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot109 = metamutator.Selector.of(109,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot109");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot110 = metamutator.Selector.of(110,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot110");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot111 = metamutator.Selector.of(111,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot111");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot112 = metamutator.Selector.of(112,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot112");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot113 = metamutator.Selector.of(113,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot113");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot114 = metamutator.Selector.of(114,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot114");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot115 = metamutator.Selector.of(115,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot115");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot116 = metamutator.Selector.of(116,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot116");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot117 = metamutator.Selector.of(117,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot117");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot118 = metamutator.Selector.of(118,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot118");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot119 = metamutator.Selector.of(119,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot119");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot120 = metamutator.Selector.of(120,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot120");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot121 = metamutator.Selector.of(121,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot121");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot122 = metamutator.Selector.of(122,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot122");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot123 = metamutator.Selector.of(123,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot123");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot124 = metamutator.Selector.of(124,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot124");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot125 = metamutator.Selector.of(125,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot125");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot126 = metamutator.Selector.of(126,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot126");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot127 = metamutator.Selector.of(127,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot127");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot128 = metamutator.Selector.of(128,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot128");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot129 = metamutator.Selector.of(129,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot129");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot130 = metamutator.Selector.of(130,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot130");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot131 = metamutator.Selector.of(131,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot131");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot132 = metamutator.Selector.of(132,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot132");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot133 = metamutator.Selector.of(133,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot133");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot134 = metamutator.Selector.of(134,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot134");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot135 = metamutator.Selector.of(135,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot135");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot136 = metamutator.Selector.of(136,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot136");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot137 = metamutator.Selector.of(137,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot137");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot138 = metamutator.Selector.of(138,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot138");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot139 = metamutator.Selector.of(139,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot139");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot140 = metamutator.Selector.of(140,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot140");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot141 = metamutator.Selector.of(141,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot141");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot142 = metamutator.Selector.of(142,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot142");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot143 = metamutator.Selector.of(143,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot143");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot144 = metamutator.Selector.of(144,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot144");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot145 = metamutator.Selector.of(145,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot145");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot146 = metamutator.Selector.of(146,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot146");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot147 = metamutator.Selector.of(147,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot147");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot148 = metamutator.Selector.of(148,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot148");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot149 = metamutator.Selector.of(149,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot149");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot150 = metamutator.Selector.of(150,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot150");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot151 = metamutator.Selector.of(151,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot151");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot152 = metamutator.Selector.of(152,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot152");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot153 = metamutator.Selector.of(153,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot153");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot154 = metamutator.Selector.of(154,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot154");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot155 = metamutator.Selector.of(155,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot155");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot156 = metamutator.Selector.of(156,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot156");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot157 = metamutator.Selector.of(157,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot157");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot158 = metamutator.Selector.of(158,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot158");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot159 = metamutator.Selector.of(159,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot159");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot160 = metamutator.Selector.of(160,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot160");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot161 = metamutator.Selector.of(161,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot161");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot162 = metamutator.Selector.of(162,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot162");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot163 = metamutator.Selector.of(163,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot163");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot164 = metamutator.Selector.of(164,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot164");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot165 = metamutator.Selector.of(165,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot165");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot166 = metamutator.Selector.of(166,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot166");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot167 = metamutator.Selector.of(167,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot167");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot168 = metamutator.Selector.of(168,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot168");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot169 = metamutator.Selector.of(169,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot169");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot170 = metamutator.Selector.of(170,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot170");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot171 = metamutator.Selector.of(171,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).id("_returnReplacementOperatorHotSpot171");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot172 = metamutator.Selector.of(172,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot172");

    private static final metamutator.Selector _returnReplacementOperatorHotSpot173 = metamutator.Selector.of(173,new metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT[]{metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.INIT,metamutator.ReturnReplacementOperatorMetaMutator.RETURN_REPLACEMENT_OBJECT.NULL}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperatorHotSpot173");
}

