package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotEmpty;
import static shiver.me.timbers.ArrayChecks.isNotEmpty;
import static shiver.me.timbers.Constants.EMPTY_LONG_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_LONG_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotEmptyWithLongArrayTest extends AbstractCheckAndAssertTest<long[]> {

    public ArrayChecksIsNotEmptyWithLongArrayTest() {
        super(NOT_EMPTY_LONG_ARRAY, EMPTY_LONG_ARRAY);
    }

    @Override
    protected boolean doCheck(long[] value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, long[] value) {

        assertIsNotEmpty(message, value);
    }
}
