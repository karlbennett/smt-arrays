package shiver.me.timbers;

import java.util.List;

/**
 * A class that contains useful helper methods for manipulating arrays.
 *
 * @author Karl Bennett
 */
public final class ArrayUtils {

    private ArrayUtils() {
    }

    /**
     * Carry out a deep copy of the supplied array, that is create a new array for each dimension, not a deep copy of
     * the containing objects.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static <T> T[] deepCopyOf(T[] array) {

        return null;
    }

    /**
     * Carry out a deep copy of the supplied {@code byte} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static byte[] deepCopyOf(byte[] array) {

        return null;
    }

    /**
     * Carry out a deep copy of the supplied {@code char} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static char[] deepCopyOf(char[] array) {

        return null;
    }

    /**
     * Carry out a deep copy of the supplied {@code short} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static short[] deepCopyOf(short[] array) {

        return null;
    }

    /**
     * Carry out a deep copy of the supplied {@code int} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static int[] deepCopyOf(int[] array) {

        return null;
    }

    /**
     * Carry out a deep copy of the supplied {@code long} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static long[] deepCopyOf(long[] array) {

        return null;
    }

    /**
     * Carry out a deep copy of the supplied {@code float} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static float[] deepCopyOf(float[] array) {

        return null;
    }

    /**
     * Carry out a deep copy of the supplied {@code double} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static double[] deepCopyOf(double[] array) {

        return null;
    }

    /**
     * Iterate over all the elements within an array that has any number of dimensions.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <A, T, E extends Throwable> void deepFor(A[] array, Each<T, E> each) throws E {

    }

    /**
     * Iterate over all the elements within the supplied {@code byte} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(byte[] array, Each<Byte, E> each) throws E {

    }

    /**
     * Iterate over all the elements within the supplied {@code char} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(char[] array, Each<Character, E> each) throws E {

    }

    /**
     * Iterate over all the elements within the supplied {@code short} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(short[] array, Each<Short, E> each) throws E {

    }

    /**
     * Iterate over all the elements within the supplied {@code int} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(int[] array, Each<Integer, E> each) throws E {

    }

    /**
     * Iterate over all the elements within the supplied {@code long} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(long[] array, Each<Long, E> each) throws E {

    }

    /**
     * Iterate over all the elements within the supplied {@code float} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(float[] array, Each<Float, E> each) throws E {

    }

    /**
     * Iterate over all the elements within the supplied {@code double} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(double[] array, Each<Double, E> each) throws E {

    }

    /**
     * Autobox a primitive array into an equivalent array of the primitives wrapper objects, this method also works in
     * the reverse direction. This method works on arrays with any number of dimensions.
     *
     * @param arrayType the type of the array to convert into. This should be the array type, that is for a 3D
     *                  {@link Byte} array the value should be {@code Byte[][][].class}.
     * @param array     the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static <A, T> A deepAutoBox(Class<A> arrayType, T[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@code byte} array into an array of {@link Byte}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Byte[] deepAutoBox(byte[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@code char} array into an array of {@link Character}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Character[] deepAutoBox(char[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@code short} array into an array of {@link Short}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Short[] deepAutoBox(short[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@code int} array into an array of {@link Integer}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Integer[] deepAutoBox(int[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@code long} array into an array of {@link Long}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Long[] deepAutoBox(long[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@code float} array into an array of {@link Float}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Float[] deepAutoBox(float[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@code double} array into an array of {@link Double}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Double[] deepAutoBox(double[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@link Byte} array into an array of {@code byte}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static byte[] deepAutoBox(Byte[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@link Character} array into an array of {@code char}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static char[] deepAutoBox(Character[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@link Short} array into an array of {@code short}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static short[] deepAutoBox(Short[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@link Integer} array into an array of {@code int}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static int[] deepAutoBox(Integer[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@link Long} array into an array of {@code long}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static long[] deepAutoBox(Long[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@link Float} array into an array of {@code float}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static float[] deepAutoBox(Float[] array) {

        return null;
    }

    /**
     * Autobox the supplied {@link Double} array into an array of {@code double}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static double[] deepAutoBox(Double[] array) {

        return null;
    }

    /**
     * Convert the supplied array of {@code byte}s into a {@link List} of {@link Byte}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Byte> primitiveAsList(byte... values) {

        return null;
    }

    /**
     * Convert the supplied array of {@code char}s into a {@link List} of {@link Character}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Character> primitiveAsList(char... values) {

        return null;
    }

    /**
     * Convert the supplied array of {@code short}s into a {@link List} of {@link Short}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Short> primitiveAsList(short... values) {

        return null;
    }

    /**
     * Convert the supplied array of {@code int}s into a {@link List} of {@link Integer}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Integer> primitiveAsList(int... values) {

        return null;
    }

    /**
     * Convert the supplied array of {@code long}s into a {@link List} of {@link Long}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Long> primitiveAsList(long... values) {

        return null;
    }

    /**
     * Convert the supplied array of {@code float}s into a {@link List} of {@link Float}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Float> primitiveAsList(float... values) {

        return null;
    }

    /**
     * Convert the supplied array of {@code double}s into a {@link List} of {@link Double}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Double> primitiveAsList(double... values) {

        return null;
    }

    /**
     * An interface that can be used with any of the {@link #deepFor} methods to expose the current iterations element
     * and axis.
     */
    public static interface Each<T, E extends Throwable> {

        /**
         * Implement this method to get access to each iterations element and axis.
         *
         * @param element the element for the current iteration.
         * @param axis    the axis of the current iteration, it is an array with a length matching the dimensions of the
         *                array being iterated.
         */
        public void run(T element, int[] axis) throws E;
    }
}
