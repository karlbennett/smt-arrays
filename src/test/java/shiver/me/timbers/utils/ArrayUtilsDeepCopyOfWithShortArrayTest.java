package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.BYTES_1D;
import static shiver.me.timbers.Constants.SHORTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepCopyOfWithShortArrayTest extends AbstractDeepCopyTest<short[]> {

    public ArrayUtilsDeepCopyOfWithShortArrayTest() {
        super(SHORTS_1D);
    }

    @Override
    protected short[] deepCopyOf(short[] array) {

        return ArrayUtils.deepCopyOf(array);
    }

    @Override
    protected short[] manualCopyOf(short[] array) {

        return new short[]{BYTES_1D[0], BYTES_1D[1], BYTES_1D[2]};
    }

    @Override
    protected void mutateArray(short[] array) {

        array[1] = 99;
    }

    @Override
    protected short[] emptyArray() {

        return new short[0];
    }
}
