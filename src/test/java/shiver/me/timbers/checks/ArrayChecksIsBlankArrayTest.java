package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayChecks.isBlank;
import static shiver.me.timbers.Constants.NOT_BLANK_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsBlankArrayTest extends AbstractIsBlankTest<Object[]> {

    public ArrayChecksIsBlankArrayTest() {
        super(NOT_EMPTY_ARRAY, NOT_BLANK_ARRAY);
    }

    @Override
    protected boolean doCheck(Object[] value) {

        return isBlank(value);
    }

    @Override
    protected void doAssert(String message, Object[] value) {

        assertIsBlank(message, value);
    }
}
