package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotEmpty;
import static shiver.me.timbers.ArrayChecks.isNotEmpty;
import static shiver.me.timbers.Constants.EMPTY_SHORT_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_SHORT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotEmptyWithShortArrayTest extends AbstractIsNotEmptyCheckAndAssertTest<short[]> {

    public ArrayChecksIsNotEmptyWithShortArrayTest() {
        super(NOT_EMPTY_SHORT_ARRAY, EMPTY_SHORT_ARRAY);
    }

    @Override
    protected boolean doCheck(short[] value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, short[] value) {

        assertIsNotEmpty(message, value);
    }
}
