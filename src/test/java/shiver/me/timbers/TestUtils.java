package shiver.me.timbers;

import java.lang.reflect.Array;

import static shiver.me.timbers.Asserts.isNull;

/**
 * A utility class that contains helper methods for testing the array utility methods.
 *
 * @author Karl Bennett
 */
public final class TestUtils {

    private TestUtils() {
    }

    /**
     * Convert the supplied array {@link Object} into an array of {@link Object}s. This is useful for converting the
     * tests arrays that have have had their compile time types erased by generics.
     *
     * @param object the array to convert.
     * @return the converted array {@link Object}.
     */
    public static Object[] objectToArray(Object object) {

        if (isNull(object)) return null;

        final int length = Array.getLength(object);

        final Object[] array = new Object[length];

        for (int i = 0; i < length; i++) {

            array[i] = Array.get(object, i);
        }

        Object blah = new short[][][]{{{1, 2}, null}, null};

        return array;
    }
}
