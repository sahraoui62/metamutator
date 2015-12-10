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
            return ((_returnReplacementOperator92.is("NULL")) ? ( null ) : (this));
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
        return ((_returnReplacementOperator93.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final boolean[] lhs, final boolean[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator94.is("NULL")) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Boolean[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Boolean[] getLeft() {
                    return ((_returnReplacementOperator95.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Boolean[] getRight() {
                    return ((_returnReplacementOperator96.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator97.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final byte lhs, final byte rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator98.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Byte>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Byte getLeft() {
                    return ((_returnReplacementOperator99.is("NULL")) ? ( null ) : (java.lang.Byte.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Byte getRight() {
                    return ((_returnReplacementOperator100.is("NULL")) ? ( null ) : (java.lang.Byte.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator101.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final byte[] lhs, final byte[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator102.is("NULL")) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Byte[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Byte[] getLeft() {
                    return ((_returnReplacementOperator103.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Byte[] getRight() {
                    return ((_returnReplacementOperator104.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator105.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final char lhs, final char rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator106.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Character>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Character getLeft() {
                    return ((_returnReplacementOperator107.is("NULL")) ? ( null ) : (java.lang.Character.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Character getRight() {
                    return ((_returnReplacementOperator108.is("NULL")) ? ( null ) : (java.lang.Character.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator109.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final char[] lhs, final char[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator110.is("NULL")) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Character[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Character[] getLeft() {
                    return ((_returnReplacementOperator111.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Character[] getRight() {
                    return ((_returnReplacementOperator112.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator113.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final double lhs, final double rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator114.is("NULL")) ? ( null ) : (this));
        } 
        if ((java.lang.Double.doubleToLongBits(lhs)) != (java.lang.Double.doubleToLongBits(rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Double>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Double getLeft() {
                    return ((_returnReplacementOperator115.is("NULL")) ? ( null ) : (java.lang.Double.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Double getRight() {
                    return ((_returnReplacementOperator116.is("NULL")) ? ( null ) : (java.lang.Double.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator117.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final double[] lhs, final double[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator118.is("NULL")) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Double[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Double[] getLeft() {
                    return ((_returnReplacementOperator119.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Double[] getRight() {
                    return ((_returnReplacementOperator120.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator121.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final float lhs, final float rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator122.is("NULL")) ? ( null ) : (this));
        } 
        if ((java.lang.Float.floatToIntBits(lhs)) != (java.lang.Float.floatToIntBits(rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Float>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Float getLeft() {
                    return ((_returnReplacementOperator123.is("NULL")) ? ( null ) : (java.lang.Float.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Float getRight() {
                    return ((_returnReplacementOperator124.is("NULL")) ? ( null ) : (java.lang.Float.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator125.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final float[] lhs, final float[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator126.is("NULL")) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Float[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Float[] getLeft() {
                    return ((_returnReplacementOperator127.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Float[] getRight() {
                    return ((_returnReplacementOperator128.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator129.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final int lhs, final int rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator130.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Integer>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Integer getLeft() {
                    return ((_returnReplacementOperator131.is("NULL")) ? ( null ) : (java.lang.Integer.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Integer getRight() {
                    return ((_returnReplacementOperator132.is("NULL")) ? ( null ) : (java.lang.Integer.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator133.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final int[] lhs, final int[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator134.is("NULL")) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Integer[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Integer[] getLeft() {
                    return ((_returnReplacementOperator135.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Integer[] getRight() {
                    return ((_returnReplacementOperator136.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator137.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final long lhs, final long rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator157.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Long>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Long getLeft() {
                    return ((_returnReplacementOperator158.is("NULL")) ? ( null ) : (java.lang.Long.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Long getRight() {
                    return ((_returnReplacementOperator159.is("NULL")) ? ( null ) : (java.lang.Long.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator160.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final long[] lhs, final long[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator161.is("NULL")) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Long[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Long[] getLeft() {
                    return ((_returnReplacementOperator162.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Long[] getRight() {
                    return ((_returnReplacementOperator163.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator164.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final short lhs, final short rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator165.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs != rhs) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Short>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Short getLeft() {
                    return ((_returnReplacementOperator166.is("NULL")) ? ( null ) : (java.lang.Short.valueOf(lhs)));
                }

                @java.lang.Override
                public java.lang.Short getRight() {
                    return ((_returnReplacementOperator167.is("NULL")) ? ( null ) : (java.lang.Short.valueOf(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator168.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final short[] lhs, final short[] rhs) {
        if (fieldName == null) {
            throw new java.lang.IllegalArgumentException("Field name cannot be null");
        } 
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator169.is("NULL")) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Short[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Short[] getLeft() {
                    return ((_returnReplacementOperator170.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(lhs)));
                }

                @java.lang.Override
                public java.lang.Short[] getRight() {
                    return ((_returnReplacementOperator171.is("NULL")) ? ( null ) : (org.apache.commons.lang3.ArrayUtils.toObject(rhs)));
                }
            });
        } 
        return ((_returnReplacementOperator172.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final java.lang.Object lhs, final java.lang.Object rhs) {
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator138.is("NULL")) ? ( null ) : (this));
        } 
        if (lhs == rhs) {
            return ((_returnReplacementOperator139.is("NULL")) ? ( null ) : (this));
        } 
        java.lang.Object objectToTest;
        if (lhs != null) {
            objectToTest = lhs;
        } else {
            objectToTest = rhs;
        }
        if (objectToTest.getClass().isArray()) {
            if (objectToTest instanceof boolean[]) {
                return ((_returnReplacementOperator140.is("NULL")) ? ( null ) : (append(fieldName, ((boolean[])(lhs)), ((boolean[])(rhs)))));
            } 
            if (objectToTest instanceof byte[]) {
                return ((_returnReplacementOperator141.is("NULL")) ? ( null ) : (append(fieldName, ((byte[])(lhs)), ((byte[])(rhs)))));
            } 
            if (objectToTest instanceof char[]) {
                return ((_returnReplacementOperator142.is("NULL")) ? ( null ) : (append(fieldName, ((char[])(lhs)), ((char[])(rhs)))));
            } 
            if (objectToTest instanceof double[]) {
                return ((_returnReplacementOperator143.is("NULL")) ? ( null ) : (append(fieldName, ((double[])(lhs)), ((double[])(rhs)))));
            } 
            if (objectToTest instanceof float[]) {
                return ((_returnReplacementOperator144.is("NULL")) ? ( null ) : (append(fieldName, ((float[])(lhs)), ((float[])(rhs)))));
            } 
            if (objectToTest instanceof int[]) {
                return ((_returnReplacementOperator145.is("NULL")) ? ( null ) : (append(fieldName, ((int[])(lhs)), ((int[])(rhs)))));
            } 
            if (objectToTest instanceof long[]) {
                return ((_returnReplacementOperator146.is("NULL")) ? ( null ) : (append(fieldName, ((long[])(lhs)), ((long[])(rhs)))));
            } 
            if (objectToTest instanceof short[]) {
                return ((_returnReplacementOperator147.is("NULL")) ? ( null ) : (append(fieldName, ((short[])(lhs)), ((short[])(rhs)))));
            } 
            return ((_returnReplacementOperator148.is("NULL")) ? ( null ) : (append(fieldName, ((java.lang.Object[])(lhs)), ((java.lang.Object[])(rhs)))));
        } 
        if ((lhs != null) && (lhs.equals(rhs))) {
            return ((_returnReplacementOperator149.is("NULL")) ? ( null ) : (this));
        } 
        diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Object>(fieldName) {
            private static final long serialVersionUID = 1L;

            @java.lang.Override
            public java.lang.Object getLeft() {
                return ((_returnReplacementOperator150.is("NULL")) ? ( null ) : (lhs));
            }

            @java.lang.Override
            public java.lang.Object getRight() {
                return ((_returnReplacementOperator151.is("NULL")) ? ( null ) : (rhs));
            }
        });
        return ((_returnReplacementOperator152.is("NULL")) ? ( null ) : (this));
    }

    public org.apache.commons.lang3.builder.DiffBuilder append(final java.lang.String fieldName, final java.lang.Object[] lhs, final java.lang.Object[] rhs) {
        if (objectsTriviallyEqual) {
            return ((_returnReplacementOperator153.is("NULL")) ? ( null ) : (this));
        } 
        if (!(java.util.Arrays.equals(lhs, rhs))) {
            diffs.add(new org.apache.commons.lang3.builder.Diff<java.lang.Object[]>(fieldName) {
                private static final long serialVersionUID = 1L;

                @java.lang.Override
                public java.lang.Object[] getLeft() {
                    return ((_returnReplacementOperator154.is("NULL")) ? ( null ) : (lhs));
                }

                @java.lang.Override
                public java.lang.Object[] getRight() {
                    return ((_returnReplacementOperator155.is("NULL")) ? ( null ) : (rhs));
                }
            });
        } 
        return ((_returnReplacementOperator156.is("NULL")) ? ( null ) : (this));
    }

    @java.lang.Override
    public org.apache.commons.lang3.builder.DiffResult build() {
        return ((_returnReplacementOperator173.is("NULL")) ? ( null ) : (new org.apache.commons.lang3.builder.DiffResult(left , right , diffs , style)));
    }

    private static final metamutator.Selector _returnReplacementOperator92 = metamutator.Selector.of(92,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator92");

    private static final metamutator.Selector _returnReplacementOperator93 = metamutator.Selector.of(93,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator93");

    private static final metamutator.Selector _returnReplacementOperator94 = metamutator.Selector.of(94,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator94");

    private static final metamutator.Selector _returnReplacementOperator95 = metamutator.Selector.of(95,new String[]{"INIT","NULL"}).id("_returnReplacementOperator95");

    private static final metamutator.Selector _returnReplacementOperator96 = metamutator.Selector.of(96,new String[]{"INIT","NULL"}).id("_returnReplacementOperator96");

    private static final metamutator.Selector _returnReplacementOperator97 = metamutator.Selector.of(97,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator97");

    private static final metamutator.Selector _returnReplacementOperator98 = metamutator.Selector.of(98,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator98");

    private static final metamutator.Selector _returnReplacementOperator99 = metamutator.Selector.of(99,new String[]{"INIT","NULL"}).id("_returnReplacementOperator99");

    private static final metamutator.Selector _returnReplacementOperator100 = metamutator.Selector.of(100,new String[]{"INIT","NULL"}).id("_returnReplacementOperator100");

    private static final metamutator.Selector _returnReplacementOperator101 = metamutator.Selector.of(101,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator101");

    private static final metamutator.Selector _returnReplacementOperator102 = metamutator.Selector.of(102,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator102");

    private static final metamutator.Selector _returnReplacementOperator103 = metamutator.Selector.of(103,new String[]{"INIT","NULL"}).id("_returnReplacementOperator103");

    private static final metamutator.Selector _returnReplacementOperator104 = metamutator.Selector.of(104,new String[]{"INIT","NULL"}).id("_returnReplacementOperator104");

    private static final metamutator.Selector _returnReplacementOperator105 = metamutator.Selector.of(105,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator105");

    private static final metamutator.Selector _returnReplacementOperator106 = metamutator.Selector.of(106,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator106");

    private static final metamutator.Selector _returnReplacementOperator107 = metamutator.Selector.of(107,new String[]{"INIT","NULL"}).id("_returnReplacementOperator107");

    private static final metamutator.Selector _returnReplacementOperator108 = metamutator.Selector.of(108,new String[]{"INIT","NULL"}).id("_returnReplacementOperator108");

    private static final metamutator.Selector _returnReplacementOperator109 = metamutator.Selector.of(109,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator109");

    private static final metamutator.Selector _returnReplacementOperator110 = metamutator.Selector.of(110,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator110");

    private static final metamutator.Selector _returnReplacementOperator111 = metamutator.Selector.of(111,new String[]{"INIT","NULL"}).id("_returnReplacementOperator111");

    private static final metamutator.Selector _returnReplacementOperator112 = metamutator.Selector.of(112,new String[]{"INIT","NULL"}).id("_returnReplacementOperator112");

    private static final metamutator.Selector _returnReplacementOperator113 = metamutator.Selector.of(113,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator113");

    private static final metamutator.Selector _returnReplacementOperator114 = metamutator.Selector.of(114,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator114");

    private static final metamutator.Selector _returnReplacementOperator115 = metamutator.Selector.of(115,new String[]{"INIT","NULL"}).id("_returnReplacementOperator115");

    private static final metamutator.Selector _returnReplacementOperator116 = metamutator.Selector.of(116,new String[]{"INIT","NULL"}).id("_returnReplacementOperator116");

    private static final metamutator.Selector _returnReplacementOperator117 = metamutator.Selector.of(117,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator117");

    private static final metamutator.Selector _returnReplacementOperator118 = metamutator.Selector.of(118,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator118");

    private static final metamutator.Selector _returnReplacementOperator119 = metamutator.Selector.of(119,new String[]{"INIT","NULL"}).id("_returnReplacementOperator119");

    private static final metamutator.Selector _returnReplacementOperator120 = metamutator.Selector.of(120,new String[]{"INIT","NULL"}).id("_returnReplacementOperator120");

    private static final metamutator.Selector _returnReplacementOperator121 = metamutator.Selector.of(121,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator121");

    private static final metamutator.Selector _returnReplacementOperator122 = metamutator.Selector.of(122,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator122");

    private static final metamutator.Selector _returnReplacementOperator123 = metamutator.Selector.of(123,new String[]{"INIT","NULL"}).id("_returnReplacementOperator123");

    private static final metamutator.Selector _returnReplacementOperator124 = metamutator.Selector.of(124,new String[]{"INIT","NULL"}).id("_returnReplacementOperator124");

    private static final metamutator.Selector _returnReplacementOperator125 = metamutator.Selector.of(125,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator125");

    private static final metamutator.Selector _returnReplacementOperator126 = metamutator.Selector.of(126,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator126");

    private static final metamutator.Selector _returnReplacementOperator127 = metamutator.Selector.of(127,new String[]{"INIT","NULL"}).id("_returnReplacementOperator127");

    private static final metamutator.Selector _returnReplacementOperator128 = metamutator.Selector.of(128,new String[]{"INIT","NULL"}).id("_returnReplacementOperator128");

    private static final metamutator.Selector _returnReplacementOperator129 = metamutator.Selector.of(129,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator129");

    private static final metamutator.Selector _returnReplacementOperator130 = metamutator.Selector.of(130,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator130");

    private static final metamutator.Selector _returnReplacementOperator131 = metamutator.Selector.of(131,new String[]{"INIT","NULL"}).id("_returnReplacementOperator131");

    private static final metamutator.Selector _returnReplacementOperator132 = metamutator.Selector.of(132,new String[]{"INIT","NULL"}).id("_returnReplacementOperator132");

    private static final metamutator.Selector _returnReplacementOperator133 = metamutator.Selector.of(133,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator133");

    private static final metamutator.Selector _returnReplacementOperator134 = metamutator.Selector.of(134,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator134");

    private static final metamutator.Selector _returnReplacementOperator135 = metamutator.Selector.of(135,new String[]{"INIT","NULL"}).id("_returnReplacementOperator135");

    private static final metamutator.Selector _returnReplacementOperator136 = metamutator.Selector.of(136,new String[]{"INIT","NULL"}).id("_returnReplacementOperator136");

    private static final metamutator.Selector _returnReplacementOperator137 = metamutator.Selector.of(137,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator137");

    private static final metamutator.Selector _returnReplacementOperator138 = metamutator.Selector.of(138,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator138");

    private static final metamutator.Selector _returnReplacementOperator139 = metamutator.Selector.of(139,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator139");

    private static final metamutator.Selector _returnReplacementOperator140 = metamutator.Selector.of(140,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator140");

    private static final metamutator.Selector _returnReplacementOperator141 = metamutator.Selector.of(141,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator141");

    private static final metamutator.Selector _returnReplacementOperator142 = metamutator.Selector.of(142,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator142");

    private static final metamutator.Selector _returnReplacementOperator143 = metamutator.Selector.of(143,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator143");

    private static final metamutator.Selector _returnReplacementOperator144 = metamutator.Selector.of(144,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator144");

    private static final metamutator.Selector _returnReplacementOperator145 = metamutator.Selector.of(145,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator145");

    private static final metamutator.Selector _returnReplacementOperator146 = metamutator.Selector.of(146,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator146");

    private static final metamutator.Selector _returnReplacementOperator147 = metamutator.Selector.of(147,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator147");

    private static final metamutator.Selector _returnReplacementOperator148 = metamutator.Selector.of(148,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator148");

    private static final metamutator.Selector _returnReplacementOperator149 = metamutator.Selector.of(149,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator149");

    private static final metamutator.Selector _returnReplacementOperator150 = metamutator.Selector.of(150,new String[]{"INIT","NULL"}).id("_returnReplacementOperator150");

    private static final metamutator.Selector _returnReplacementOperator151 = metamutator.Selector.of(151,new String[]{"INIT","NULL"}).id("_returnReplacementOperator151");

    private static final metamutator.Selector _returnReplacementOperator152 = metamutator.Selector.of(152,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator152");

    private static final metamutator.Selector _returnReplacementOperator153 = metamutator.Selector.of(153,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator153");

    private static final metamutator.Selector _returnReplacementOperator154 = metamutator.Selector.of(154,new String[]{"INIT","NULL"}).id("_returnReplacementOperator154");

    private static final metamutator.Selector _returnReplacementOperator155 = metamutator.Selector.of(155,new String[]{"INIT","NULL"}).id("_returnReplacementOperator155");

    private static final metamutator.Selector _returnReplacementOperator156 = metamutator.Selector.of(156,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator156");

    private static final metamutator.Selector _returnReplacementOperator157 = metamutator.Selector.of(157,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator157");

    private static final metamutator.Selector _returnReplacementOperator158 = metamutator.Selector.of(158,new String[]{"INIT","NULL"}).id("_returnReplacementOperator158");

    private static final metamutator.Selector _returnReplacementOperator159 = metamutator.Selector.of(159,new String[]{"INIT","NULL"}).id("_returnReplacementOperator159");

    private static final metamutator.Selector _returnReplacementOperator160 = metamutator.Selector.of(160,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator160");

    private static final metamutator.Selector _returnReplacementOperator161 = metamutator.Selector.of(161,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator161");

    private static final metamutator.Selector _returnReplacementOperator162 = metamutator.Selector.of(162,new String[]{"INIT","NULL"}).id("_returnReplacementOperator162");

    private static final metamutator.Selector _returnReplacementOperator163 = metamutator.Selector.of(163,new String[]{"INIT","NULL"}).id("_returnReplacementOperator163");

    private static final metamutator.Selector _returnReplacementOperator164 = metamutator.Selector.of(164,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator164");

    private static final metamutator.Selector _returnReplacementOperator165 = metamutator.Selector.of(165,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator165");

    private static final metamutator.Selector _returnReplacementOperator166 = metamutator.Selector.of(166,new String[]{"INIT","NULL"}).id("_returnReplacementOperator166");

    private static final metamutator.Selector _returnReplacementOperator167 = metamutator.Selector.of(167,new String[]{"INIT","NULL"}).id("_returnReplacementOperator167");

    private static final metamutator.Selector _returnReplacementOperator168 = metamutator.Selector.of(168,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator168");

    private static final metamutator.Selector _returnReplacementOperator169 = metamutator.Selector.of(169,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator169");

    private static final metamutator.Selector _returnReplacementOperator170 = metamutator.Selector.of(170,new String[]{"INIT","NULL"}).id("_returnReplacementOperator170");

    private static final metamutator.Selector _returnReplacementOperator171 = metamutator.Selector.of(171,new String[]{"INIT","NULL"}).id("_returnReplacementOperator171");

    private static final metamutator.Selector _returnReplacementOperator172 = metamutator.Selector.of(172,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator172");

    private static final metamutator.Selector _returnReplacementOperator173 = metamutator.Selector.of(173,new String[]{"INIT","NULL"}).in(org.apache.commons.lang3.builder.DiffBuilder.class).id("_returnReplacementOperator173");
}

