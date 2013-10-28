package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsNotEmpty;
import static shiver.me.timbers.ArrayChecks.isNotEmpty;
import static shiver.me.timbers.Constants.EMPTY_3D_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_3D_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsNotEmptyWith3DArrayTest extends AbstractIsNotEmptyCheckAndAssertTest<Object[][][]> {

    public ArrayChecksIsNotEmptyWith3DArrayTest() {
        super(NOT_EMPTY_3D_ARRAY, EMPTY_3D_ARRAY);
    }

    @Override
    protected boolean doCheck(Object[][][] value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, Object[][][] value) {

        assertIsNotEmpty(message, value);
    }
}
