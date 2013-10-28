package shiver.me.timbers.reflections;

import org.junit.Test;
import shiver.me.timbers.AbstractCheckAndAssertTest;

import static org.junit.Assert.assertFalse;
import static shiver.me.timbers.ArrayAsserts.assertIsBlank;
import static shiver.me.timbers.ArrayReflections.isBlank;
import static shiver.me.timbers.Constants.NOT_BLANK_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayReflectionsIsBlankWithObjectTest extends AbstractCheckAndAssertTest<Object> {

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

    @Test
    public void testIsBlankWithNonArray() {

        assertFalse("an object should not be blank.", isBlank(new Object()));
    }
}
