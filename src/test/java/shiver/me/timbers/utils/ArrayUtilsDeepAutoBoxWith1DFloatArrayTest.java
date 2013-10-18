package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.FLOATS_1D;
import static shiver.me.timbers.Constants.FLOAT_OBJECTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith1DFloatArrayTest extends AbstractDeepAutoBoxTest<Float[], float[]> {

    public ArrayUtilsDeepAutoBoxWith1DFloatArrayTest() {
        super(FLOAT_OBJECTS_1D, FLOATS_1D);
    }

    @Override
    protected Float[] deepAutoBox(float[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected float[] deepAutoUnBox(Float[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected Float[] emptyBoxedArray() {

        return new Float[0];
    }

    @Override
    protected float[] emptyArrayToBeAutoBoxed() {

        return new float[0];
    }
}
