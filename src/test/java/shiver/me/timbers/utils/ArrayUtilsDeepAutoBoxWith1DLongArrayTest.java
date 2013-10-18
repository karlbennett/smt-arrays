package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.LONGS_1D;
import static shiver.me.timbers.Constants.LONG_OBJECTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith1DLongArrayTest extends AbstractDeepAutoBoxTest<Long[], long[]> {

    public ArrayUtilsDeepAutoBoxWith1DLongArrayTest() {
        super(LONG_OBJECTS_1D, LONGS_1D);
    }

    @Override
    protected Long[] deepAutoBox(long[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected long[] deepAutoUnBox(Long[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected Long[] emptyBoxedArray() {

        return new Long[0];
    }

    @Override
    protected long[] emptyArrayToBeAutoBoxed() {

        return new long[0];
    }
}
