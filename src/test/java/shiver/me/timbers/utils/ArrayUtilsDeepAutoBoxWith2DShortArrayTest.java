package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.SHORTS_2D;
import static shiver.me.timbers.Constants.SHORT_OBJECTS_2D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith2DShortArrayTest extends AbstractDeepAutoBoxTest<Short[][], short[][]> {

    public ArrayUtilsDeepAutoBoxWith2DShortArrayTest() {
        super(SHORT_OBJECTS_2D, SHORTS_2D);
    }

    @Override
    protected Short[][] deepAutoBox(short[][] array) {

        return ArrayUtils.deepAutoBox(Short[][].class, array);
    }

    @Override
    protected short[][] deepAutoUnBox(Short[][] array) {

        return ArrayUtils.deepAutoBox(short[][].class, array);
    }

    @Override
    protected Short[][] emptyBoxedArray() {

        return new Short[0][];
    }

    @Override
    protected short[][] emptyArrayToBeAutoBoxed() {

        return new short[0][];
    }
}
