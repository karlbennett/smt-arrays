package shiver.me.timbers;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Test values.
 *
 * @author Karl Bennett
 */
public class Constants {

    Constants() {
    }

    public static final Object[] ARRAY = new Object[0];
    public static final Object NOT_ARRAY = new Object();

    public static final byte[][][] BYTES_3D = {
            {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            },
            {
                    {10, 11, 12},
                    {13, 14, 15},
                    {16, 17, 18}
            },
            {
                    {19, 20, 21},
                    {22, 23, 24},
                    {25, 26, 27}
            }
    };

    public static final byte[][][] UNEVEN_BYTES_3D = {
            {
                    {BYTES_3D[0][0][0]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1]},
                    {BYTES_3D[2][2][0]}
            }
    };

    public static final byte[][] BYTES_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final byte[][] UNEVEN_BYTES_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1]}
    };

    public static final byte[] BYTES_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Byte[][][] BYTE_OBJECTS_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final Byte[][][] UNEVEN_BYTE_OBJECTS_3D = {
            {
                    {BYTES_3D[0][0][0]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1]},
                    {BYTES_3D[2][2][0]}
            }
    };

    public static final Byte[][] BYTE_OBJECTS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final Byte[][] UNEVEN_BYTE_OBJECTS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1]}
    };

    public static final Byte[] BYTE_OBJECTS_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final char[][][] CHARS_3D = {
            {
                    {'a', 'b', 'c'},
                    {'d', 'e', 'f'},
                    {'g', 'h', 'i'}
            },
            {
                    {'j', 'k', 'l'},
                    {'m', 'n', 'o'},
                    {'p', 'q', 'r'}
            },
            {
                    {'s', 't', 'u'},
                    {'v', 'w', 'x'},
                    {'y', 'z', '0'}
            }
    };

    public static final char[][] CHARS_2D = {
            {CHARS_3D[0][0][0], CHARS_3D[0][0][1], CHARS_3D[0][0][2]},
            {CHARS_3D[0][1][0], CHARS_3D[0][1][1], CHARS_3D[0][1][2]},
            {CHARS_3D[0][2][0], CHARS_3D[0][2][1], CHARS_3D[0][2][2]}
    };

    public static final char[] CHARS_1D = {CHARS_3D[0][0][0], CHARS_3D[0][0][1], CHARS_3D[0][0][2]};

    public static final Character[][][] CHARACTER_OBJECTS_3D = {
            {
                    {CHARS_3D[0][0][0], CHARS_3D[0][0][1], CHARS_3D[0][0][2]},
                    {CHARS_3D[0][1][0], CHARS_3D[0][1][1], CHARS_3D[0][1][2]},
                    {CHARS_3D[0][2][0], CHARS_3D[0][2][1], CHARS_3D[0][2][2]}
            },
            {
                    {CHARS_3D[1][0][0], CHARS_3D[1][0][1], CHARS_3D[1][0][2]},
                    {CHARS_3D[1][1][0], CHARS_3D[1][1][1], CHARS_3D[1][1][2]},
                    {CHARS_3D[1][2][0], CHARS_3D[1][2][1], CHARS_3D[1][2][2]}
            },
            {
                    {CHARS_3D[2][0][0], CHARS_3D[2][0][1], CHARS_3D[2][0][2]},
                    {CHARS_3D[2][1][0], CHARS_3D[2][1][1], CHARS_3D[2][1][2]},
                    {CHARS_3D[2][2][0], CHARS_3D[2][2][1], CHARS_3D[2][2][2]}
            }
    };

    public static final Character[][] CHARACTER_OBJECTS_2D = {
            {CHARS_3D[0][0][0], CHARS_3D[0][0][1], CHARS_3D[0][0][2]},
            {CHARS_3D[0][1][0], CHARS_3D[0][1][1], CHARS_3D[0][1][2]},
            {CHARS_3D[0][2][0], CHARS_3D[0][2][1], CHARS_3D[0][2][2]}
    };

    public static final Character[] CHARACTER_OBJECTS_1D = {CHARS_3D[0][0][0], CHARS_3D[0][0][1], CHARS_3D[0][0][2]};

    public static final short[][][] SHORTS_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final short[][] SHORTS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final short[] SHORTS_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Short[][][] SHORT_OBJECTS_3D = {
            {
                    {SHORTS_3D[0][0][0], SHORTS_3D[0][0][1], SHORTS_3D[0][0][2]},
                    {SHORTS_3D[0][1][0], SHORTS_3D[0][1][1], SHORTS_3D[0][1][2]},
                    {SHORTS_3D[0][2][0], SHORTS_3D[0][2][1], SHORTS_3D[0][2][2]}
            },
            {
                    {SHORTS_3D[1][0][0], SHORTS_3D[1][0][1], SHORTS_3D[1][0][2]},
                    {SHORTS_3D[1][1][0], SHORTS_3D[1][1][1], SHORTS_3D[1][1][2]},
                    {SHORTS_3D[1][2][0], SHORTS_3D[1][2][1], SHORTS_3D[1][2][2]}
            },
            {
                    {SHORTS_3D[2][0][0], SHORTS_3D[2][0][1], SHORTS_3D[2][0][2]},
                    {SHORTS_3D[2][1][0], SHORTS_3D[2][1][1], SHORTS_3D[2][1][2]},
                    {SHORTS_3D[2][2][0], SHORTS_3D[2][2][1], SHORTS_3D[2][2][2]}
            }
    };

    public static final Short[][] SHORT_OBJECTS_2D = {
            {SHORTS_3D[0][0][0], SHORTS_3D[0][0][1], SHORTS_3D[0][0][2]},
            {SHORTS_3D[0][1][0], SHORTS_3D[0][1][1], SHORTS_3D[0][1][2]},
            {SHORTS_3D[0][2][0], SHORTS_3D[0][2][1], SHORTS_3D[0][2][2]}
    };

    public static final Short[] SHORT_OBJECTS_1D = {SHORTS_3D[0][0][0], SHORTS_3D[0][0][1], SHORTS_3D[0][0][2]};

    public static final int[][][] INTS_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final int[][] INTS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final int[] INTS_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Integer[][][] INTEGER_OBJECTS_3D = {
            {
                    {INTS_3D[0][0][0], INTS_3D[0][0][1], INTS_3D[0][0][2]},
                    {INTS_3D[0][1][0], INTS_3D[0][1][1], INTS_3D[0][1][2]},
                    {INTS_3D[0][2][0], INTS_3D[0][2][1], INTS_3D[0][2][2]}
            },
            {
                    {INTS_3D[1][0][0], INTS_3D[1][0][1], INTS_3D[1][0][2]},
                    {INTS_3D[1][1][0], INTS_3D[1][1][1], INTS_3D[1][1][2]},
                    {INTS_3D[1][2][0], INTS_3D[1][2][1], INTS_3D[1][2][2]}
            },
            {
                    {INTS_3D[2][0][0], INTS_3D[2][0][1], INTS_3D[2][0][2]},
                    {INTS_3D[2][1][0], INTS_3D[2][1][1], INTS_3D[2][1][2]},
                    {INTS_3D[2][2][0], INTS_3D[2][2][1], INTS_3D[2][2][2]}
            }
    };

    public static final Integer[][] INTEGER_OBJECTS_2D = {
            {INTS_3D[0][0][0], INTS_3D[0][0][1], INTS_3D[0][0][2]},
            {INTS_3D[0][1][0], INTS_3D[0][1][1], INTS_3D[0][1][2]},
            {INTS_3D[0][2][0], INTS_3D[0][2][1], INTS_3D[0][2][2]}
    };

    public static final Integer[] INTEGER_OBJECTS_1D = {INTS_3D[0][0][0], INTS_3D[0][0][1], INTS_3D[0][0][2]};

    public static final long[][][] LONGS_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final long[][] LONGS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final long[] LONGS_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Long[][][] LONG_OBJECTS_3D = {
            {
                    {LONGS_3D[0][0][0], LONGS_3D[0][0][1], LONGS_3D[0][0][2]},
                    {LONGS_3D[0][1][0], LONGS_3D[0][1][1], LONGS_3D[0][1][2]},
                    {LONGS_3D[0][2][0], LONGS_3D[0][2][1], LONGS_3D[0][2][2]}
            },
            {
                    {LONGS_3D[1][0][0], LONGS_3D[1][0][1], LONGS_3D[1][0][2]},
                    {LONGS_3D[1][1][0], LONGS_3D[1][1][1], LONGS_3D[1][1][2]},
                    {LONGS_3D[1][2][0], LONGS_3D[1][2][1], LONGS_3D[1][2][2]}
            },
            {
                    {LONGS_3D[2][0][0], LONGS_3D[2][0][1], LONGS_3D[2][0][2]},
                    {LONGS_3D[2][1][0], LONGS_3D[2][1][1], LONGS_3D[2][1][2]},
                    {LONGS_3D[2][2][0], LONGS_3D[2][2][1], LONGS_3D[2][2][2]}
            }
    };

    public static final Long[][] LONG_OBJECTS_2D = {
            {LONGS_3D[0][0][0], LONGS_3D[0][0][1], LONGS_3D[0][0][2]},
            {LONGS_3D[0][1][0], LONGS_3D[0][1][1], LONGS_3D[0][1][2]},
            {LONGS_3D[0][2][0], LONGS_3D[0][2][1], LONGS_3D[0][2][2]}
    };

    public static final Long[] LONG_OBJECTS_1D = {LONGS_3D[0][0][0], LONGS_3D[0][0][1], LONGS_3D[0][0][2]};

    public static final float[][][] FLOATS_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final float[][] FLOATS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final float[] FLOATS_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Float[][][] FLOAT_OBJECTS_3D = {
            {
                    {FLOATS_3D[0][0][0], FLOATS_3D[0][0][1], FLOATS_3D[0][0][2]},
                    {FLOATS_3D[0][1][0], FLOATS_3D[0][1][1], FLOATS_3D[0][1][2]},
                    {FLOATS_3D[0][2][0], FLOATS_3D[0][2][1], FLOATS_3D[0][2][2]}
            },
            {
                    {FLOATS_3D[1][0][0], FLOATS_3D[1][0][1], FLOATS_3D[1][0][2]},
                    {FLOATS_3D[1][1][0], FLOATS_3D[1][1][1], FLOATS_3D[1][1][2]},
                    {FLOATS_3D[1][2][0], FLOATS_3D[1][2][1], FLOATS_3D[1][2][2]}
            },
            {
                    {FLOATS_3D[2][0][0], FLOATS_3D[2][0][1], FLOATS_3D[2][0][2]},
                    {FLOATS_3D[2][1][0], FLOATS_3D[2][1][1], FLOATS_3D[2][1][2]},
                    {FLOATS_3D[2][2][0], FLOATS_3D[2][2][1], FLOATS_3D[2][2][2]}
            }
    };

    public static final Float[][] FLOAT_OBJECTS_2D = {
            {FLOATS_3D[0][0][0], FLOATS_3D[0][0][1], FLOATS_3D[0][0][2]},
            {FLOATS_3D[0][1][0], FLOATS_3D[0][1][1], FLOATS_3D[0][1][2]},
            {FLOATS_3D[0][2][0], FLOATS_3D[0][2][1], FLOATS_3D[0][2][2]}
    };

    public static final Float[] FLOAT_OBJECTS_1D = {FLOATS_3D[0][0][0], FLOATS_3D[0][0][1], FLOATS_3D[0][0][2]};

    public static final double[][][] DOUBLES_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final double[][] DOUBLES_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final double[] DOUBLES_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Double[][][] DOUBLE_OBJECTS_3D = {
            {
                    {DOUBLES_3D[0][0][0], DOUBLES_3D[0][0][1], DOUBLES_3D[0][0][2]},
                    {DOUBLES_3D[0][1][0], DOUBLES_3D[0][1][1], DOUBLES_3D[0][1][2]},
                    {DOUBLES_3D[0][2][0], DOUBLES_3D[0][2][1], DOUBLES_3D[0][2][2]}
            },
            {
                    {DOUBLES_3D[1][0][0], DOUBLES_3D[1][0][1], DOUBLES_3D[1][0][2]},
                    {DOUBLES_3D[1][1][0], DOUBLES_3D[1][1][1], DOUBLES_3D[1][1][2]},
                    {DOUBLES_3D[1][2][0], DOUBLES_3D[1][2][1], DOUBLES_3D[1][2][2]}
            },
            {
                    {DOUBLES_3D[2][0][0], DOUBLES_3D[2][0][1], DOUBLES_3D[2][0][2]},
                    {DOUBLES_3D[2][1][0], DOUBLES_3D[2][1][1], DOUBLES_3D[2][1][2]},
                    {DOUBLES_3D[2][2][0], DOUBLES_3D[2][2][1], DOUBLES_3D[2][2][2]}
            }
    };

    public static final Double[][] DOUBLE_OBJECTS_2D = {
            {DOUBLES_3D[0][0][0], DOUBLES_3D[0][0][1], DOUBLES_3D[0][0][2]},
            {DOUBLES_3D[0][1][0], DOUBLES_3D[0][1][1], DOUBLES_3D[0][1][2]},
            {DOUBLES_3D[0][2][0], DOUBLES_3D[0][2][1], DOUBLES_3D[0][2][2]}
    };

    public static final Double[] DOUBLE_OBJECTS_1D = {DOUBLES_3D[0][0][0], DOUBLES_3D[0][0][1], DOUBLES_3D[0][0][2]};

    public static final Object[] NOT_BLANK_ARRAY = {new Object(), new Object(), new Object()};

    public static final Object[][] NOT_BLANK_2D_ARRAY = {
            {},
            {new Object(), null},
            {new Object(), new Object()}
    };

    public static final Object[][][] NOT_BLANK_3D_ARRAY = {
            null,
            {
                    null,
                    {new Object()},
                    {new Object(), new Object()}
            },
            {
                    {new Object(), new Object(), new Object()},
                    {new Object(), new Object(), new Object()},
                    {new Object(), new Object(), new Object()}
            },
            null
    };

    public static final Object[] EMPTY_ARRAY = new Object[0];
    public static final Object[] NOT_EMPTY_ARRAY = new Object[3];

    public static final Object[][] EMPTY_2D_ARRAY = new Object[3][0];
    public static final Object[][] NOT_EMPTY_2D_ARRAY = new Object[3][3];

    public static final Object[][][] EMPTY_3D_ARRAY = new Object[3][3][0];
    public static final Object[][][] NOT_EMPTY_3D_ARRAY = new Object[3][3][3];

    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final byte[] NOT_EMPTY_BYTE_ARRAY = new byte[3];

    public static final char[] EMPTY_CHAR_ARRAY = new char[0];
    public static final char[] NOT_EMPTY_CHAR_ARRAY = new char[3];

    public static final short[] EMPTY_SHORT_ARRAY = new short[0];
    public static final short[] NOT_EMPTY_SHORT_ARRAY = new short[3];

    public static final int[] EMPTY_INT_ARRAY = new int[0];
    public static final int[] NOT_EMPTY_INT_ARRAY = new int[3];

    public static final long[] EMPTY_LONG_ARRAY = new long[0];
    public static final long[] NOT_EMPTY_LONG_ARRAY = new long[3];

    public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
    public static final float[] NOT_EMPTY_FLOAT_ARRAY = new float[3];

    public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    public static final double[] NOT_EMPTY_DOUBLE_ARRAY = new double[3];

    public static final List<Byte> BYTE_LIST = asList(BYTES_1D[0], BYTES_1D[1], BYTES_1D[2]);

    public static final List<Character> CHARACTER_LIST = asList(CHARS_1D[0], CHARS_1D[1], CHARS_1D[2]);

    public static final List<Short> SHORT_LIST = asList(SHORTS_1D[0], SHORTS_1D[1], SHORTS_1D[2]);

    public static final List<Integer> INTEGER_LIST = asList(INTS_1D[0], INTS_1D[1], INTS_1D[2]);

    public static final List<Long> LONG_LIST = asList(LONGS_1D[0], LONGS_1D[1], LONGS_1D[2]);

    public static final List<Float> FLOAT_LIST = asList(FLOATS_1D[0], FLOATS_1D[1], FLOATS_1D[2]);

    public static final List<Double> DOUBLE_LIST = asList(DOUBLES_1D[0], DOUBLES_1D[1], DOUBLES_1D[2]);
}
