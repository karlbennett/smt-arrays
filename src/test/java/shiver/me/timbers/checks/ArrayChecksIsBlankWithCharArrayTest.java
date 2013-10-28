package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayChecks.isBlank;
import static shiver.me.timbers.Constants.CHARS_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_CHAR_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsBlankWithCharArrayTest extends AbstractIsEmptyCheckAndAssertTest<char[]> {

    public ArrayChecksIsBlankWithCharArrayTest() {
        super(NOT_EMPTY_CHAR_ARRAY, CHARS_1D);
    }

    @Override
    protected boolean doCheck(char[] value) {

        return isBlank(value);
    }

    @Override
    protected void doAssert(String message, char[] value) {

        assertIsBlank(message, value);
    }
}
