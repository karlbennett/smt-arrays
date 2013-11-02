package shiver.me.timbers.reflections;

import shiver.me.timbers.AbstractCheckAndAssertNullFalseTest;

import static shiver.me.timbers.ArrayAsserts.assertIsArray;
import static shiver.me.timbers.ArrayReflections.isArray;
import static shiver.me.timbers.Constants.ARRAY;
import static shiver.me.timbers.Constants.NOT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayReflectionsIsArrayWithClassTest extends AbstractCheckAndAssertNullFalseTest<Class> {

    public ArrayReflectionsIsArrayWithClassTest() {
        super(ARRAY.getClass(), NOT_ARRAY.getClass());
    }

    @Override
    protected boolean doCheck(Class value) {

        return isArray(value);
    }

    @Override
    protected void doAssert(String message, Class value) {

        assertIsArray(message, value);
    }
}
