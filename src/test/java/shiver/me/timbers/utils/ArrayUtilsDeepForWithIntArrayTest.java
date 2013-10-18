package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.INTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepForWithIntArrayTest extends AbstractDeepForTest<int[], Integer> {

    public ArrayUtilsDeepForWithIntArrayTest() {
        super(INTS_1D);
    }

    @Override
    protected void deepFor(int[] array, Each<Integer, RuntimeException> each) {

        ArrayUtils.deepFor(array, each);
    }

    @Override
    protected int arrayElementNumber() {

        return INTS_1D.length;
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
