package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.FLOATS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsTraverseWithFloatArrayTest extends AbstractTraverseTest<float[], Float> {

    public ArrayUtilsTraverseWithFloatArrayTest() {
        super(FLOATS_1D, new float[0], FLOATS_1D.length);
    }

    @Override
    protected void deepFor(float[] array, Each<Float, RuntimeException> each) {

        ArrayUtils.traverse(array, each);
    }

    @Override
    protected Float getElementFromCount(float[] array, int count) {

        return array[count];
    }

    @Override
    protected Float getElementFromAxis(float[] array, int[] axis) {

        return array[axis[0]];
    }
}
