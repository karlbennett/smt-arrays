package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsEmpty;
import static shiver.me.timbers.ArrayChecks.isEmpty;
import static shiver.me.timbers.Constants.EMPTY_SHORT_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_SHORT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsEmptyWithShortArrayTest extends AbstractIsEmptyCheckAndAssertTest<short[]> {

    public ArrayChecksIsEmptyWithShortArrayTest() {
        super(EMPTY_SHORT_ARRAY, NOT_EMPTY_SHORT_ARRAY);
    }

    @Override
    protected boolean doCheck(short[] value) {

        return isEmpty(value);
    }

    @Override
    protected void doAssert(String message, short[] value) {

        assertIsEmpty(message, value);
    }
}
