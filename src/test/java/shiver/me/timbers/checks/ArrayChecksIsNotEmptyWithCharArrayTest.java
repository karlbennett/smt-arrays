package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullFalseTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotEmpty;
import static shiver.me.timbers.ArrayChecks.isNotEmpty;
import static shiver.me.timbers.Constants.EMPTY_CHAR_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_CHAR_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotEmptyWithCharArrayTest extends AbstractIsNotEmptyTest<char[]> {

    public ArrayChecksIsNotEmptyWithCharArrayTest() {
        super(NOT_EMPTY_CHAR_ARRAY, EMPTY_CHAR_ARRAY);
    }

    @Override
    protected boolean doCheck(char[] value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, char[] value) {

        assertIsNotEmpty(message, value);
    }
}
