package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.BYTES_3D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsTraverseWithUneven3DArrayTest extends AbstractTraverseWithUnevenTypedArrayTest<byte[][], Byte> {

    private static final byte[] COUNT_ARRAY = {
            BYTES_3D[0][0][0],
            BYTES_3D[0][0][1],
            BYTES_3D[0][0][2],
            BYTES_3D[0][1][0],
            BYTES_3D[0][1][1],
            BYTES_3D[0][1][2],
            BYTES_3D[0][2][0],
            BYTES_3D[0][2][1],
            BYTES_3D[0][2][2],
            BYTES_3D[1][0][0],
            BYTES_3D[1][0][1],
            BYTES_3D[1][0][2],
            BYTES_3D[1][1][0],
            BYTES_3D[1][1][1],
            BYTES_3D[1][1][2],
            BYTES_3D[1][2][0],
            BYTES_3D[1][2][1],
            BYTES_3D[1][2][2],
            BYTES_3D[2][0][0],
            BYTES_3D[2][0][1],
            BYTES_3D[2][0][2],
            BYTES_3D[2][1][0],
            BYTES_3D[2][1][1],
            BYTES_3D[2][1][2],
            BYTES_3D[2][2][0],
            BYTES_3D[2][2][1],
            BYTES_3D[2][2][2],
    };

    public ArrayUtilsTraverseWithUneven3DArrayTest() {
        super(BYTES_3D, new byte[0][][], 27,
                new byte[][][]{
                        {
                                {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                                {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                                {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
                        },
                        {
                        }
                },
                new Each<Byte, RuntimeException>() {
                    @Override
                    public void run(Byte element, int[] axis) throws RuntimeException {
                    }
                });
    }

    @Override
    protected void deepFor(byte[][][] array, Each<Byte, RuntimeException> each) {

        ArrayUtils.traverse(array, each);
    }

    @Override
    protected Byte getElementFromCount(byte[][][] array, int count) {

        return COUNT_ARRAY[count];
    }

    @Override
    protected Byte getElementFromAxis(byte[][][] array, int[] axis) {

        return array[axis[0]][axis[1]][axis[2]];
    }
}
