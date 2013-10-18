package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.LONGS_2D;
import static shiver.me.timbers.Constants.LONG_OBJECTS_2D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith2DLongArrayTest extends AbstractDeepAutoBoxTest<Long[][], long[][]> {

    public ArrayUtilsDeepAutoBoxWith2DLongArrayTest() {
        super(LONG_OBJECTS_2D, LONGS_2D);
    }

    @Override
    protected Long[][] deepAutoBox(long[][] array) {

        return ArrayUtils.deepAutoBox(Long[][].class, array);
    }

    @Override
    protected long[][] deepAutoUnBox(Long[][] array) {

        return ArrayUtils.deepAutoBox(long[][].class, array);
    }

    @Override
    protected Long[][] emptyBoxedArray() {

        return new Long[0][];
    }

    @Override
    protected long[][] emptyArrayToBeAutoBoxed() {

        return new long[0][];
    }
}
