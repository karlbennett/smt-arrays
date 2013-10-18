package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.BYTES_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepCopyOfWithByteArrayTest extends AbstractDeepCopyTest<byte[]> {

    public ArrayUtilsDeepCopyOfWithByteArrayTest() {
        super(BYTES_1D);
    }

    @Override
    protected byte[] deepCopyOf(byte[] array) {

        return ArrayUtils.deepCopyOf(array);
    }

    @Override
    protected byte[] manualCopyOf(byte[] array) {

        return new byte[]{BYTES_1D[0], BYTES_1D[1], BYTES_1D[2]};
    }

    @Override
    protected void mutateArray(byte[] array) {

        array[1] = 99;
    }

    @Override
    protected byte[] emptyArray() {

        return new byte[0];
    }
}
