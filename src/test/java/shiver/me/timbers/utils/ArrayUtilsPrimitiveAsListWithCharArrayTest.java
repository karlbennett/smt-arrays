package shiver.me.timbers.utils;

import shiver.me.timbers.ArrayUtils;

import java.util.List;

import static shiver.me.timbers.Constants.CHARACTER_LIST;
import static shiver.me.timbers.Constants.CHARS_1D;

/**
 * @author Karl Bennett
 */
public class ArrayUtilsPrimitiveAsListWithCharArrayTest extends AbstractPrimitiveAsListTest<Character, char[]> {

    public ArrayUtilsPrimitiveAsListWithCharArrayTest() {
        super(CHARACTER_LIST, CHARS_1D);
    }

    @Override
    protected List<Character> primitiveAsList(char[] array) {

        return ArrayUtils.primitiveAsList(array);
    }
}
