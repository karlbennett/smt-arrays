package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotEmpty;
import static shiver.me.timbers.ArrayChecks.isNotEmpty;
import static shiver.me.timbers.Constants.EMPTY_2D_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_2D_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotEmptyWith2DArrayTest extends AbstractIsNotEmptyCheckAndAssertTest<Object[][]> {

    public ArrayChecksIsNotEmptyWith2DArrayTest() {
        super(NOT_EMPTY_2D_ARRAY, EMPTY_2D_ARRAY);
    }

    @Override
    protected boolean doCheck(Object[][] value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, Object[][] value) {

        assertIsNotEmpty(message, value);
    }
}
