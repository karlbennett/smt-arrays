package shiver.me.timbers.reflections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static shiver.me.timbers.ArrayReflections.findComponentType;
import static shiver.me.timbers.Constants.ARRAY;
import static shiver.me.timbers.Constants.BYTES_1D;
import static shiver.me.timbers.Constants.BYTES_2D;
import static shiver.me.timbers.Constants.BYTES_3D;
import static shiver.me.timbers.Constants.BYTE_OBJECTS_1D;
import static shiver.me.timbers.Constants.BYTE_OBJECTS_2D;
import static shiver.me.timbers.Constants.BYTE_OBJECTS_3D;
import static shiver.me.timbers.Constants.NOT_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayReflectionsFindComponentTypeTest {

    @Test
    public void testFindComponentTypeWithArray() {

        assertComponentType(Object.class, ARRAY);
    }

    @Test
    public void testFindComponentTypeWithNotArray() {

        assertComponentType(Object.class, NOT_ARRAY);
        assertComponentType(Integer.class, 1);
        assertComponentType(String.class, "not an array");
    }

    @Test
    public void testFindComponentTypeWithEmptyArray() {

        assertComponentType(Object.class, new Object[0]);
    }

    @Test
    public void testFindComponentTypeWithEmpty2DArray() {

        assertComponentType(Object.class, new Object[0][]);
    }

    @Test
    public void testFindComponentTypeWithEmpty3DArray() {

        assertComponentType(Object.class, new Object[0][][]);
    }

    @Test(expected = NullPointerException.class)
    public void testFindComponentTypeWithNull() {

        findComponentType(null);
    }

    @Test
    public void testFindComponentTypeWithByteArray() {

        assertComponentType(byte.class, BYTES_1D);
        assertComponentType(Byte.class, BYTE_OBJECTS_1D);
    }

    @Test
    public void testFindComponentTypeWith2DByteArray() {

        assertComponentType(byte.class, BYTES_2D);
        assertComponentType(Byte.class, BYTE_OBJECTS_2D);
    }

    @Test
    public void testFindComponentTypeWith3DByteArray() {

        assertComponentType(byte.class, BYTES_3D);
        assertComponentType(Byte.class, BYTE_OBJECTS_3D);
    }

    private static void assertComponentType(Class type, Object array) {

        assertEquals("the component type should be " + type.getName(), type, findComponentType(array));
    }
}
