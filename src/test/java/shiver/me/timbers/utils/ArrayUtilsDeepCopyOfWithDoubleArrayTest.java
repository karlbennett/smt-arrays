package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.DOUBLES_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepCopyOfWithDoubleArrayTest extends AbstractDeepCopyTest<double[]> {

    public ArrayUtilsDeepCopyOfWithDoubleArrayTest() {
        super(DOUBLES_1D);
    }

    @Override
    protected double[] deepCopyOf(double[] array) {

        return ArrayUtils.deepCopyOf(array);
    }

    @Override
    protected double[] manualCopyOf(double[] array) {

        return new double[]{DOUBLES_1D[0], DOUBLES_1D[1], DOUBLES_1D[2]};
    }

    @Override
    protected void mutateArray(double[] array) {

        array[1] = 99;
    }

    @Override
    protected double[] emptyArray() {

        return new double[0];
    }
}
