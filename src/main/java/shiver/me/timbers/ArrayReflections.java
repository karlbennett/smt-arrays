package shiver.me.timbers;

import static shiver.me.timbers.Asserts.isNotNull;

/**
 * A class that contains useful helper methods for manipulating arrays.
 *
 * @author Karl Bennett
 */
public final class ArrayReflections {

    private ArrayReflections() {
    }

    /**
     * Check that the supplied {@code type} is an array.
     *
     * @param type the type to check.
     * @return {@code true} if the type is of an array, otherwise {@code false}.
     */
    public static boolean isArray(Class type) {

        return isNotNull(type) && type.isArray();
    }

    /**
     * Check that the supplied object is an array.
     *
     * @param object the object to check.
     * @return {@code true} if the object is an array, otherwise {@code false}.
     */
    public static boolean isArray(Object object) {

        return isNotNull(object) && isArray(object.getClass());
    }

    /**
     * Check that the supplied {@code type} is not an array.
     *
     * @param type the type to check.
     * @return {@code true} if the type is not of an array, otherwise {@code false}.
     */
    public static boolean isNotArray(Class type) {

        return !isArray(type);
    }

    /**
     * Check that the supplied object is not an array.
     *
     * @param object the object to check.
     * @return {@code true} if the object is not an array, otherwise {@code false}.
     */
    public static boolean isNotArray(Object object) {

        return !isArray(object);
    }

    /**
     * Find the type of the elements contained in the supplied array {@code Class}.
     *
     * @param type the type of array that is being checked.
     * @return the type of element contained in the supplied array {@code Class}.
     */
    public static Class findComponentType(Class type) {

        // When the class is no longer an array we have recursed to the last dimension, so return the type.
        if (!type.isArray()) return type;

        return findComponentType(type.getComponentType());
    }

    /**
     * Find the type of the elements contained in the supplied array. If the supplied object isn't an array then it's
     * {@link Class} is just returned.
     *
     * @param array the array to check.
     * @return the type of element contained in the supplied array.
     */
    public static Class findComponentType(Object array) {

        return findComponentType(array.getClass());
    }

    /**
     * Find the number of dimensions for the supplied array. If the supplied object is not an array then the number of
     * dimensions returned will be {@code 0}.
     *
     * @param array the array to find the dimensions of.
     * @return the number of dimensions in the supplied array.
     */
    public static int findDimensions(Object array) {

        return 0;
    }
}
