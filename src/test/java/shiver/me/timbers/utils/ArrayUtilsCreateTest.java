package shiver.me.timbers.utils;

import org.junit.Test;
import shiver.me.timbers.ArrayUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsCreateTest {

    @Test
    public void testCreate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {

        Constructor constructor = ArrayUtils.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
