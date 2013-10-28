package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsEmpty;
import static shiver.me.timbers.ArrayChecks.isEmpty;
import static shiver.me.timbers.Constants.EMPTY_BYTE_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_BYTE_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsEmptyWithByteArrayTest extends AbstractIsEmptyCheckAndAssertTest<byte[]> {

    public ArrayChecksIsEmptyWithByteArrayTest() {
        super(EMPTY_BYTE_ARRAY, NOT_EMPTY_BYTE_ARRAY);
    }

    @Override
    protected boolean doCheck(byte[] value) {

        return isEmpty(value);
    }

    @Override
    protected void doAssert(String message, byte[] value) {

        assertIsEmpty(message, value);
    }
}
