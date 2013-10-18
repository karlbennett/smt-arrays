package shiver.me.timbers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.reflect.Array.get;
import static java.lang.reflect.Array.getLength;
import static java.lang.reflect.Array.newInstance;
import static java.lang.reflect.Array.set;
import static shiver.me.timbers.ArrayChecks.innerIsEmpty;
import static shiver.me.timbers.ArrayReflections.findComponentType;
import static shiver.me.timbers.ArrayReflections.findDimensions;
import static shiver.me.timbers.ArrayReflections.isArray;
import static shiver.me.timbers.ArrayReflections.isNotArray;
import static shiver.me.timbers.Asserts.isNotNull;

/**
 * A class that contains useful helper methods for manipulating arrays.
 *
 * @author Karl Bennett
 */
public final class ArrayUtils {

    private ArrayUtils() {
    }

    /**
     * The recursive deep copy method that is initialised in the public {@link #deepCopyOf} method.
     *
     * @param array       the array to copy.
     * @param copiedArray the array that will hold the copied values.
     * @param dimension   the current array dimension that is being populated.
     * @param index       the index to start copying from.
     * @param axis        the axis of the current element.
     */
    @SuppressWarnings("unchecked")
    private static <A> A innerDeepCopyOf(A array, A copiedArray, int dimension, int index, int[] axis) {
        // Record the current iterations axis.
        axis[dimension] = index;

        // If the current index is greater than the max index of the current array then we must have finished copying.
        if (index >= getLength(array)) return copiedArray;

        // Otherwise copy the next element in the array.
        final Object element = get(array, index);

        // If the next element is an array then it needs to be deep copied.
        if (isNotNull(element) && isArray(element)) {

            set(copiedArray, index, innerDeepCopyOf(
                    element,
                    newInstance(
                            element.getClass().getComponentType(),
                            getLength(element)),
                    dimension + 1, 0, axis));

        } else {
            // Otherwise just assign it to the same index in the copy array.
            set(copiedArray, index, element);
        }
        // Lastly move onto the next element.
        return innerDeepCopyOf(array, copiedArray, dimension, ++index, axis);
    }

    /**
     * This method just wraps the initialisation of the main deep copy logic so that it can be reused in the public
     * methods.
     *
     * @param array the array to copy.
     * @return the copied array.
     */
    @SuppressWarnings("unchecked")
    private static <A> A innerDeepCopyOf(A array) {

        if (isNotArray(array) || innerIsEmpty(array)) return array;

        return innerDeepCopyOf(array, (A) newInstance(array.getClass().getComponentType(), Array.getLength(array)), 0,
                0, new int[findDimensions(array)]);
    }

    /**
     * Carry out a deep copy of the supplied array, that is create a new array for each dimension, not a deep copy of
     * the containing objects.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static <T> T[] deepCopyOf(T[] array) {

        return innerDeepCopyOf(array);
    }

    /**
     * Carry out a deep copy of the supplied {@code byte} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static byte[] deepCopyOf(byte[] array) {

        return innerDeepCopyOf(array);
    }

    /**
     * Carry out a deep copy of the supplied {@code char} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static char[] deepCopyOf(char[] array) {

        return innerDeepCopyOf(array);
    }

    /**
     * Carry out a deep copy of the supplied {@code short} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static short[] deepCopyOf(short[] array) {

        return innerDeepCopyOf(array);
    }

    /**
     * Carry out a deep copy of the supplied {@code int} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static int[] deepCopyOf(int[] array) {

        return innerDeepCopyOf(array);
    }

    /**
     * Carry out a deep copy of the supplied {@code long} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static long[] deepCopyOf(long[] array) {

        return innerDeepCopyOf(array);
    }

    /**
     * Carry out a deep copy of the supplied {@code float} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static float[] deepCopyOf(float[] array) {

        return innerDeepCopyOf(array);
    }

    /**
     * Carry out a deep copy of the supplied {@code double} array, that is create a new array for each dimension.
     *
     * @param array the array to copy.
     * @return a new array with newly created dimensions.
     */
    public static double[] deepCopyOf(double[] array) {

        return innerDeepCopyOf(array);
    }

