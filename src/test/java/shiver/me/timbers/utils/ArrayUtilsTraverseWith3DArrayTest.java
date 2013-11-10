package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Asserts.isNull;
import static shiver.me.timbers.Constants.NOT_BLANK_3D_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsTraverseWith3DArrayTest extends AbstractTraverseTest<Object[][][], Object> {

    private static final Object[] COUNT_ARRAY = {
            NOT_BLANK_3D_ARRAY[0],
            NOT_BLANK_3D_ARRAY[1][0],
            NOT_BLANK_3D_ARRAY[1][1][0],
            NOT_BLANK_3D_ARRAY[1][2][0],
            NOT_BLANK_3D_ARRAY[1][2][1],
            NOT_BLANK_3D_ARRAY[2][0][0],
            NOT_BLANK_3D_ARRAY[2][0][1],
            NOT_BLANK_3D_ARRAY[2][0][2],
            NOT_BLANK_3D_ARRAY[2][1][0],
            NOT_BLANK_3D_ARRAY[2][1][1],
            NOT_BLANK_3D_ARRAY[2][1][2],
            NOT_BLANK_3D_ARRAY[2][2][0],
            NOT_BLANK_3D_ARRAY[2][2][1],
            NOT_BLANK_3D_ARRAY[2][2][2],
            NOT_BLANK_3D_ARRAY[3]
    };

    public ArrayUtilsTraverseWith3DArrayTest() {
        super(NOT_BLANK_3D_ARRAY, new Object[0][][], 15);
    }

    @Override
    protected void deepFor(Object[][][] array, Each<Object, RuntimeException> each) {

        ArrayUtils.traverse(array, each);
    }

    @Override
    protected Object getElementFromCount(Object[][][] array, int count) {

        return COUNT_ARRAY[count];
    }

    @Override
    protected Object getElementFromAxis(Object[][][] array, int[] axis) {

        if (isNull(array[axis[0]]) || 0 == array[axis[0]].length) {

            return array[axis[0]];
        }

        if (isNull(array[axis[0]][axis[1]]) || 0 == array[axis[0]][axis[1]].length) {

            return array[axis[0]][axis[1]];
        }

        return array[axis[0]][axis[1]][axis[2]];
    }
}
