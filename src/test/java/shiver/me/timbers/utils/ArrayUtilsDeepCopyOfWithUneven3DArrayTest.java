package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.Constants.UNEVEN_BYTES_3D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsDeepCopyOfWithUneven3DArrayTest extends AbstractDeepCopyTest<byte[][][]> {

    public ArrayUtilsDeepCopyOfWithUneven3DArrayTest() {
        super(UNEVEN_BYTES_3D);
    }

    @Override
    protected byte[][][] deepCopyOf(byte[][][] array) {

        return ArrayUtils.deepCopyOf(array);
    }

    @Override
    protected byte[][][] manualCopyOf(byte[][][] array) {

        return new byte[][][]{
                {
                        {UNEVEN_BYTES_3D[0][0][0]},
                        {UNEVEN_BYTES_3D[0][1][0], UNEVEN_BYTES_3D[0][1][1]},
                        {UNEVEN_BYTES_3D[0][2][0], UNEVEN_BYTES_3D[0][2][1], UNEVEN_BYTES_3D[0][2][2]}
                },
                {
                        {UNEVEN_BYTES_3D[1][0][0], UNEVEN_BYTES_3D[1][0][1], UNEVEN_BYTES_3D[1][0][2]},
                        {UNEVEN_BYTES_3D[1][1][0], UNEVEN_BYTES_3D[1][1][1], UNEVEN_BYTES_3D[1][1][2]},
                        {UNEVEN_BYTES_3D[1][2][0], UNEVEN_BYTES_3D[1][2][1], UNEVEN_BYTES_3D[1][2][2]}
                },
                {
                        {UNEVEN_BYTES_3D[2][0][0], UNEVEN_BYTES_3D[2][0][1], UNEVEN_BYTES_3D[2][0][2]},
                        {UNEVEN_BYTES_3D[2][1][0], UNEVEN_BYTES_3D[2][1][1]},
                        {UNEVEN_BYTES_3D[2][2][0]}
                }
        };
    }

    @Override
    protected void mutateArray(byte[][][] array) {

        array[1][1][1] = 99;
    }

    @Override
    protected byte[][][] emptyArray() {

        return new byte[0][][];
    }
}
