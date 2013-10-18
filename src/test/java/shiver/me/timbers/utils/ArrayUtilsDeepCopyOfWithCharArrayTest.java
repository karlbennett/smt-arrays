package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.CHARS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepCopyOfWithCharArrayTest extends AbstractDeepCopyTest<char[]> {

    public ArrayUtilsDeepCopyOfWithCharArrayTest() {
        super(CHARS_1D);
    }

    @Override
    protected char[] deepCopyOf(char[] array) {

        return ArrayUtils.deepCopyOf(array);
    }

    @Override
    protected char[] manualCopyOf(char[] array) {

        return new char[]{CHARS_1D[0], CHARS_1D[1], CHARS_1D[2]};
    }

    @Override
    protected void mutateArray(char[] array) {

        array[1] = 99;
    }

    @Override
    protected char[] emptyArray() {

        return new char[0];
    }
}
