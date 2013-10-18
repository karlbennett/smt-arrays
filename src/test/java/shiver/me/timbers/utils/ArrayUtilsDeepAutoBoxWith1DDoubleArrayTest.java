package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.DOUBLES_1D;
import static shiver.me.timbers.Constants.DOUBLE_OBJECTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith1DDoubleArrayTest extends AbstractDeepAutoBoxTest<Double[], double[]> {

    public ArrayUtilsDeepAutoBoxWith1DDoubleArrayTest() {
        super(DOUBLE_OBJECTS_1D, DOUBLES_1D);
    }

    @Override
    protected Double[] deepAutoBox(double[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected double[] deepAutoUnBox(Double[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected Double[] emptyBoxedArray() {

        return new Double[0];
    }

    @Override
    protected double[] emptyArrayToBeAutoBoxed() {

        return new double[0];
    }
}
