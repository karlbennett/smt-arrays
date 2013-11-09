package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import static shiver.me.timbers.ArrayUtils.Each;
import static shiver.me.timbers.Constants.BYTES_2D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsTraverseWithUneven2DArrayTest extends AbstractTraverseWithUnevenTypedArrayTest<byte[], Byte> {

    private static final byte[] COUNT_ARRAY = {
            BYTES_2D[0][0],
            BYTES_2D[0][1],
            BYTES_2D[0][2],
            BYTES_2D[1][0],
            BYTES_2D[1][1],
            BYTES_2D[1][2],
            BYTES_2D[2][0],
            BYTES_2D[2][1],
            BYTES_2D[2][2],
    };

    public ArrayUtilsTraverseWithUneven2DArrayTest() {
        super(BYTES_2D, new byte[0][], 9,
                new byte[][]{
                        {BYTES_2D[0][0], BYTES_2D[0][1], BYTES_2D[0][2]},
                        null,
                        {}
                },
                new Each<Byte, RuntimeException>() {
                    @Override
                    public void run(Byte element, int[] axis) throws RuntimeException {
                    }
                });
    }

    @Override
    protected void deepFor(byte[][] array, Each<Byte, RuntimeException> each) {

        ArrayUtils.traverse(array, each);
    }

    @Override
    protected Byte getElementFromCount(byte[][] array, int count) {

        return COUNT_ARRAY[count];
    }

    @Override
    protected Byte getElementFromAxis(byte[][] array, int[] axis) {

        return array[axis[0]][axis[1]];
    }
}
