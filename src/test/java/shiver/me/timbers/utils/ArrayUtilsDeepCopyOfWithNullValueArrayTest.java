package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.NOT_EMPTY_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepCopyOfWithNullValueArrayTest extends AbstractDeepCopyTest<Object[]> {

    public ArrayUtilsDeepCopyOfWithNullValueArrayTest() {
        super(NOT_EMPTY_ARRAY);
    }

    @Override
    protected Object[] deepCopyOf(Object[] array) {

        return ArrayUtils.deepCopyOf(array);
    }

    @Override
    protected Object[] manualCopyOf(Object[] array) {

        return new Object[]{NOT_EMPTY_ARRAY[0], NOT_EMPTY_ARRAY[1], NOT_EMPTY_ARRAY[2]};
    }

    @Override
    protected void mutateArray(Object[] array) {

        array[1] = 99;
    }

    @Override
    protected Object[] emptyArray() {

        return new Object[0];
    }
}
