package shiver.me.timbers.checks;

import org.junit.Test;
import shiver.me.timbers.ArrayChecks;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Karl Bennett
 */
public class ArrayChecksCreateTest {

    @Test
    public void testCreate() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException {

        Constructor constructor = ArrayChecks.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        constructor.newInstance();
    }
}
