package shiver.me.timbers.asserts;

import org.junit.Test;
import shiver.me.timbers.ArrayAsserts;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Karl Bennett
 */
public class ArrayAssertsCreateTest {

    @Test
    public void testCreate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {

        Constructor constructor = ArrayAsserts.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
