package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.NOT_BLANK_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsTraverseTest extends AbstractTraverseTest<Object[], Object> {

    public ArrayUtilsTraverseTest() {
        super(NOT_BLANK_ARRAY, new Object[0], NOT_BLANK_ARRAY.length);
    }

    @Override
    protected void deepFor(Object[] array, Each<Object, RuntimeException> each) {

        ArrayUtils.traverse(array, each);
    }

    @Override
    protected Object getElementFromCount(Object[] array, int count) {

        return array[count];
    }

    @Override
    protected Object getElementFromAxis(Object[] array, int[] axis) {

        return array[axis[0]];
    }
}
