package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.UNEVEN_BYTES_2D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepCopyOfWithUneven2DArrayTest extends AbstractDeepCopyTest<byte[][]> {

    public ArrayUtilsDeepCopyOfWithUneven2DArrayTest() {
        super(UNEVEN_BYTES_2D);
    }

    @Override
    protected byte[][] deepCopyOf(byte[][] array) {

        return ArrayUtils.deepCopyOf(array);
    }

    @Override
    protected byte[][] manualCopyOf(byte[][] array) {

        return new byte[][]{
                {UNEVEN_BYTES_2D[0][0], UNEVEN_BYTES_2D[0][1], UNEVEN_BYTES_2D[0][2]},
                {UNEVEN_BYTES_2D[1][0]},
                {UNEVEN_BYTES_2D[2][0], UNEVEN_BYTES_2D[2][1]},
        };
    }

    @Override
    protected void mutateArray(byte[][] array) {

        array[1][0] = 99;
    }

    @Override
    protected byte[][] emptyArray() {

        return new byte[0][0];
    }
}
