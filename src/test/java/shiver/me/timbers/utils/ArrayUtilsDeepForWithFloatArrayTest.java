package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.FLOATS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepForWithFloatArrayTest extends AbstractDeepForTest<float[], Float> {

    public ArrayUtilsDeepForWithFloatArrayTest() {
        super(FLOATS_1D);
    }

    @Override
    protected void deepFor(float[] array, Each<Float, RuntimeException> each) {

        ArrayUtils.deepFor(array, each);
    }

    @Override
    protected int arrayElementNumber() {

        return FLOATS_1D.length;
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
