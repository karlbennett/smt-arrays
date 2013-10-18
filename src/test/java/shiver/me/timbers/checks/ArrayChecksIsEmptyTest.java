package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsEmpty;
import static shiver.me.timbers.ArrayChecks.isEmpty;
import static shiver.me.timbers.Constants.EMPTY_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsEmptyTest extends AbstractIsEmptyCheckAndAssertTest<Object[]> {

    public ArrayChecksIsEmptyTest() {
        super(EMPTY_ARRAY, NOT_EMPTY_ARRAY);
    }

    @Override
    protected boolean doCheck(Object[] value) {

        return isEmpty(value);
    }

    @Override
    protected void doAssert(String message, Object[] value) {

        assertIsEmpty(message, value);
    }
}
