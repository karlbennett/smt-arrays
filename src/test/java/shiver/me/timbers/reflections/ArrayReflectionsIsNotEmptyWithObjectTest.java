package shiver.me.timbers.reflections;

import static shiver.me.timbers.ArrayAsserts.assertIsNotEmpty;
import static shiver.me.timbers.ArrayReflections.isNotEmpty;
import static shiver.me.timbers.Constants.EMPTY_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayReflectionsIsNotEmptyWithObjectTest extends AbstractNegativeArrayCheckAndAssertTest<Object> {

    public ArrayReflectionsIsNotEmptyWithObjectTest() {
        super(NOT_EMPTY_ARRAY, EMPTY_ARRAY);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isNotEmpty(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsNotEmpty(message, value);
    }

    @Override
    protected Object create() {

        return new Object();
    }
}
