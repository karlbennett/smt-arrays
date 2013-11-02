package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullTrueTest;

import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayChecks.isBlank;
import static shiver.me.timbers.Constants.FLOATS_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_FLOAT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsBlankWithFloatArrayTest extends AbstractCheckAndAssertNullTrueTest<float[]> {

    public ArrayChecksIsBlankWithFloatArrayTest() {
        super(NOT_EMPTY_FLOAT_ARRAY, FLOATS_1D);
    }

    @Override
    protected boolean doCheck(float[] value) {

        return isBlank(value);
    }

    @Override
    protected void doAssert(String message, float[] value) {

        assertIsBlank(message, value);
    }
}
