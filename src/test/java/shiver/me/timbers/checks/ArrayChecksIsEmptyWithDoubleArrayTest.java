package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsEmpty;
import static shiver.me.timbers.ArrayChecks.isEmpty;
import static shiver.me.timbers.Constants.EMPTY_DOUBLE_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_DOUBLE_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsEmptyWithDoubleArrayTest extends AbstractIsEmptyTest<double[]> {

    public ArrayChecksIsEmptyWithDoubleArrayTest() {
        super(EMPTY_DOUBLE_ARRAY, NOT_EMPTY_DOUBLE_ARRAY);
    }

    @Override
    protected boolean doCheck(double[] value) {

        return isEmpty(value);
    }

    @Override
    protected void doAssert(String message, double[] value) {

        assertIsEmpty(message, value);
    }
}
