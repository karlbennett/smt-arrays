package shiver.me.timbers.utils;

import org.junit.Test;

import static shiver.me.timbers.ArrayUtils.Each;

/**
 * @author Karl Bennett
 */
public abstract class AbstractTraverseWithUnevenTypedArrayTest<A, T> extends AbstractIterationTest<A[], T> {

    private final A[] unevenArray;
    private final Each<T, RuntimeException> each;

    protected AbstractTraverseWithUnevenTypedArrayTest(A[] array, A[] emptyArray, int arrayElementNumber,
                                                       A[] unevenArray, Each<T, RuntimeException> each) {
        super(array, emptyArray, arrayElementNumber, 1, 1);

        this.unevenArray = unevenArray;
        this.each = each;
    }

    @Test(expected = ClassCastException.class)
    public void testUnevenTypedArray() {

        deepFor(unevenArray, each);
    }
}
