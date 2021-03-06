package shiver.me.timbers;

/**
 * A class that contains useful helper methods for manipulating arrays.
 *
 * @author Karl Bennett
 */
public final class ArrayChecks {

    private ArrayChecks() {
    }

    /**
     * Check that the supplied array is empty, that is if it is {@code null} or it's final dimension has a length of
     * {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static <T> boolean isEmpty(T[] array) {

        return ArrayReflections.isEmpty(array);
    }

    /**
     * Check that the supplied {@code byte} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(byte[] array) {

        return ArrayReflections.isEmpty(array);
    }

    /**
     * Check that the supplied {@code char} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(char[] array) {

        return ArrayReflections.isEmpty(array);
    }

    /**
     * Check that the supplied {@code short} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(short[] array) {

        return ArrayReflections.isEmpty(array);
    }

    /**
     * Check that the supplied {@code int} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(int[] array) {

        return ArrayReflections.isEmpty(array);
    }

    /**
     * Check that the supplied {@code long} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(long[] array) {

        return ArrayReflections.isEmpty(array);
    }

    /**
     * Check that the supplied {@code float} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(float[] array) {

        return ArrayReflections.isEmpty(array);
    }

    /**
     * Check that the supplied {@code double} array is empty.
     *
     * @param array the array to check.
     * @return {@code true} if the array is empty, otherwise {@code false}.
     */
    public static boolean isEmpty(double[] array) {

        return ArrayReflections.isEmpty(array);
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

        return ArrayReflections.isBlank(array);
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(byte[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(byte[] array) {

        return ArrayReflections.isBlank(array);
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(char[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(char[] array) {

        return ArrayReflections.isBlank(array);
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(short[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(short[] array) {

        return ArrayReflections.isBlank(array);
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(int[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(int[] array) {

        return ArrayReflections.isBlank(array);
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(long[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(long[] array) {

        return ArrayReflections.isBlank(array);
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(float[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(float[] array) {

        return ArrayReflections.isBlank(array);
    }

    /**
     * Check that the supplied array is blank, that is if a call to {@link #isEmpty(double[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isBlank(double[] array) {

        return ArrayReflections.isBlank(array);
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(T[])} would return
     * {@code true} or if it contains something other than {@code null} values.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not blank, otherwise {@code false}.
     */
    public static <T> boolean isNotBlank(T[] array) {

        return !isBlank(array);
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(byte[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(byte[] array) {

        return !isBlank(array);
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(char[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is not blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(char[] array) {

        return !isBlank(array);
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(short[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(short[] array) {

        return !isBlank(array);
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(int[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(int[] array) {

        return !isBlank(array);
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(long[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(long[] array) {

        return !isBlank(array);
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(float[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(float[] array) {

        return !isBlank(array);
    }

    /**
     * Check that the supplied array is not blank, that is if a call to {@link #isNotEmpty(double[])} would return
     * {@code true} or if it contains something other than {@code 0}.
     *
     * @param array the array to check.
     * @return {@code true} if the array is blank, otherwise {@code false}.
     */
    public static boolean isNotBlank(double[] array) {

        return !isBlank(array);
    }
}
