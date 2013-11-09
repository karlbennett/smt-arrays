package shiver.me.timbers.utils;

/**
 * This class can be used to create different permutations of tests of the
 * {@link shiver.me.timbers.ArrayUtils#deepFor} methods.
 *
 * @author Karl Bennett
 */
public abstract class AbstractDeepForTest<A, T> extends AbstractIterationTest<A, T> {

    protected AbstractDeepForTest(A array, A emptyArray, int arrayElementNumber) {
        super(array, emptyArray, arrayElementNumber, 0, 0);
    }
}
