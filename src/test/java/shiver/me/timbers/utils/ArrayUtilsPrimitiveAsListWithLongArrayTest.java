package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import java.util.List;

import static shiver.me.timbers.Constants.LONGS_1D;
import static shiver.me.timbers.Constants.LONG_LIST;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsPrimitiveAsListWithLongArrayTest extends AbstractPrimitiveAsListTest<Long, long[]> {

    public ArrayUtilsPrimitiveAsListWithLongArrayTest() {
        super(LONG_LIST, LONGS_1D);
    }

    @Override
    protected List<Long> primitiveAsList(long[] array) {

        return ArrayUtils.primitiveAsList(array);
    }
}
