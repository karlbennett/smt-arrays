package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.INTEGER_OBJECTS_2D;
import static shiver.me.timbers.Constants.INTS_2D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith2DIntArrayTest extends AbstractDeepAutoBoxTest<Integer[][], int[][]> {

    public ArrayUtilsDeepAutoBoxWith2DIntArrayTest() {
        super(INTEGER_OBJECTS_2D, INTS_2D);
    }

    @Override
    protected Integer[][] deepAutoBox(int[][] array) {

        return ArrayUtils.deepAutoBox(Integer[][].class, array);
    }

    @Override
    protected int[][] deepAutoUnBox(Integer[][] array) {

        return ArrayUtils.deepAutoBox(int[][].class, array);
    }

    @Override
    protected Integer[][] emptyBoxedArray() {

        return new Integer[0][];
    }

    @Override
    protected int[][] emptyArrayToBeAutoBoxed() {

        return new int[0][];
    }
}
