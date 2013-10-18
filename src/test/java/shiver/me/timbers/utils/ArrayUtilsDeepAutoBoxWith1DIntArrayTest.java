package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.INTEGER_OBJECTS_1D;
import static shiver.me.timbers.Constants.INTS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith1DIntArrayTest extends AbstractDeepAutoBoxTest<Integer[], int[]> {

    public ArrayUtilsDeepAutoBoxWith1DIntArrayTest() {
        super(INTEGER_OBJECTS_1D, INTS_1D);
    }

    @Override
    protected Integer[] deepAutoBox(int[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected int[] deepAutoUnBox(Integer[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected Integer[] emptyBoxedArray() {

        return new Integer[0];
    }

    @Override
    protected int[] emptyArrayToBeAutoBoxed() {

        return new int[0];
    }
}
