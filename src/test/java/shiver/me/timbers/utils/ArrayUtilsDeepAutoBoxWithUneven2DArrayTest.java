package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.UNEVEN_BYTES_2D;
import static shiver.me.timbers.Constants.UNEVEN_BYTE_OBJECTS_2D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWithUneven2DArrayTest extends AbstractDeepAutoBoxTest<Byte[][], byte[][]> {

    public ArrayUtilsDeepAutoBoxWithUneven2DArrayTest() {
        super(UNEVEN_BYTE_OBJECTS_2D, UNEVEN_BYTES_2D);
    }

    @Override
    protected Byte[][] deepAutoBox(byte[][] array) {

        return ArrayUtils.deepAutoBox(Byte[][].class, array);
    }

    @Override
    protected byte[][] deepAutoUnBox(Byte[][] array) {

        return ArrayUtils.deepAutoBox(byte[][].class, array);
    }

    @Override
    protected Byte[][] emptyBoxedArray() {

        return new Byte[0][];
    }

    @Override
    protected byte[][] emptyArrayToBeAutoBoxed() {

        return new byte[0][];
    }
}
