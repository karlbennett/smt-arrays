package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.LONGS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepCopyOfWithLongArrayTest extends AbstractDeepCopyTest<long[]> {

    public ArrayUtilsDeepCopyOfWithLongArrayTest() {
        super(LONGS_1D);
    }

    @Override
    protected long[] deepCopyOf(long[] array) {

        return ArrayUtils.deepCopyOf(array);
    }

    @Override
    protected long[] manualCopyOf(long[] array) {

        return new long[]{LONGS_1D[0], LONGS_1D[1], LONGS_1D[2]};
    }

    @Override
    protected void mutateArray(long[] array) {

        array[1] = 99;
    }

    @Override
    protected long[] emptyArray() {

        return new long[0];
    }
}
