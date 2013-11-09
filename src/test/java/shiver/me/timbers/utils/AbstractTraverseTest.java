package shiver.me.timbers.utils;

/**
 * @author Karl Bennett
 */
public abstract class AbstractTraverseTest<A, T> extends AbstractIterationTest<A, T> {

    protected AbstractTraverseTest(A array, A emptyArray, int arrayElementNumber) {
        super(array, emptyArray, arrayElementNumber, 1, 1);
    }
}
