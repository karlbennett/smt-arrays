package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;
import shiver.me.timbers.Asserts;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.NOT_BLANK_2D_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsTraverseWith2DArrayTest extends AbstractTraverseTest<Object[][], Object> {

    private static final Object[] COUNT_ARRAY = {
            NOT_BLANK_2D_ARRAY[0],
            NOT_BLANK_2D_ARRAY[1][0],
            NOT_BLANK_2D_ARRAY[1][1],
            NOT_BLANK_2D_ARRAY[2][0],
            NOT_BLANK_2D_ARRAY[2][1]
    };

    public ArrayUtilsTraverseWith2DArrayTest() {
        super(NOT_BLANK_2D_ARRAY, new Object[0][], 5);
    }

    @Override
    protected void deepFor(Object[][] array, Each<Object, RuntimeException> each) {

        ArrayUtils.traverse(array, each);
    }

    @Override
    protected Object getElementFromCount(Object[][] array, int count) {

        return COUNT_ARRAY[count];
    }

    @Override
    protected Object getElementFromAxis(Object[][] array, int[] axis) {

        if (Asserts.isNull(array[axis[0]]) || 0 == array[axis[0]].length) {

            return array[axis[0]];
        }

        return array[axis[0]][axis[1]];
    }
}
