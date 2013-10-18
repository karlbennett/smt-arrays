package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotBlank;
import static shiver.me.timbers.ArrayChecks.isNotBlank;
import static shiver.me.timbers.Constants.NOT_BLANK_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotBlankArrayTest extends AbstractIsNotEmptyCheckAndAssertTest<Object[]> {

    public ArrayChecksIsNotBlankArrayTest() {
        super(NOT_BLANK_ARRAY, NOT_EMPTY_ARRAY);
    }

    @Override
    protected boolean doCheck(Object[] value) {

        return isNotBlank(value);
    }

    @Override
    protected void doAssert(String message, Object[] value) {

        assertIsNotBlank(message, value);
    }
}
