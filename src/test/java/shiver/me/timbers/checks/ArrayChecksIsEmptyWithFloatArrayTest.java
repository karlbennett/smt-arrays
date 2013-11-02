package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullTrueTest;

import static shiver.me.timbers.ArrayAsserts.assertIsEmpty;
import static shiver.me.timbers.ArrayChecks.isEmpty;
import static shiver.me.timbers.Constants.EMPTY_FLOAT_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_FLOAT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsEmptyWithFloatArrayTest extends AbstractCheckAndAssertNullTrueTest<float[]> {

    public ArrayChecksIsEmptyWithFloatArrayTest() {
        super(EMPTY_FLOAT_ARRAY, NOT_EMPTY_FLOAT_ARRAY);
    }

    @Override
    protected boolean doCheck(float[] value) {

        return isEmpty(value);
    }

    @Override
    protected void doAssert(String message, float[] value) {

        assertIsEmpty(message, value);
    }
}
