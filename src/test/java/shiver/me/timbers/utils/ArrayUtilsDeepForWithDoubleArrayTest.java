package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.DOUBLES_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepForWithDoubleArrayTest extends AbstractDeepForTest<double[], Double> {

    public ArrayUtilsDeepForWithDoubleArrayTest() {
        super(DOUBLES_1D);
    }

    @Override
    protected void deepFor(double[] array, Each<Double, RuntimeException> each) {

        ArrayUtils.deepFor(array, each);
    }

    @Override
    protected int arrayElementNumber() {

        return DOUBLES_1D.length;
    }

    @Override
    protected Double getElementFromCount(double[] array, int count) {

        return array[count];
    }

    @Override
    protected Double getElementFromAxis(double[] array, int[] axis) {

        return array[axis[0]];
    }

    @Override
    protected double[] emptyArray() {

        return new double[0];
    }
}
