package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.BYTES_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepForWithByteArrayTest extends AbstractDeepForTest<byte[], Byte> {

    public ArrayUtilsDeepForWithByteArrayTest() {
        super(BYTES_1D);
    }

    @Override
    protected void deepFor(byte[] array, Each<Byte, RuntimeException> each) {

        ArrayUtils.deepFor(array, each);
    }

    @Override
    protected int arrayElementNumber() {

        return BYTES_1D.length;
    }

    @Override
    protected Byte getElementFromCount(byte[] array, int count) {

        return array[count];
    }

    @Override
    protected Byte getElementFromAxis(byte[] array, int[] axis) {

        return array[axis[0]];
    }

    @Override
    protected byte[] emptyArray() {

        return new byte[0];
    }
}
