package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullTrueTest;

import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayChecks.isBlank;
import static shiver.me.timbers.Constants.DOUBLES_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_DOUBLE_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsBlankWithDoubleArrayTest extends AbstractCheckAndAssertNullTrueTest<double[]> {

    public ArrayChecksIsBlankWithDoubleArrayTest() {
        super(NOT_EMPTY_DOUBLE_ARRAY, DOUBLES_1D);
    }

    @Override
    protected boolean doCheck(double[] value) {

        return isBlank(value);
    }

    @Override
    protected void doAssert(String message, double[] value) {

        assertIsBlank(message, value);
    }
}
