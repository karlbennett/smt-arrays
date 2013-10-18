package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.BYTES_3D;
import static shiver.me.timbers.Constants.BYTE_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith3DByteArrayTest extends AbstractDeepAutoBoxTest<Byte[][][], byte[][][]> {

    public ArrayUtilsDeepAutoBoxWith3DByteArrayTest() {
        super(BYTE_OBJECTS_3D, BYTES_3D);
    }

    @Override
    protected Byte[][][] deepAutoBox(byte[][][] array) {

        return ArrayUtils.deepAutoBox(Byte[][][].class, array);
    }

    @Override
    protected byte[][][] deepAutoUnBox(Byte[][][] array) {

        return ArrayUtils.deepAutoBox(byte[][][].class, array);
    }

    @Override
    protected Byte[][][] emptyBoxedArray() {

        return new Byte[0][][];
    }

    @Override
    protected byte[][][] emptyArrayToBeAutoBoxed() {

        return new byte[0][][];
    }
}
