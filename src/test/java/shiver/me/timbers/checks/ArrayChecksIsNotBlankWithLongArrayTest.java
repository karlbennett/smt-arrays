package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullFalseTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotBlank;
import static shiver.me.timbers.ArrayChecks.isNotBlank;
import static shiver.me.timbers.Constants.LONGS_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_LONG_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotBlankWithLongArrayTest extends AbstractIsNotBlankTest<long[]> {

    public ArrayChecksIsNotBlankWithLongArrayTest() {
        super(LONGS_1D, NOT_EMPTY_LONG_ARRAY);
    }

    @Override
    protected boolean doCheck(long[] value) {

        return isNotBlank(value);
    }

    @Override
    protected void doAssert(String message, long[] value) {

        assertIsNotBlank(message, value);
    }
}
