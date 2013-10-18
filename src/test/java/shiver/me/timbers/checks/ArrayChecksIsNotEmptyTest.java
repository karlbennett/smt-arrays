package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotEmpty;
import static shiver.me.timbers.ArrayChecks.isNotEmpty;
import static shiver.me.timbers.Constants.EMPTY_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotEmptyTest extends AbstractIsNotEmptyCheckAndAssertTest<Object[]> {

    public ArrayChecksIsNotEmptyTest() {
        super(NOT_EMPTY_ARRAY, EMPTY_ARRAY);
    }

    @Override
    protected boolean doCheck(Object[] value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, Object[] value) {

        assertIsNotEmpty(message, value);
    }
}
