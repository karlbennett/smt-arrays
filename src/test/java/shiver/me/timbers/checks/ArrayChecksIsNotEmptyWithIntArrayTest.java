package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsNotEmpty;
import static shiver.me.timbers.ArrayChecks.isNotEmpty;
import static shiver.me.timbers.Constants.EMPTY_INT_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_INT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotEmptyWithIntArrayTest extends AbstractIsNotEmptyCheckAndAssertTest<int[]> {

    public ArrayChecksIsNotEmptyWithIntArrayTest() {
        super(NOT_EMPTY_INT_ARRAY, EMPTY_INT_ARRAY);
    }

    @Override
    protected boolean doCheck(int[] value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, int[] value) {

        assertIsNotEmpty(message, value);
    }
}
