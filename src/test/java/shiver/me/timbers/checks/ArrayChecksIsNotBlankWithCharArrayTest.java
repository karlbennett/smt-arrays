package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotBlank;
import static shiver.me.timbers.ArrayChecks.isNotBlank;
import static shiver.me.timbers.Constants.CHARS_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_CHAR_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotBlankWithCharArrayTest extends AbstractIsNotEmptyCheckAndAssertTest<char[]> {

    public ArrayChecksIsNotBlankWithCharArrayTest() {
        super(CHARS_1D, NOT_EMPTY_CHAR_ARRAY);
    }

    @Override
    protected boolean doCheck(char[] value) {

        return isNotBlank(value);
    }

    @Override
    protected void doAssert(String message, char[] value) {

        assertIsNotBlank(message, value);
    }
}
