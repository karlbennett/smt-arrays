package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.BYTES_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsTraverseWithByteArrayTest extends AbstractTraverseTest<byte[], Byte> {

    public ArrayUtilsTraverseWithByteArrayTest() {
        super(BYTES_1D, new byte[0], BYTES_1D.length);
    }

    @Override
    protected void deepFor(byte[] array, Each<Byte, RuntimeException> each) {

        ArrayUtils.traverse(array, each);
    }

    @Override
    protected Byte getElementFromCount(byte[] array, int count) {

        return array[count];
    }

    @Override
    protected Byte getElementFromAxis(byte[] array, int[] axis) {

        return array[axis[0]];
    }
}
