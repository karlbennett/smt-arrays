package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullTrueTest;

import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayChecks.isBlank;
import static shiver.me.timbers.Constants.NOT_BLANK_3D_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_3D_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsBlankWith3DArrayTest extends AbstractIsBlankTest<Object[][]> {

    public ArrayChecksIsBlankWith3DArrayTest() {
        super(NOT_EMPTY_3D_ARRAY, NOT_BLANK_3D_ARRAY);
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
