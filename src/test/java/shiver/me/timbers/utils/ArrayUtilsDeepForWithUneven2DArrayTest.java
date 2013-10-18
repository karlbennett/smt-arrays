package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.UNEVEN_BYTES_2D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepForWithUneven2DArrayTest extends AbstractDeepForTest<byte[][], Byte> {

    private static final int[][] COUNT_MATRIX = {
            {0, 0},
            {0, 1},
            {0, 2},
            {1, 0},
            {2, 0},
            {2, 1}
    };

    public ArrayUtilsDeepForWithUneven2DArrayTest() {
        super(UNEVEN_BYTES_2D);
    }

    @Override
    protected void deepFor(byte[][] array, Each<Byte, RuntimeException> each) {

        ArrayUtils.deepFor(array, each);
    }

    @Override
    protected int arrayElementNumber() {

        return 6;
    }

    @Override
    protected Byte getElementFromCount(byte[][] array, int count) {

        return array[COUNT_MATRIX[count][0]][COUNT_MATRIX[count][1]];
    }

    @Override
    protected Byte getElementFromAxis(byte[][] array, int[] axis) {

        return array[axis[0]][axis[1]];
    }
}
