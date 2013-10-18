package shiver.me.timbers.utils;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static shiver.me.timbers.Constants.EMPTY_ARRAY;
import static shiver.me.timbers.TestUtils.objectToArray;

/**
 * This class can be used to create different permutations of tests of the
 * {@link shiver.me.timbers.ArrayUtils#deepCopyOf} methods.
 *
 * @author Karl Bennett
 */
public abstract class AbstractDeepCopyTest<A> {

    private final A array;
    private final Object[] objectArray;

    /**
     * Create a new {@code AbstractDeepCopyTest} implementation that will use the supplied array to tests the
     * {@code ArrayUtils#deepCopyOf} method.
     *
     * @param array the test array.
     */
    protected AbstractDeepCopyTest(A array) {

        this.array = array;
        this.objectArray = objectToArray(array);
    }

    /**
     * Implement this method with a call to the {@code ArrayUtils#deepCopyOf} using the array argument.
     *
     * @param array the array to call {@code ArrayUtils#deepCopyOf} with.
     * @return the copied array.
     */
    protected abstract A deepCopyOf(A array);

    /**
     * Implement this method with a manual copy of the test {@link #array}.
     *
     * @param array the array to copy.
     * @return the copied array.
     */
    protected abstract A manualCopyOf(A array);

    /**
     * Implement this method with a change to any element or elements within the supplied array.
     *
     * @param array the array to mutate.
     */
    protected abstract void mutateArray(A array);

    /**
     * Implement this method so that it returns an empty array, that is an array with zero length of the correct type
     * and dimensions.
     *
     * @return an empty array.
     */
    protected abstract A emptyArray();

    /**
     * Call the {@link #deepCopyOf(A)} method then convert the returned array {@link Object} into an array of
     * {@link Object}s.
     *
     * @param array the array to copy and convert.
     * @return the converted array copy.
     */
    private Object[] deepCopyOfToArray(A array) {

        return objectToArray(deepCopyOf(array));
    }

    @Test
    public void testDeepCopyOfProducesValue() {

        assertNotNull("a value should be produced.", deepCopyOf(array));
    }

    @Test
    public void testDeepCopyOfCopiesAnArray() {

        assertArrayEquals("the array should be copied correctly.", objectArray, deepCopyOfToArray(array));
    }

    @Test
    public void testDeepCopyOfCopiedArrayIsNotModifiedAfterMutatingOriginalArray() {

        final A arrayManualCopy = manualCopyOf(array);

        final Object[] arrayDeepCopy = deepCopyOfToArray(arrayManualCopy);

        assertArrayEquals("the array should be copied correctly.", objectArray, arrayDeepCopy);

        mutateArray(arrayManualCopy);

        assertArrayEquals("the copied array should not have changed after a mutation of the original.",
                objectArray, arrayDeepCopy);
    }

    @Test
    public void testDeepCopyOfWithEmptyArray() {

        assertArrayEquals("the empty array should be copied correctly.", EMPTY_ARRAY, deepCopyOfToArray(emptyArray()));
    }

    @Test
    public void testDeepCopyOfWithNull() {

        assertNull("null should be copied correctly.", deepCopyOfToArray(null));
    }
}
