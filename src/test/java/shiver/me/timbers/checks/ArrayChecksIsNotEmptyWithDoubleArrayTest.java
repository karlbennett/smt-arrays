package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotEmpty;
import static shiver.me.timbers.ArrayChecks.isNotEmpty;
import static shiver.me.timbers.Constants.EMPTY_DOUBLE_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_DOUBLE_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotEmptyWithDoubleArrayTest extends AbstractCheckAndAssertTest<double[]> {

    public ArrayChecksIsNotEmptyWithDoubleArrayTest() {
        super(NOT_EMPTY_DOUBLE_ARRAY, EMPTY_DOUBLE_ARRAY);
    }

    @Override
    protected boolean doCheck(double[] value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, double[] value) {

        assertIsNotEmpty(message, value);
    }
}
