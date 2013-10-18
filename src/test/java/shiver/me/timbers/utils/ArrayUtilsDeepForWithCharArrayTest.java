package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.CHARS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepForWithCharArrayTest extends AbstractDeepForTest<char[], Character> {

    public ArrayUtilsDeepForWithCharArrayTest() {
        super(CHARS_1D);
    }

    @Override
    protected void deepFor(char[] array, Each<Character, RuntimeException> each) {

        ArrayUtils.deepFor(array, each);
    }

    @Override
    protected int arrayElementNumber() {

        return CHARS_1D.length;
    }

    @Override
    protected Character getElementFromCount(char[] array, int count) {

        return array[count];
    }

    @Override
    protected Character getElementFromAxis(char[] array, int[] axis) {

        return array[axis[0]];
    }

    @Override
    protected char[] emptyArray() {

        return new char[0];
    }
}
