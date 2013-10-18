package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.CHARACTER_OBJECTS_1D;
import static shiver.me.timbers.Constants.CHARS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith1DCharArrayTest extends AbstractDeepAutoBoxTest<Character[], char[]> {

    public ArrayUtilsDeepAutoBoxWith1DCharArrayTest() {
        super(CHARACTER_OBJECTS_1D, CHARS_1D);
    }

    @Override
    protected Character[] deepAutoBox(char[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected char[] deepAutoUnBox(Character[] array) {

        return ArrayUtils.deepAutoBox(array);
    }

    @Override
    protected Character[] emptyBoxedArray() {

        return new Character[0];
    }

    @Override
    protected char[] emptyArrayToBeAutoBoxed() {

        return new char[0];
    }
}
