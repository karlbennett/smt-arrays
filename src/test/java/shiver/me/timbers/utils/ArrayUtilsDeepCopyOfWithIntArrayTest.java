package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.INTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepCopyOfWithIntArrayTest extends AbstractDeepCopyTest<int[]> {

    public ArrayUtilsDeepCopyOfWithIntArrayTest() {
        super(INTS_1D);
    }

    @Override
    protected int[] deepCopyOf(int[] array) {

        return ArrayUtils.deepCopyOf(array);
    }

    @Override
    protected int[] manualCopyOf(int[] array) {

        return new int[]{INTS_1D[0], INTS_1D[1], INTS_1D[2]};
    }

    @Override
    protected void mutateArray(int[] array) {

        array[1] = 99;
    }

    @Override
    protected int[] emptyArray() {

        return new int[0];
    }
}
