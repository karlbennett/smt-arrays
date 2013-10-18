package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import java.util.List;

import static shiver.me.timbers.Constants.DOUBLES_1D;
import static shiver.me.timbers.Constants.DOUBLE_LIST;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsPrimitiveAsListWithDoubleArrayTest extends AbstractPrimitiveAsListTest<Double, double[]> {

    public ArrayUtilsPrimitiveAsListWithDoubleArrayTest() {
        super(DOUBLE_LIST, DOUBLES_1D);
    }

    @Override
    protected List<Double> primitiveAsList(double[] array) {

        return ArrayUtils.primitiveAsList(array);
    }
}
