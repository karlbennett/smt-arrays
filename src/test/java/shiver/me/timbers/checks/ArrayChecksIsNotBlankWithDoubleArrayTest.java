package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsNotBlank;
import static shiver.me.timbers.ArrayChecks.isNotBlank;
import static shiver.me.timbers.Constants.DOUBLES_1D;
import static shiver.me.timbers.Constants.NOT_EMPTY_DOUBLE_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotBlankWithDoubleArrayTest extends AbstractIsNotBlankTest<double[]> {

    public ArrayChecksIsNotBlankWithDoubleArrayTest() {
        super(DOUBLES_1D, NOT_EMPTY_DOUBLE_ARRAY);
    }

    @Override
    protected boolean doCheck(double[] value) {

        return isNotBlank(value);
    }

    @Override
    protected void doAssert(String message, double[] value) {

        assertIsNotBlank(message, value);
    }
}