    /**
     * This method recursively iterates over all the elements within the supplied array.
     *
     * @param array     the array that will be iterated over.
     * @param dimension the current dimension of the array that the recursion has reached.
     * @param index     the current index of the current dimension.
     * @param axisArray the axis of the current iteration. This may only be partially populated depending on the current
     *                  dimension.
     * @param each      the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    @SuppressWarnings("unchecked")
    private static <T, E extends Throwable> void innerDeepFor(Object array, int dimension, int index, int[] axisArray,
                                                              Each<T, E> each) throws E {

        // If we have reached a leaf in the array then stop recursing and produce the current value and axis.
        if (isNotArray(array)) {

            each.run((T) array, axisArray);

            return;
        }

        // If the current array is empty then no further iteration is required.
        if (innerIsEmpty(array)) {

            return;
        }

        // Otherwise we are on a branch so recursively iterate over all it's elements.
        for (int i = index; i < getLength(array); i++) {

            axisArray[dimension] = i;

            innerDeepFor(get(array, i), dimension + 1, 0, axisArray, each);
        }
    }

    /**
     * This private method executes the actual iteration. The problem is it takes an {@link Object} type which doesn't
     * provide any type safety, which means the method could be called on an object that isn't an array. For this reason
     * it has been wrapped by type safe public methods.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    private static <T, E extends Throwable> void innerDeepFor(Object array, Each<T, E> each) throws E {

        if (innerIsEmpty(array)) {

            return;
        }

        innerDeepFor(array, 0, 0, new int[findDimensions(array)], each);
    }

    /**
     * Iterate over all the elements within an array that has any number of dimensions.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <A, T, E extends Throwable> void deepFor(A[] array, Each<T, E> each) throws E {

        innerDeepFor(array, each);
    }

    /**
     * Iterate over all the elements within the supplied {@code byte} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(byte[] array, Each<Byte, E> each) throws E {

        innerDeepFor(array, each);
    }

    /**
     * Iterate over all the elements within the supplied {@code char} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(char[] array, Each<Character, E> each) throws E {

        innerDeepFor(array, each);
    }

    /**
     * Iterate over all the elements within the supplied {@code short} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(short[] array, Each<Short, E> each) throws E {

        innerDeepFor(array, each);
    }

    /**
     * Iterate over all the elements within the supplied {@code int} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(int[] array, Each<Integer, E> each) throws E {

        innerDeepFor(array, each);
    }

    /**
     * Iterate over all the elements within the supplied {@code long} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(long[] array, Each<Long, E> each) throws E {

        innerDeepFor(array, each);
    }

    /**
     * Iterate over all the elements within the supplied {@code float} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(float[] array, Each<Float, E> each) throws E {

        innerDeepFor(array, each);
    }

    /**
     * Iterate over all the elements within the supplied {@code double} array.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <E extends Throwable> void deepFor(double[] array, Each<Double, E> each) throws E {

        innerDeepFor(array, each);
    }

    /**
     * The recursive deep autobox method that is initialised in the {@link #innerDeepAutoBox(Class, Object)} method.
     *
     * @param type           the base type of the array to convert into e.g. {@code Byte.class}, {@code Char.class},
     *                       {@code Long.class}...
     * @param array          the array to autobox.
     * @param autoBoxedArray the array that will hold the autoboxed values.
     * @param index          the index of the current element that is being autoboxed.
     * @param <T>            the generic array type.
     * @return the new array containing the autoboxed values.
     */
    @SuppressWarnings("unchecked")
    private static <T> T innerDeepAutoBox(Class type, Object array, T autoBoxedArray, int index) {

        if (index >= getLength(array)) return autoBoxedArray;

        final Object element = get(array, index);

        if (isArray(element)) {

            int[] dimensions = new int[findDimensions(element)];
            dimensions[0] = getLength(element);

            set(
                    autoBoxedArray,
                    index,
                    innerDeepAutoBox(type, element, (T) newInstance(type, dimensions), 0)
            );

        } else {

            set(autoBoxedArray, index, element);
        }

        return innerDeepAutoBox(type, array, autoBoxedArray, ++index);
    }

    /**
     * Autobox a the supplied array into an equivalent array of the boxed or un-boxed elements. This method works on
     * arrays with any number of dimensions.
     * <p/>
     * This method is private because it isn't type safe.
     *
     * @param arrayType the type of the array to convert into. This should be the array type, that is for a 3D
     *                  {@link Byte} array the value should be {@code Byte[][][].class}.
     * @param array     the array to autobox.
     * @param <T>       the generic array type.
     * @return the new array containing the autoboxed values.
     */
    @SuppressWarnings("unchecked")
    private static <T> T innerDeepAutoBox(Class<T> arrayType, Object array) {

        if (null == array) return null;

        final int length = getLength(array);

        final Class type = findComponentType(arrayType);

        final T autoBoxedArray = (T) newInstance(arrayType.getComponentType(), length);

        if (0 >= length) return autoBoxedArray;

        return innerDeepAutoBox(type, array, autoBoxedArray, 0);
    }

