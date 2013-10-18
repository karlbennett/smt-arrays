package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import java.util.List;

import static shiver.me.timbers.Constants.BYTES_1D;
import static shiver.me.timbers.Constants.BYTE_LIST;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsPrimitiveAsListWithByteArrayTest extends AbstractPrimitiveAsListTest<Byte, byte[]> {

    public ArrayUtilsPrimitiveAsListWithByteArrayTest() {
        super(BYTE_LIST, BYTES_1D);
    }

    @Override
    protected List<Byte> primitiveAsList(byte[] array) {

        return ArrayUtils.primitiveAsList(array);
    }
}
