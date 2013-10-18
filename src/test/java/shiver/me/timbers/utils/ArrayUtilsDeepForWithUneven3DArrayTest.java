package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.UNEVEN_BYTES_3D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepForWithUneven3DArrayTest extends AbstractDeepForTest<byte[][][], Byte> {

    private static final int[][] COUNT_MATRIX = {
            {1, 1, 0},
            {1, 2, 0},
            {1, 2, 1},
            {2, 0, 0},
            {2, 0, 1},
            {2, 0, 2},
            {2, 1, 0},
            {2, 1, 1},
            {2, 1, 2},
            {2, 2, 0},
            {2, 2, 1},
            {2, 2, 2},
    };

    public ArrayUtilsDeepForWithUneven3DArrayTest() {
        super(UNEVEN_BYTES_3D);
    }

    @Override
    protected void deepFor(byte[][][] array, Each<Byte, RuntimeException> each) {

        ArrayUtils.deepFor(array, each);
    }

    @Override
    protected int arrayElementNumber() {

        return 21;
    }

    @Override
    protected Byte getElementFromCount(byte[][][] array, int count) {

        return array[COUNT_MATRIX[count][0]][COUNT_MATRIX[count][1]][COUNT_MATRIX[count][2]];
    }

    @Override
    protected Byte getElementFromAxis(byte[][][] array, int[] axis) {

        return array[axis[0]][axis[1]][axis[2]];
    }
}
