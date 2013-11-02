package shiver.me.timbers.reflections;

import shiver.me.timbers.AbstractCheckAndAssertNullFalseTest;

import static shiver.me.timbers.ArrayAsserts.assertIsArray;
import static shiver.me.timbers.ArrayReflections.isArray;
import static shiver.me.timbers.Constants.ARRAY;
import static shiver.me.timbers.Constants.NOT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayReflectionsIsArrayWithObjectTest extends AbstractCheckAndAssertNullFalseTest<Object> {

    public ArrayReflectionsIsArrayWithObjectTest() {
        super(ARRAY, NOT_ARRAY);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isArray(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsArray(message, value);
    }
}
