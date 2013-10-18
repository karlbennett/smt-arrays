package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.FLOATS_2D;
import static shiver.me.timbers.Constants.FLOAT_OBJECTS_2D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith2DFloatArrayTest extends AbstractDeepAutoBoxTest<Float[][], float[][]> {

    public ArrayUtilsDeepAutoBoxWith2DFloatArrayTest() {
        super(FLOAT_OBJECTS_2D, FLOATS_2D);
    }

    @Override
    protected Float[][] deepAutoBox(float[][] array) {

        return ArrayUtils.deepAutoBox(Float[][].class, array);
    }

    @Override
    protected float[][] deepAutoUnBox(Float[][] array) {

        return ArrayUtils.deepAutoBox(float[][].class, array);
    }

    @Override
    protected Float[][] emptyBoxedArray() {

        return new Float[0][];
    }

    @Override
    protected float[][] emptyArrayToBeAutoBoxed() {

        return new float[0][];
    }
}
