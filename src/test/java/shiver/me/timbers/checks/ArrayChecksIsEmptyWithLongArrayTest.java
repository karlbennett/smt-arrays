package shiver.me.timbers.checks;

import static shiver.me.timbers.ArrayAsserts.assertIsEmpty;
import static shiver.me.timbers.ArrayChecks.isEmpty;
import static shiver.me.timbers.Constants.EMPTY_LONG_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_LONG_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayChecksIsEmptyWithLongArrayTest extends AbstractIsEmptyTest<long[]> {

    public ArrayChecksIsEmptyWithLongArrayTest() {
        super(EMPTY_LONG_ARRAY, NOT_EMPTY_LONG_ARRAY);
    }

    @Override
    protected boolean doCheck(long[] value) {

        return isEmpty(value);
    }

    @Override
    protected void doAssert(String message, long[] value) {

        assertIsEmpty(message, value);
    }
}
