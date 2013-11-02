package shiver.me.timbers.reflections;

import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayReflections.isBlank;
import static shiver.me.timbers.Constants.NOT_BLANK_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayReflectionsIsBlankWithObjectTest extends AbstractPositiveArrayCheckAndAssertTest<Object> {

    public ArrayReflectionsIsBlankWithObjectTest() {
        super(NOT_EMPTY_ARRAY, NOT_BLANK_ARRAY);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isBlank(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsBlank(message, (Object[]) value);
    }

    @Override
    protected Object create() {

        return new Object();
    }
}
