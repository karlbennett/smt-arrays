package shiver.me.timbers.reflections;

import shiver.me.timbers.AbstractCheckAndAssertTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotArray;
import static shiver.me.timbers.ArrayReflections.isNotArray;
import static shiver.me.timbers.Constants.ARRAY;
import static shiver.me.timbers.Constants.NOT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayIsNotArrayWithObjectTest extends AbstractCheckAndAssertTest<Object> {

    public ArrayIsNotArrayWithObjectTest() {
        super(NOT_ARRAY, ARRAY);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isNotArray(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsNotArray(message, value);
    }
}
