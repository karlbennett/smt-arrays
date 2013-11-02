package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullFalseTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotBlank;
import static shiver.me.timbers.ArrayChecks.isNotBlank;
import static shiver.me.timbers.Constants.BYTES_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_BYTE_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotBlankWithByteArrayTest extends AbstractIsNotBlankTest<byte[]> {

    public ArrayChecksIsNotBlankWithByteArrayTest() {
        super(BYTES_1D, NOT_EMPTY_BYTE_ARRAY);
    }

    @Override
    protected boolean doCheck(byte[] value) {

        return isNotBlank(value);
    }

    @Override
    protected void doAssert(String message, byte[] value) {

        assertIsNotBlank(message, value);
    }
}
