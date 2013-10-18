package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import java.util.List;

import static shiver.me.timbers.Constants.FLOATS_1D;
import static shiver.me.timbers.Constants.FLOAT_LIST;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsPrimitiveAsListWithFloatArrayTest extends AbstractPrimitiveAsListTest<Float, float[]> {

    public ArrayUtilsPrimitiveAsListWithFloatArrayTest() {
        super(FLOAT_LIST, FLOATS_1D);
    }

    @Override
    protected List<Float> primitiveAsList(float[] array) {

        return ArrayUtils.primitiveAsList(array);
    }
}
