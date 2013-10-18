package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayChecks.isBlank;
import static shiver.me.timbers.Constants.INTS_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_INT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsBlankWithIntArrayTest extends AbstractCheckAndAssertTest<int[]> {

    public ArrayChecksIsBlankWithIntArrayTest() {
        super(NOT_EMPTY_INT_ARRAY, INTS_1D);
    }

    @Override
    protected boolean doCheck(int[] value) {

        return isBlank(value);
    }

    @Override
    protected void doAssert(String message, int[] value) {

        assertIsBlank(message, value);
    }
}
