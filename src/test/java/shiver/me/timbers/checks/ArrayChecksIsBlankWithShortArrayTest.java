package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayChecks.isBlank;
import static shiver.me.timbers.Constants.NOT_EMPTY_SHORT_ARRAY;
import static shiver.me.timbers.Constants.SHORTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsBlankWithShortArrayTest extends AbstractCheckAndAssertTest<short[]> {

    public ArrayChecksIsBlankWithShortArrayTest() {
        super(NOT_EMPTY_SHORT_ARRAY, SHORTS_1D);
    }

    @Override
    protected boolean doCheck(short[] value) {

        return isBlank(value);
    }

    @Override
    protected void doAssert(String message, short[] value) {

        assertIsBlank(message, value);
    }
}
