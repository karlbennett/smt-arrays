package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsEmpty;
import static shiver.me.timbers.ArrayChecks.isEmpty;
import static shiver.me.timbers.Constants.EMPTY_CHAR_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_CHAR_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsEmptyWithCharArrayTest extends AbstractIsEmptyCheckAndAssertTest<char[]> {

    public ArrayChecksIsEmptyWithCharArrayTest() {
        super(EMPTY_CHAR_ARRAY, NOT_EMPTY_CHAR_ARRAY);
    }

    @Override
    protected boolean doCheck(char[] value) {

        return isEmpty(value);
    }

    @Override
    protected void doAssert(String message, char[] value) {

        assertIsEmpty(message, value);
    }
}
