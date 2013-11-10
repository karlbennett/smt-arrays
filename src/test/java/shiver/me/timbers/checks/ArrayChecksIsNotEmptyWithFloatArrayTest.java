package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsNotEmpty;
import static shiver.me.timbers.ArrayChecks.isNotEmpty;
import static shiver.me.timbers.Constants.EMPTY_FLOAT_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_FLOAT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotEmptyWithFloatArrayTest extends AbstractIsNotEmptyTest<float[]> {

    public ArrayChecksIsNotEmptyWithFloatArrayTest() {
        super(NOT_EMPTY_FLOAT_ARRAY, EMPTY_FLOAT_ARRAY);
    }

    @Override
    protected boolean doCheck(float[] value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, float[] value) {

        assertIsNotEmpty(message, value);
    }
}
