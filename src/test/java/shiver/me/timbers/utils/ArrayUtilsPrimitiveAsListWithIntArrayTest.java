package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import java.util.List;

import static shiver.me.timbers.Constants.INTEGER_LIST;
import static shiver.me.timbers.Constants.INTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsPrimitiveAsListWithIntArrayTest extends AbstractPrimitiveAsListTest<Integer, int[]> {

    public ArrayUtilsPrimitiveAsListWithIntArrayTest() {
        super(INTEGER_LIST, INTS_1D);
    }

    @Override
    protected List<Integer> primitiveAsList(int[] array) {

        return ArrayUtils.primitiveAsList(array);
    }
}
