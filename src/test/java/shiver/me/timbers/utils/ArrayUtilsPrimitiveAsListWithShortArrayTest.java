package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import java.util.List;

import static shiver.me.timbers.Constants.SHORTS_1D;
import static shiver.me.timbers.Constants.SHORT_LIST;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsPrimitiveAsListWithShortArrayTest extends AbstractPrimitiveAsListTest<Short, short[]> {

    public ArrayUtilsPrimitiveAsListWithShortArrayTest() {
        super(SHORT_LIST, SHORTS_1D);
    }

    @Override
    protected List<Short> primitiveAsList(short[] array) {

        return ArrayUtils.primitiveAsList(array);
    }
}
