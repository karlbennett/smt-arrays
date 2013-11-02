package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullTrueTest;

import static shiver.me.timbers.ArrayAsserts.assertIsEmpty;
import static shiver.me.timbers.ArrayChecks.isEmpty;
import static shiver.me.timbers.Constants.EMPTY_INT_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_INT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsEmptyWithIntArrayTest extends AbstractIsEmptyTest<int[]> {

    public ArrayChecksIsEmptyWithIntArrayTest() {
        super(EMPTY_INT_ARRAY, NOT_EMPTY_INT_ARRAY);
    }

    @Override
    protected boolean doCheck(int[] value) {

        return isEmpty(value);
    }

    @Override
    protected void doAssert(String message, int[] value) {

        assertIsEmpty(message, value);
    }
}
