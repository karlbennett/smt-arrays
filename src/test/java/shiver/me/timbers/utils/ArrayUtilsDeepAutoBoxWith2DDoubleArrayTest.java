package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.DOUBLES_2D;
import static shiver.me.timbers.Constants.DOUBLE_OBJECTS_2D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith2DDoubleArrayTest extends AbstractDeepAutoBoxTest<Double[][], double[][]> {

    public ArrayUtilsDeepAutoBoxWith2DDoubleArrayTest() {
        super(DOUBLE_OBJECTS_2D, DOUBLES_2D);
    }

    @Override
    protected Double[][] deepAutoBox(double[][] array) {

        return ArrayUtils.deepAutoBox(Double[][].class, array);
    }

    @Override
    protected double[][] deepAutoUnBox(Double[][] array) {

        return ArrayUtils.deepAutoBox(double[][].class, array);
    }

    @Override
    protected Double[][] emptyBoxedArray() {

        return new Double[0][];
    }

    @Override
    protected double[][] emptyArrayToBeAutoBoxed() {

        return new double[0][];
    }
}
