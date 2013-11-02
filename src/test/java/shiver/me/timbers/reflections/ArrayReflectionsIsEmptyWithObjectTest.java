package shiver.me.timbers.reflections;

import static shiver.me.timbers.ArrayAsserts.assertIsEmpty;
import static shiver.me.timbers.ArrayReflections.isEmpty;
import static shiver.me.timbers.Constants.EMPTY_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayReflectionsIsEmptyWithObjectTest extends AbstractPositiveArrayCheckAndAssertTest<Object> {

    public ArrayReflectionsIsEmptyWithObjectTest() {
        super(EMPTY_ARRAY, NOT_EMPTY_ARRAY);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isEmpty(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsEmpty(message, (Object[]) value);
    }

    @Override
    protected Object create() {

        return new Object();
    }
}
