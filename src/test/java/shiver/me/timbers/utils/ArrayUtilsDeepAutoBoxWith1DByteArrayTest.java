package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.BYTES_1D;
import static shiver.me.timbers.Constants.BYTE_OBJECTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith1DByteArrayTest extends AbstractDeepAutoBoxTest<Byte[], byte[]> {

    public ArrayUtilsDeepAutoBoxWith1DByteArrayTest() {
        super(BYTE_OBJECTS_1D, BYTES_1D);
    }

    @Override
    protected Byte[] deepAutoBox(byte[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected byte[] deepAutoUnBox(Byte[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected Byte[] emptyBoxedArray() {

        return new Byte[0];
    }

    @Override
    protected byte[] emptyArrayToBeAutoBoxed() {

        return new byte[0];
    }
}
