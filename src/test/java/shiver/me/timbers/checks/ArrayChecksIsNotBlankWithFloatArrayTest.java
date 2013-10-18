package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotBlank;
import static shiver.me.timbers.ArrayChecks.isNotBlank;
import static shiver.me.timbers.Constants.FLOATS_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_FLOAT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotBlankWithFloatArrayTest extends AbstractCheckAndAssertTest<float[]> {

    public ArrayChecksIsNotBlankWithFloatArrayTest() {
        super(FLOATS_1D, NOT_EMPTY_FLOAT_ARRAY);
    }

    @Override
    protected boolean doCheck(float[] value) {

        return isNotBlank(value);
    }

    @Override
    protected void doAssert(String message, float[] value) {

        assertIsNotBlank(message, value);
    }
}
