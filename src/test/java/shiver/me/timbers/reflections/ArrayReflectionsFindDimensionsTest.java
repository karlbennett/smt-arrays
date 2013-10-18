package shiver.me.timbers.reflections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static shiver.me.timbers.ArrayReflections.findDimensions;
import static shiver.me.timbers.Constants.ARRAY;
import static shiver.me.timbers.Constants.BYTES_2D;
import static shiver.me.timbers.Constants.BYTES_3D;

/**
 * @author Karl Bennett
 */
public class ArrayReflectionsFindDimensionsTest {

    @Test
    public void testFindDimensionsWith1DArray() {

        assertFindDimensions(1, ARRAY);
    }

    @Test
    public void testFindDimensionsWith2DArray() {

        assertFindDimensions(2, BYTES_2D);
    }

    @Test
    public void testFindDimensionsWith3DArray() {

        assertFindDimensions(3, BYTES_3D);
    }

    @Test
    public void testFindDimensionsWithEmpty3DArray() {

        assertFindDimensions(3, new Object[0][0][0]);
    }

    @Test
    public void testFindDimensionsWithNull() {

        assertFindDimensions(1, null);
    }

    private static void assertFindDimensions(int dimensions, Object array) {

        assertEquals("the dimensions value should be " + dimensions, dimensions, findDimensions(array));
    }
}
