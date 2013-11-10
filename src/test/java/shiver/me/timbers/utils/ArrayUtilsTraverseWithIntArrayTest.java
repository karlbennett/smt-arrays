package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.INTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsTraverseWithIntArrayTest extends AbstractTraverseTest<int[], Integer> {

    public ArrayUtilsTraverseWithIntArrayTest() {
        super(INTS_1D, new int[0], INTS_1D.length);
    }

    @Override
    protected void deepFor(int[] array, Each<Integer, RuntimeException> each) {

        ArrayUtils.traverse(array, each);
    }

    @Override
    protected Integer getElementFromCount(int[] array, int count) {

        return array[count];
    }

    @Override
    protected Integer getElementFromAxis(int[] array, int[] axis) {

        return array[axis[0]];
    }
}
