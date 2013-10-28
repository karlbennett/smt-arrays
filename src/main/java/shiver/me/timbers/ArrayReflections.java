package shiver.me.timbers;

import java.lang.reflect.Array;

import static shiver.me.timbers.Asserts.isNotNull;
import static shiver.me.timbers.Asserts.isNull;

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

        if (isNull(array) || isNotArray(array)) return 0;

        return array.getClass().getName().split("\\[").length - 1;
    }

    /**
     * Check if the supplied {@link Object} is empty, assuming it is an array. If the object is not an array then the
     * method will return {@code false}.
     *
     * @param object the array to check.
     * @return {@code true} if the array has a length of zero, or it's final dimension has length zero, otherwise
     *         return false.
     */
    public static boolean isEmpty(Object object) {

        if (isNull(object)) {

            return true;
        }

        if (isNotArray(object)) {

            return false;
        }

        final int length = Array.getLength(object);

        if (isNotArray(object.getClass().getComponentType())) {

            return 0 == length;
        }

        for (int i = 0; i < length; i++) {

            if (!isEmpty(Array.get(object, i))) {

                return false;
            }
        }

        return true;
    }

    /**
     * Check that the supplied {@link Object} is not empty, assuming it is an array. That is if it is not {@code null}
     * and has a length greater than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not empty, otherwise {@code false}.
     */
    public static boolean isNotEmpty(Object array) {

        return !isEmpty(array);
    }

    /**
     * Check that the supplied {@link Object} is blank, assuming it's an array. That is if a call to
     * {@link #isEmpty(Object)} would return {@code true} or of it only contains {@code null} values.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(Object array) {

        if (ArrayReflections.isEmpty(array)) {

            return true;
        }

        if (Byte.class.isAssignableFrom(array.getClass())) {

            return array.equals((byte) 0);
        }

        if (Character.class.isAssignableFrom(array.getClass())) {

            return array.equals((char) 0);
        }

        if (Short.class.isAssignableFrom(array.getClass())) {

            return array.equals((short) 0);
        }

        if (Integer.class.isAssignableFrom(array.getClass())) {

            return array.equals(0);
        }

        if (Long.class.isAssignableFrom(array.getClass())) {

            return array.equals((long) 0);
        }

        if (Float.class.isAssignableFrom(array.getClass())) {

            return array.equals((float) 0);
        }

        if (Double.class.isAssignableFrom(array.getClass())) {

            return array.equals((double) 0);
        }

        if (isNotArray(array)) {

            return false;
        }

        for (int i = 0; i < Array.getLength(array); i++) {

            if (!isBlank(Array.get(array, i))) {

                return false;
            }
        }

        return true;
    }

    /**
     * Check that the supplied {@link Object} is not blank, that is if a call to {@link #isBlank(Object)} would return
     * {@code false}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(Object array) {

        return !isBlank(array);
    }
}
