package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.FLOATS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepCopyOfWithFloatArrayTest extends AbstractDeepCopyTest<float[]> {

    public ArrayUtilsDeepCopyOfWithFloatArrayTest() {
        super(FLOATS_1D);
    }

    @Override
    protected float[] deepCopyOf(float[] array) {

        return ArrayUtils.deepCopyOf(array);
    }

    @Override
    protected float[] manualCopyOf(float[] array) {

        return new float[]{FLOATS_1D[0], FLOATS_1D[1], FLOATS_1D[2]};
    }

    @Override
    protected void mutateArray(float[] array) {

        array[1] = 99;
    }

    @Override
    protected float[] emptyArray() {

        return new float[0];
    }
}
