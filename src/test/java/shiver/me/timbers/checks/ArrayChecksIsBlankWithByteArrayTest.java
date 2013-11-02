package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullTrueTest;

import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayChecks.isBlank;
import static shiver.me.timbers.Constants.BYTES_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_BYTE_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsBlankWithByteArrayTest extends AbstractCheckAndAssertNullTrueTest<byte[]> {

    public ArrayChecksIsBlankWithByteArrayTest() {
        super(NOT_EMPTY_BYTE_ARRAY, BYTES_1D);
    }

    @Override
    protected boolean doCheck(byte[] value) {

        return isBlank(value);
    }

    @Override
    protected void doAssert(String message, byte[] value) {

        assertIsBlank(message, value);
    }
}