    /**
     * Autobox a the supplied array into an equivalent array of the boxed or un-boxed elements. This method works on
     * arrays with any number of dimensions.
     *
     * @param arrayType the type of the array to convert into. This should be the array type, that is for a 3D
     *                  {@link Byte} array the value should be {@code Byte[][][].class}.
     * @param array     the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static <A, T> A deepAutoBox(Class<A> arrayType, T[] array) {

        return innerDeepAutoBox(arrayType, array);
    }

    /**
     * Autobox the supplied {@code byte} array into an array of {@link Byte}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Byte[] deepAutoBox(byte[] array) {

        return innerDeepAutoBox(Byte[].class, array);
    }

    /**
     * Autobox the supplied {@code char} array into an array of {@link Character}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Character[] deepAutoBox(char[] array) {

        return innerDeepAutoBox(Character[].class, array);
    }

    /**
     * Autobox the supplied {@code short} array into an array of {@link Short}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Short[] deepAutoBox(short[] array) {

        return innerDeepAutoBox(Short[].class, array);
    }

    /**
     * Autobox the supplied {@code int} array into an array of {@link Integer}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Integer[] deepAutoBox(int[] array) {

        return innerDeepAutoBox(Integer[].class, array);
    }

    /**
     * Autobox the supplied {@code long} array into an array of {@link Long}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Long[] deepAutoBox(long[] array) {

        return innerDeepAutoBox(Long[].class, array);
    }

    /**
     * Autobox the supplied {@code float} array into an array of {@link Float}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Float[] deepAutoBox(float[] array) {

        return innerDeepAutoBox(Float[].class, array);
    }

    /**
     * Autobox the supplied {@code double} array into an array of {@link Double}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static Double[] deepAutoBox(double[] array) {

        return innerDeepAutoBox(Double[].class, array);
    }

    /**
     * Autobox the supplied {@link Byte} array into an array of {@code byte}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static byte[] deepAutoBox(Byte[] array) {

        return innerDeepAutoBox(byte[].class, array);
    }

    /**
     * Autobox the supplied {@link Character} array into an array of {@code char}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static char[] deepAutoBox(Character[] array) {

        return innerDeepAutoBox(char[].class, array);
    }

    /**
     * Autobox the supplied {@link Short} array into an array of {@code short}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static short[] deepAutoBox(Short[] array) {

        return innerDeepAutoBox(short[].class, array);
    }

    /**
     * Autobox the supplied {@link Integer} array into an array of {@code int}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static int[] deepAutoBox(Integer[] array) {

        return innerDeepAutoBox(int[].class, array);
    }

    /**
     * Autobox the supplied {@link Long} array into an array of {@code long}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static long[] deepAutoBox(Long[] array) {

        return innerDeepAutoBox(long[].class, array);
    }

    /**
     * Autobox the supplied {@link Float} array into an array of {@code float}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static float[] deepAutoBox(Float[] array) {

        return innerDeepAutoBox(float[].class, array);
    }

    /**
     * Autobox the supplied {@link Double} array into an array of {@code double}s.
     *
     * @param array the array to autobox.
     * @return the new array containing the autoboxed values.
     */
    public static double[] deepAutoBox(Double[] array) {

        return innerDeepAutoBox(double[].class, array);
    }

    /**
     * Convert the supplied array of {@code byte}s into a {@link List} of {@link Byte}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Byte> primitiveAsList(byte... values) {

        return Arrays.asList(deepAutoBox(values));
    }

    /**
     * Convert the supplied array of {@code char}s into a {@link List} of {@link Character}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Character> primitiveAsList(char... values) {

        return Arrays.asList(deepAutoBox(values));
    }

    /**
     * Convert the supplied array of {@code short}s into a {@link List} of {@link Short}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Short> primitiveAsList(short... values) {

        return Arrays.asList(deepAutoBox(values));
    }

    /**
     * Convert the supplied array of {@code int}s into a {@link List} of {@link Integer}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Integer> primitiveAsList(int... values) {

        return Arrays.asList(deepAutoBox(values));
    }

    /**
     * Convert the supplied array of {@code long}s into a {@link List} of {@link Long}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Long> primitiveAsList(long... values) {

        return Arrays.asList(deepAutoBox(values));
    }

    /**
     * Convert the supplied array of {@code float}s into a {@link List} of {@link Float}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Float> primitiveAsList(float... values) {

        return Arrays.asList(deepAutoBox(values));
    }

    /**
     * Convert the supplied array of {@code double}s into a {@link List} of {@link Double}s.
     *
     * @param values the array to convert.
     * @return the converted {@code List}.
     */
    public static List<Double> primitiveAsList(double... values) {

        return Arrays.asList(deepAutoBox(values));
    }

    /**
     * An interface that can be used with any of the {@link #innerDeepFor} methods to expose the current iterations element
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
