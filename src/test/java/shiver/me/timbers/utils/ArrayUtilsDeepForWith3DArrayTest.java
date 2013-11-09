package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.NOT_BLANK_3D_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepForWith3DArrayTest extends AbstractDeepForTest<Object[][][], Object> {

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

    public ArrayUtilsDeepForWith3DArrayTest() {
        super(NOT_BLANK_3D_ARRAY, new Object[0][][], 12);
    }

    @Override
    protected void deepFor(Object[][][] array, Each<Object, RuntimeException> each) {

        ArrayUtils.deepFor(array, each);
    }

    @Override
    protected Object getElementFromCount(Object[][][] array, int count) {

        return array[COUNT_MATRIX[count][0]][COUNT_MATRIX[count][1]][COUNT_MATRIX[count][2]];
    }

    @Override
    protected Object getElementFromAxis(Object[][][] array, int[] axis) {

        return array[axis[0]][axis[1]][axis[2]];
    }
}
