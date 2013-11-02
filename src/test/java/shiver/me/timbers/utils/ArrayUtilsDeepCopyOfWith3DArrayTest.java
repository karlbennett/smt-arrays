package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.NOT_BLANK_3D_ARRAY;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepCopyOfWith3DArrayTest extends AbstractDeepCopyTest<Object[][][]> {

    public ArrayUtilsDeepCopyOfWith3DArrayTest() {
        super(NOT_BLANK_3D_ARRAY);
    }

    @Override
    protected Object[][][] deepCopyOf(Object[][][] array) {

        return ArrayUtils.deepCopyOf(array);
    }

    @Override
    protected Object[][][] manualCopyOf(Object[][][] array) {

        return new Object[][][]{
                NOT_BLANK_3D_ARRAY[0],
                {
                        NOT_BLANK_3D_ARRAY[1][0],
                        {NOT_BLANK_3D_ARRAY[1][1][0]},
                        {NOT_BLANK_3D_ARRAY[1][2][0], NOT_BLANK_3D_ARRAY[1][2][1]},
                },
                {
                        {NOT_BLANK_3D_ARRAY[2][0][0], NOT_BLANK_3D_ARRAY[2][0][1], NOT_BLANK_3D_ARRAY[2][0][2]},
                        {NOT_BLANK_3D_ARRAY[2][1][0], NOT_BLANK_3D_ARRAY[2][1][1], NOT_BLANK_3D_ARRAY[2][1][2]},
                        {NOT_BLANK_3D_ARRAY[2][2][0], NOT_BLANK_3D_ARRAY[2][2][1], NOT_BLANK_3D_ARRAY[2][2][2]}
                },
                NOT_BLANK_3D_ARRAY[3]
        };
    }

    @Override
    protected void mutateArray(Object[][][] array) {

        array[1][1][0] = 99;
    }

    @Override
    protected Object[][][] emptyArray() {

        return new Object[0][0][0];
    }
}
