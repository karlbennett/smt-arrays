package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.DOUBLES_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsTraverseWithDoubleArrayTest extends AbstractTraverseTest<double[], Double> {

    public ArrayUtilsTraverseWithDoubleArrayTest() {
        super(DOUBLES_1D, new double[0], DOUBLES_1D.length);
    }

    @Override
    protected void deepFor(double[] array, Each<Double, RuntimeException> each) {

        ArrayUtils.traverse(array, each);
    }

    @Override
    protected Double getElementFromCount(double[] array, int count) {

        return array[count];
    }

    @Override
    protected Double getElementFromAxis(double[] array, int[] axis) {

        return array[axis[0]];
    }
}
