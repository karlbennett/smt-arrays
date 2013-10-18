package shiver.me.timbers.utils;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static shiver.me.timbers.TestUtils.objectToArray;

/**
 * This class can be used to create different permutations of tests of the
 * {@link shiver.me.timbers.ArrayUtils#deepAutoBox} methods.
 *
 * @author Karl Bennett
 */
public abstract class AbstractDeepAutoBoxTest<B, A> {

    private final B boxedArray;

    private final A arrayToBeAutoBoxed;

    /**
     * Create a new {@code AbstractDeepAutoBoxTest} with an expected auto boxed array and the array that is to be auto
     * boxed.
     *
     * @param boxedArray         the expected array to be produced from auto boxing.
     * @param arrayToBeAutoBoxed the array to be auto boxed.
     */
    protected AbstractDeepAutoBoxTest(B boxedArray, A arrayToBeAutoBoxed) {

        this.boxedArray = boxedArray;
        this.arrayToBeAutoBoxed = arrayToBeAutoBoxed;
    }

    /**
     * Implement this method with a call to {@link shiver.me.timbers.ArrayUtils#deepAutoBox} with the supplied array
     * argument.
     *
     * @param array the array to auto box.
     * @return the auto boxed array.
     */
    protected abstract B deepAutoBox(A array);

    protected abstract A deepAutoUnBox(B array);

    /**
     * Implement this method to return an array of the auto boxed type.
     *
     * @return an empty array.
     */
    protected abstract B emptyBoxedArray();

    /**
     * Implement this method to return an array of the un-boxed type.
     *
     * @return an empty array.
     */
    protected abstract A emptyArrayToBeAutoBoxed();

    private Object[] deepAutoBoxAndConvertArray(A array) {

        return objectToArray(deepAutoBox(array));
    }

    private Object[] deepAutoUnBoxAndConvertArray(B array) {

        return objectToArray(deepAutoUnBox(array));
    }

    @Test
    public void testAutoBoxWithArrayProducesValue() {

        assertNotNull("object array should be correct", deepAutoBox(arrayToBeAutoBoxed));
    }

    @Test
    public void testAutoBoxWithArray() {

        assertArrayEquals("object array should be correct", objectToArray(boxedArray),
                deepAutoBoxAndConvertArray(arrayToBeAutoBoxed));
    }

    @Test
    public void testAutoUnBoxWithArray() {

        assertArrayEquals("object array should be correct", objectToArray(arrayToBeAutoBoxed),
                deepAutoUnBoxAndConvertArray(boxedArray));
    }

    @Test
    public void testAutoBoxWithEmptyArray() {

        assertArrayEquals("empty object array should be correct", objectToArray(emptyBoxedArray()),
                deepAutoBoxAndConvertArray(emptyArrayToBeAutoBoxed()));
    }

    @Test
    public void testAutoUnBoxWithEmptyArray() {

        assertArrayEquals("empty object array should be correct", objectToArray(emptyArrayToBeAutoBoxed()),
                deepAutoUnBoxAndConvertArray(emptyBoxedArray()));
    }

    @Test
    public void testAutoBoxWithNullArray() {

        assertNull("null array should be null", deepAutoBox(null));
    }

    @Test
    public void testAutoUnBoxWithNullArray() {

        assertNull("null array should be null", deepAutoUnBox(null));
    }
}
