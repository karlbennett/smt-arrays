package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.FLOATS_3D;
import static shiver.me.timbers.Constants.FLOAT_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith3DFloatArrayTest extends AbstractDeepAutoBoxTest<Float[][][], float[][][]> {

    public ArrayUtilsDeepAutoBoxWith3DFloatArrayTest() {
        super(FLOAT_OBJECTS_3D, FLOATS_3D);
    }

    @Override
    protected Float[][][] deepAutoBox(float[][][] array) {

        return ArrayUtils.deepAutoBox(Float[][][].class, array);
    }

    @Override
    protected float[][][] deepAutoUnBox(Float[][][] array) {

        return ArrayUtils.deepAutoBox(float[][][].class, array);
    }

    @Override
    protected Float[][][] emptyBoxedArray() {

        return new Float[0][][];
    }

    @Override
    protected float[][][] emptyArrayToBeAutoBoxed() {

        return new float[0][][];
    }
}
