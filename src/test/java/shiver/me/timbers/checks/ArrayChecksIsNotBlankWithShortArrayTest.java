package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullFalseTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotBlank;
import static shiver.me.timbers.ArrayChecks.isNotBlank;
import static shiver.me.timbers.Constants.NOT_EMPTY_SHORT_ARRAY;
import static shiver.me.timbers.Constants.SHORTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotBlankWithShortArrayTest extends AbstractCheckAndAssertNullFalseTest<short[]> {

    public ArrayChecksIsNotBlankWithShortArrayTest() {
        super(SHORTS_1D, NOT_EMPTY_SHORT_ARRAY);
    }

    @Override
    protected boolean doCheck(short[] value) {

        return isNotBlank(value);
    }

    @Override
    protected void doAssert(String message, short[] value) {

        assertIsNotBlank(message, value);
    }
}
