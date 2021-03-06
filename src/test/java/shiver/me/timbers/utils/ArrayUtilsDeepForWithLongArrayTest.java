package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.LONGS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepForWithLongArrayTest extends AbstractDeepForTest<long[], Long> {

    public ArrayUtilsDeepForWithLongArrayTest() {
        super(LONGS_1D, new long[0], LONGS_1D.length);
    }

    @Override
    protected void deepFor(long[] array, Each<Long, RuntimeException> each) {

        ArrayUtils.deepFor(array, each);
    }

    @Override
    protected Long getElementFromCount(long[] array, int count) {

        return array[count];
    }

    @Override
    protected Long getElementFromAxis(long[] array, int[] axis) {

        return array[axis[0]];
    }
}
