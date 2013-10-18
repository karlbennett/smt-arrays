package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.CHARACTER_OBJECTS_3D;
import static shiver.me.timbers.Constants.CHARS_3D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepAutoBoxWith3DCharArrayTest extends AbstractDeepAutoBoxTest<Character[][][], char[][][]> {

    public ArrayUtilsDeepAutoBoxWith3DCharArrayTest() {
        super(CHARACTER_OBJECTS_3D, CHARS_3D);
    }

    @Override
    protected Character[][][] deepAutoBox(char[][][] array) {

        return ArrayUtils.deepAutoBox(Character[][][].class, array);
    }

    @Override
    protected char[][][] deepAutoUnBox(Character[][][] array) {

        return ArrayUtils.deepAutoBox(char[][][].class, array);
    }

    @Override
    protected Character[][][] emptyBoxedArray() {

        return new Character[0][][];
    }

    @Override
    protected char[][][] emptyArrayToBeAutoBoxed() {

        return new char[0][][];
    }
}
