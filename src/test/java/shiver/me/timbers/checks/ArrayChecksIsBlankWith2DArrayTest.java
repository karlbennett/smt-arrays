package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayChecks.isBlank;
import static shiver.me.timbers.Constants.NOT_BLANK_2D_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_2D_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsBlankWith2DArrayTest extends AbstractCheckAndAssertTest<Object[][]> {

    public ArrayChecksIsBlankWith2DArrayTest() {
        super(NOT_EMPTY_2D_ARRAY, NOT_BLANK_2D_ARRAY);
    }

    @Override
    protected boolean doCheck(Object[][] value) {

        return isBlank(value);
    }

    @Override
    protected void doAssert(String message, Object[][] value) {

        assertIsBlank(message, value);
    }
}
