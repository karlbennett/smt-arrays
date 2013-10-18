package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotEmpty;
import static shiver.me.timbers.ArrayChecks.isNotEmpty;
import static shiver.me.timbers.Constants.EMPTY_BYTE_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_BYTE_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotEmptyWithByteArrayTest extends AbstractCheckAndAssertTest<byte[]> {

    public ArrayChecksIsNotEmptyWithByteArrayTest() {
        super(NOT_EMPTY_BYTE_ARRAY, EMPTY_BYTE_ARRAY);
    }

    @Override
    protected boolean doCheck(byte[] value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, byte[] value) {

        assertIsNotEmpty(message, value);
    }
}
