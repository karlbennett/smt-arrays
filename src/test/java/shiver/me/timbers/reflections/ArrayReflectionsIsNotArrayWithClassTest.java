package shiver.me.timbers.reflections;

import shiver.me.timbers.AbstractCheckAndAssertNullTrueTest;

import static shiver.me.timbers.ArrayAsserts.assertIsNotArray;
import static shiver.me.timbers.ArrayReflections.isNotArray;
import static shiver.me.timbers.Constants.ARRAY;
import static shiver.me.timbers.Constants.NOT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayReflectionsIsNotArrayWithClassTest extends AbstractCheckAndAssertNullTrueTest<Class> {

    public ArrayReflectionsIsNotArrayWithClassTest() {
        super(NOT_ARRAY.getClass(), ARRAY.getClass());
    }

    @Override
    protected boolean doCheck(Class value) {

        return isNotArray(value);
    }

    @Override
    protected void doAssert(String message, Class value) {

        assertIsNotArray(message, value);
    }
}
