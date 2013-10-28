package shiver.me.timbers.reflections;

import org.junit.Test;
import shiver.me.timbers.AbstractCheckAndAssertTest;

import static org.junit.Assert.assertTrue;
import static shiver.me.timbers.ArrayAsserts.assertIsNotBlank;
import static shiver.me.timbers.ArrayReflections.isNotBlank;
import static shiver.me.timbers.Constants.NOT_BLANK_ARRAY;
import static shiver.me.timbers.Constants.NOT_EMPTY_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayReflectionsIsNotBlankWithObjectTest extends AbstractCheckAndAssertTest<Object> {

    public ArrayReflectionsIsNotBlankWithObjectTest() {
        super(NOT_BLANK_ARRAY, NOT_EMPTY_ARRAY);
    }

    @Override
    protected boolean doCheck(Object value) {

        return isNotBlank(value);
    }

    @Override
    protected void doAssert(String message, Object value) {

        assertIsNotBlank(message, (Object[]) value);
    }

    @Test
    public void testIsBlankWithNonArray() {

        assertTrue("an object should not be blank.", isNotBlank(new Object()));
    }
}
