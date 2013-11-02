package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullFalseTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotBlank;
import static shiver.me.timbers.ArrayChecks.isNotBlank;
import static shiver.me.timbers.Constants.INTS_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_INT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotBlankWithIntArrayTest extends AbstractIsNotBlankTest<int[]> {

    public ArrayChecksIsNotBlankWithIntArrayTest() {
        super(INTS_1D, NOT_EMPTY_INT_ARRAY);
    }

    @Override
    protected boolean doCheck(int[] value) {

        return isNotBlank(value);
    }

    @Override
    protected void doAssert(String message, int[] value) {

        assertIsNotBlank(message, value);
    }
}
