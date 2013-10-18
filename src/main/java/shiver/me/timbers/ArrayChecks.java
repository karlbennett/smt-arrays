package shiver.me.timbers;

import java.lang.reflect.Array;

import static shiver.me.timbers.ArrayReflections.isNotArray;

/**
 * A class that contains useful helper methods for manipulating arrays.
 *
 * @author Karl Bennett
 */
public final class ArrayChecks {

    private ArrayChecks() {
    }

    /**
     * A private inner method that carries out the actual {@code isEmpty} recursive logic on any given object. If the
     * object is not an array then the method will return {@code false}.
     *
     * @param object the array to check.
     * @return {@code true} if the array has a length of zero, or it's final dimension has length zero, otherwise
     *         return false.
     */
    private static boolean innerIsEmpty(Object object) {

        if (isNotArray(object)) return false;

        final int length = Array.getLength(object);

        if (isNotArray(object.getClass().getComponentType())) return 0 == length;

        for (int i = 0; i < length; i++) {

            if (!innerIsEmpty(Array.get(object, i))) return false;
        }

        return true;
    }

    /**
     * Check that the supplied array is empty, that is if it is {@code null} or it's final dimension has a length of
     * {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static <T> boolean isEmpty(T[] array) {

        return innerIsEmpty(array);
    }

    /**
     * Check that the supplied {@code byte} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(byte[] array) {

        return innerIsEmpty(array);
    }

    /**
     * Check that the supplied {@code char} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(char[] array) {

        return innerIsEmpty(array);
    }

    /**
     * Check that the supplied {@code short} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(short[] array) {

        return innerIsEmpty(array);
    }

    /**
     * Check that the supplied {@code int} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(int[] array) {

        return innerIsEmpty(array);
    }

    /**
     * Check that the supplied {@code long} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(long[] array) {

        return innerIsEmpty(array);
    }

    /**
     * Check that the supplied {@code float} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(float[] array) {

        return innerIsEmpty(array);
    }

    /**
     * Check that the supplied {@code double} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(double[] array) {

        return innerIsEmpty(array);
    }

    /**
     * Check that the supplied array is not empty, that is if it is not {@code null} and has a length greater than
     * {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not empty, otherwise {@code false}.
     */
    public static <T> boolean isNotEmpty(T[] array) {

        return !isEmpty(array);
    }

    /**
     * Check that the supplied {@code byte} array is not empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not empty, otherwise {@code false}.
     */
    public static boolean isNotEmpty(byte[] array) {

        return !isEmpty(array);
    }

    /**
     * Check that the supplied {@code char} array is not empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not empty, otherwise {@code false}.
     */
    public static boolean isNotEmpty(char[] array) {

        return !isEmpty(array);
    }

    /**
     * Check that the supplied {@code short} array is not empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not empty, otherwise {@code false}.
     */
    public static boolean isNotEmpty(short[] array) {

        return !isEmpty(array);
    }

    /**
     * Check that the supplied {@code int} array is not empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not empty, otherwise {@code false}.
     */
    public static boolean isNotEmpty(int[] array) {

        return !isEmpty(array);
    }

    /**
     * Check that the supplied {@code long} array is not empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not empty, otherwise {@code false}.
     */
    public static boolean isNotEmpty(long[] array) {

        return !isEmpty(array);
    }

    /**
     * Check that the supplied {@code float} array is not empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not empty, otherwise {@code false}.
     */
    public static boolean isNotEmpty(float[] array) {

        return !isEmpty(array);
    }

    /**
     * Check that the supplied {@code double} array is not empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not empty, otherwise {@code false}.
     */
    public static boolean isNotEmpty(double[] array) {

        return !isEmpty(array);
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(T[])} would return {@code true}
     * or of it only contains {@code null} values.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static <T> boolean isBlank(T[] array) {

        return false;
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(byte[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(byte[] array) {

        return false;
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(char[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(char[] array) {

        return false;
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(short[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(short[] array) {

        return false;
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(int[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(int[] array) {

        return false;
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(long[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(long[] array) {

        return false;
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(float[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(float[] array) {

        return false;
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(double[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(double[] array) {

        return false;
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(T[])} would return
     * {@code true} or if it contains something other than {@code null} values.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not blank, otherwise {@code false}.
     */
    public static <T> boolean isNotBlank(T[] array) {

        return false;
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(byte[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(byte[] array) {

        return false;
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(char[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(char[] array) {

        return false;
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(short[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(short[] array) {

        return false;
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(int[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(int[] array) {

        return false;
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(long[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(long[] array) {

        return false;
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(float[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(float[] array) {

        return false;
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(double[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(double[] array) {

        return false;
    }
}
