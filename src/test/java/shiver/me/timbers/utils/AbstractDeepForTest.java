package shiver.me.timbers.utils;

import org.junit.Test;

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
public abstract class AbstractDeepForTest<A, T> {

    private final A array;

    protected AbstractDeepForTest(A array) {

        this.array = array;
    }

    /**
     * Implement this method with the call to {@link shiver.me.timbers.ArrayUtils#deepFor} using the supplied
     * {@link Each} and array.
     *
     * @param array the array to call the {@code deepFor} method with.
     * @param each  the {@code Each} to call the {@code deepFor} method with.
     */
    protected abstract void deepFor(A array, Each<T, RuntimeException> each);

    /**
     * Implemented this method to return the number of elements in the array.
     *
     * @return the number of elements in the array.
     */
    protected abstract int arrayElementNumber();

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

        CountingEach each = new CountingEach() {

            @Override
            protected void runWithCount(T element, int[] axis) {
            }
        };

        deepFor(array, each);

        assertEquals("the each run method should not have been called.", 0, each.getCount());
    }

    @Test
    public void testDeepForDoesNotRunEachWithNullArray() {

        CountingEach each = new CountingEach() {

            @Override
            protected void runWithCount(T element, int[] axis) {
            }
        };

        deepFor(null, each);

        assertEquals("the each run method should not have been called.", 0, each.getCount());
    }

    @Test
    public void testDeepForPassesCorrectElementsIntoEach() {

        final int[] index = {0};

        assertDeepForCount(array, new CountingEach() {

            @Override
            public void runWithCount(T element, int[] axis) {

                assertEquals("the array element should be correct.", getElementFromCount(array, index[0]++), element);
            }
        });
    }

    @Test
    public void testDeepForPassesCorrectAxisIntoEach() {

        final int[] index = {0};

        assertDeepForCount(array, new CountingEach() {

            @Override
            public void runWithCount(T element, int[] axis) {

                assertEquals("the array element should be correct.",
                        getElementFromCount(array, index[0]++), getElementFromAxis(array, axis));
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
     * @param each the each to run.
     */
    private void assertDeepForCount(A array, CountingEach each) {

        deepFor(array, each);

        assertEquals("each was run the correct number of times.", arrayElementNumber(), each.getCount());
    }

    /**
     * This {@link Each} implementation keeps track of how many times the {@link Each#run(T, int[])} run method has been
     * called.
     */
    private abstract class CountingEach implements Each<T, RuntimeException> {

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
