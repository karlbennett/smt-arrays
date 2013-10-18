package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayChecks.isBlank;
import static shiver.me.timbers.Constants.LONGS_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_LONG_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsBlankWithLongArrayTest extends AbstractIsEmptyCheckAndAssertTest<long[]> {

    public ArrayChecksIsBlankWithLongArrayTest() {
        super(NOT_EMPTY_LONG_ARRAY, LONGS_1D);
    }

    @Override
    protected boolean doCheck(long[] value) {

        return isBlank(value);
    }

    @Override
    protected void doAssert(String message, long[] value) {

        assertIsBlank(message, value);
    }
}
