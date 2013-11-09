package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.SHORTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepForWithShortArrayTest extends AbstractDeepForTest<short[], Short> {

    public ArrayUtilsDeepForWithShortArrayTest() {
        super(SHORTS_1D, new short[0], SHORTS_1D.length);
    }

    @Override
    protected void deepFor(short[] array, Each<Short, RuntimeException> each) {

        ArrayUtils.deepFor(array, each);
    }

    @Override
    protected Short getElementFromCount(short[] array, int count) {

        return array[count];
    }

    @Override
    protected Short getElementFromAxis(short[] array, int[] axis) {

        return array[axis[0]];
    }
}
