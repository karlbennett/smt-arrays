package shiver.me.timbers.utils;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static shiver.me.timbers.ArrayUtils.Each;

/**
 * This class can be used to create different permutations of tests of the
 * {@link shiver.me.timbers.ArrayUtils#deepFor} methods.
 *
 * @author Karl Bennett
 */
public abstract class AbstractIterationTest<A, T> {

    private final A array;
    private final A emptyArray;
    private final int arrayElementNumber;
    private final int emptyArrayIterations;
    private final int nullArrayIterations;

    /**
     * Create a new {@code AbstractDeepForTest} with all the required tests data.
     *
     * @param array                the array to run the successful tests against.
     * @param emptyArray           an empty version of the array.
     * @param arrayElementNumber   the number of times the {@link shiver.me.timbers.ArrayUtils#deepFor} method should
     *                             iterate for the supplied non empty array.
     * @param emptyArrayIterations the number of times the {@link shiver.me.timbers.ArrayUtils#deepFor} method should
     *                             iterate for the supplied empty array.
     * @param nullArrayIterations  the number of times the {@link shiver.me.timbers.ArrayUtils#deepFor} method should
     *                             iterate for null.
     */
    protected AbstractIterationTest(A array, A emptyArray, int arrayElementNumber, int emptyArrayIterations, int nullArrayIterations) {

        this.array = array;
        this.emptyArray = emptyArray;
        this.arrayElementNumber = arrayElementNumber;
        this.emptyArrayIterations = emptyArrayIterations;
        this.nullArrayIterations = nullArrayIterations;
    }

    /**
     * Implement this method with the call to {@link shiver.me.timbers.ArrayUtils#deepFor} using the supplied
     * {@link shiver.me.timbers.ArrayUtils.Each} and array.
     *
     * @param array the array to call the {@code deepFor} method with.
     * @param each  the {@code Each} to call the {@code deepFor} method with.
     */
    protected abstract void deepFor(A array, Each<T, RuntimeException> each);

    /**
     * Implement this method so that it will return the element that corresponds to supplied count index, that is the
     * element number that would result from counting up through the dimension starting with {@code x}.
     *
     * @param array the array to get the element from.
     * @param count the count of the element.
     * @return the required element.
     */
    protected abstract T getElementFromCount(A array, int count);

    /**
     * Implement this method so that it returns the element at the supplied axis. The axis are made up in the same way
     * as the {@link shiver.me.timbers.ArrayUtils#deepFor} expects.
     *
     * @param array the array to get the element from.
     * @param axis  the axis of the element.
     * @return the required element.
     */
    protected abstract T getElementFromAxis(A array, int[] axis);

    @Test
    public void testDeepForRunsEach() {

        CountingEach each = new CountingEach() {

            @Override
            protected void runWithCount(T element, int[] axis) {
            }
        };

        deepFor(array, each);

        assertThat("the each should have been run at least once.", each.getCount(), greaterThan(0));
    }

    @Test
    public void testDeepForDoesNotRunEachWithEmptyArray() {

        assertDeepForCount(emptyArray, emptyArrayIterations, new CountingEach() {
            @Override
            protected void runWithCount(T element, int[] axis) {
            }
        });
    }

    @Test
    public void testDeepForDoesNotRunEachWithNullArray() {

        assertDeepForCount(null, nullArrayIterations, new CountingEach() {
            @Override
            protected void runWithCount(T element, int[] axis) {
            }
        });
    }

    @Test
    public void testDeepForPassesCorrectElementsIntoEach() {

        final int[] index = {0};

        assertDeepForCount(array, arrayElementNumber, new CountingEach() {

            @Override
            public void runWithCount(T element, int[] axis) {

                assertEquals("the array element should be correct.", getElementFromCount(array, index[0]++), element);
            }
        });
    }

    @Test
    public void testDeepForPassesCorrectAxisIntoEach() {

        final int[] index = {0};

        assertDeepForCount(array, arrayElementNumber, new CountingEach() {

            @Override
            public void runWithCount(T element, int[] axis) {

                final T expected = getElementFromCount(array, index[0]++);
                final T actual = getElementFromAxis(array, axis);

                assertEquals("the array element should be correct at axis (" + Arrays.toString(axis)
                        + ") and index (" + index[0] + ")", expected, actual);
            }
        });
    }

    @Test(expected = NullPointerException.class)
    public void testDeepForWithNullEach() throws Throwable {

        deepFor(array, null);
    }

    @Test(expected = Exception.class)
    public void testDeepForWithException() throws Exception {

        deepFor(array, null);
    }

    /**
     * Call the {@link shiver.me.timbers.ArrayUtils#deepFor} method with a {@link CountingEach} and assert that the each
     * was run the expected number of times.
     *
     * @param count
     * @param each  the each to run.
     */
    private void assertDeepForCount(A array, int count, CountingEach each) {

        deepFor(array, each);

        assertEquals("each was run the correct number of times.", count, each.getCount());
    }

    /**
     * This {@link shiver.me.timbers.ArrayUtils.Each} implementation keeps track of how many times the {@link shiver.me.timbers.ArrayUtils.Each#run(T, int[])} run method has been
     * called.
     */
    private abstract class CountingEach extends Each<T, RuntimeException> {

        private int count = 0;

        protected abstract void runWithCount(T element, int[] axis);

        @Override
        public void run(T element, int[] axis) {

            runWithCount(element, axis);

            count++;
        }

        private int getCount() {

            return count;
        }
    }
}
