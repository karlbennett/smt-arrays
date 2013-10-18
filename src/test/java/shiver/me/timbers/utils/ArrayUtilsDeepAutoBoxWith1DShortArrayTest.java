package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.SHORTS_1D;
import static shiver.me.timbers.Constants.SHORT_OBJECTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith1DShortArrayTest extends AbstractDeepAutoBoxTest<Short[], short[]> {

    public ArrayUtilsDeepAutoBoxWith1DShortArrayTest() {
        super(SHORT_OBJECTS_1D, SHORTS_1D);
    }

    @Override
    protected Short[] deepAutoBox(short[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected short[] deepAutoUnBox(Short[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected Short[] emptyBoxedArray() {

        return new Short[0];
    }

    @Override
    protected short[] emptyArrayToBeAutoBoxed() {

        return new short[0];
    }
}
