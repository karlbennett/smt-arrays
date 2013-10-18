package shiver.me.timbers.reflections;

import org.junit.Test;
import shiver.me.timbers.ArrayReflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Karl Bennett
 */
public class ArrayReflectionsCreateTest {

    @Test
    public void testCreate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {

        Constructor constructor = ArrayReflections.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
