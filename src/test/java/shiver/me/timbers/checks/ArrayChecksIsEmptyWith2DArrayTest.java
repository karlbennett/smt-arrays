package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsEmpty;
import static shiver.me.timbers.ArrayChecks.isEmpty;
import static shiver.me.timbers.Constants.EMPTY_2D_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_2D_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsEmptyWith2DArrayTest extends AbstractIsEmptyCheckAndAssertTest<Object[][]> {

    public ArrayChecksIsEmptyWith2DArrayTest() {
        super(EMPTY_2D_ARRAY, NOT_EMPTY_2D_ARRAY);
    }

    @Override
    protected boolean doCheck(Object[][] value) {

        return isEmpty(value);
    }

    @Override
    protected void doAssert(String message, Object[][] value) {

        assertIsEmpty(message, value);
    }
}
