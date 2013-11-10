package shiver.me.timbers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static java.lang.reflect.Array.get;
import static java.lang.reflect.Array.getLength;
import static java.lang.reflect.Array.newInstance;
import static java.lang.reflect.Array.set;
import static shiver.me.timbers.ArrayReflections.findComponentType;
import static shiver.me.timbers.ArrayReflections.findDimensions;
import static shiver.me.timbers.ArrayReflections.isArray;
import static shiver.me.timbers.ArrayReflections.isEmpty;
import static shiver.me.timbers.ArrayReflections.isNotArray;
import static shiver.me.timbers.Asserts.isNull;

/**
 * A class that contains useful helper methods for manipulating arrays.
 *
 * @author Karl Bennett
 */
public final class ArrayUtils {

    private ArrayUtils() {
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
     * This method just wraps the initialisation of the main deep copy logic so that it can be reused in the public
     * methods.
     *
     * @param array the array to copy.
     * @return the copied array.
     */
    @SuppressWarnings("unchecked")
    private static <A> A innerDeepCopyOf(A array) {

        if (isNull(array)) {

            return null;
        }

        return (A) innerDeepAutoBox(array.getClass(), array);
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

    @SuppressWarnings("unchecked")
    public static <T, E extends Throwable> void innerTraverse(Object array, int dimension, int index, int[] axis,
                                                              Next<T, E> next)
            throws E {

        final int length;

        // If the current element isn't an array then we must have reached a leaf so pass it to the caller.
        if (isNotArray(array) || (length = Array.getLength(array)) == 0) {

            next.run((T) array, dimension, axis);

            return;
        }

        // If the current index is greater than or equal to the length of the current array we have reached the end of
        // the traversal.
        if (length <= index) {

            return;
        }

        axis[dimension] = index;

        innerTraverse(Array.get(array, index), dimension + 1, 0, axis, next);

        innerTraverse(array, dimension, index + 1, axis, next);
    }

    public static <T, E extends Throwable> void innerTraverse(Object array, Next<T, E> next) throws E {

        innerTraverse(array, 0, 0, new int[findDimensions(array)], next);
    }

    /**
     * Carry out a depth first traversal of the supplied array. This method supports arrays with any number of
     * dimensions. Note, that if used on an array with missing dimensions the lowest element will get passed into the
     * {@link Next#run(T, int, int[])} run method. That means that an instance of an array type instead of the component
     * type will get passed to the first argument and if this argument isn't of the type {@link Object} a
     * {@link ClassCastException} will be thrown.
     * <p/>
     * <code>
     *  int[][] array = {
     *      {},
     *      {1, 2, 3}
     *  };
     * <p/>
     *  ArrayUtils.traverse(array, new ArrayUtils.Each<Integer, RuntimeException>() {
     *
     *      @Override public void run(Integer element, int[] axis) throws RuntimeException {
     *      }
     *  }); // throws ClassCastException.
     * </code>
     * <p/>
     * @param array the array to traverse.
     * @param next  the {@code Next} interface that will be used to expose the value and axis of each iteration to the
     *              user.
     * @throws E if this generic typed exception is thrown from within the supplied {@code each}.
     */
    public static <A, T, E extends Throwable> void traverse(A[] array, final Next<T, E> next) throws E {

        innerTraverse(array, next);
    }

    /**
     * Traverse the single dimensional {@code byte} array.
     *
     * @param array the array to traverse.
     * @param next  the {@code Next} interface that will be used to expose the value and axis of each iteration to the
     *              user.
     * @throws E if this generic typed exception is thrown from within the supplied {@code each}.
     */
    public static <E extends Throwable> void traverse(byte[] array, final Next<Byte, E> next) throws E {

        innerTraverse(array, next);
    }

    /**
     * Traverse the single dimensional {@code char} array.
     *
     * @param array the array to traverse.
     * @param next  the {@code Next} interface that will be used to expose the value and axis of each iteration to the
     *              user.
     * @throws E if this generic typed exception is thrown from within the supplied {@code each}.
     */
    public static <E extends Throwable> void traverse(char[] array, final Next<Character, E> next) throws E {

        innerTraverse(array, next);
    }

    /**
     * Traverse the single dimensional {@code short} array.
     *
     * @param array the array to traverse.
     * @param next  the {@code Next} interface that will be used to expose the value and axis of each iteration to the
     *              user.
     * @throws E if this generic typed exception is thrown from within the supplied {@code each}.
     */
    public static <E extends Throwable> void traverse(short[] array, final Next<Short, E> next) throws E {

        innerTraverse(array, next);
    }

    /**
     * Traverse the single dimensional {@code int} array.
     *
     * @param array the array to traverse.
     * @param next  the {@code Next} interface that will be used to expose the value and axis of each iteration to the
     *              user.
     * @throws E if this generic typed exception is thrown from within the supplied {@code each}.
     */
    public static <E extends Throwable> void traverse(int[] array, final Next<Integer, E> next) throws E {

        innerTraverse(array, next);
    }

    /**
     * Traverse the single dimensional {@code long} array.
     *
     * @param array the array to traverse.
     * @param next  the {@code Next} interface that will be used to expose the value and axis of each iteration to the
     *              user.
     * @throws E if this generic typed exception is thrown from within the supplied {@code each}.
     */
    public static <E extends Throwable> void traverse(long[] array, final Next<Long, E> next) throws E {

        innerTraverse(array, next);
    }

    /**
     * Traverse the single dimensional {@code float} array.
     *
     * @param array the array to traverse.
     * @param next  the {@code Next} interface that will be used to expose the value and axis of each iteration to the
     *              user.
     * @throws E if this generic typed exception is thrown from within the supplied {@code each}.
     */
    public static <E extends Throwable> void traverse(float[] array, final Next<Float, E> next) throws E {

        innerTraverse(array, next);
    }

    /**
     * Traverse the single dimensional {@code double} array.
     *
     * @param array the array to traverse.
     * @param next  the {@code Next} interface that will be used to expose the value and axis of each iteration to the
     *              user.
     * @throws E if this generic typed exception is thrown from within the supplied {@code each}.
     */
    public static <E extends Throwable> void traverse(double[] array, final Next<Double, E> next) throws E {

        innerTraverse(array, next);
    }

    /**
     * This private method executes the actual iteration. The problem is it takes an {@link Object} type which doesn't
     * provide any type safety, which means the method could be called on an object that isn't an array. For this reason
     * it has been wrapped by type safe public methods.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     * @throws E if this generic typed exception is thrown from within the supplied {@code each}.
     */
    private static <T, E extends Throwable> void innerDeepFor(Object array, final Each<T, E> each) throws E {

        if (isEmpty(array)) {

            return;
        }

        innerTraverse(array, new Next<T, E>() {

            @Override
            public void run(T element, int dimension, int[] axis) throws E {

                if (isArray(element)) {

                    return;
                }

                if (axis.length > dimension) {

                    return;
                }

                each.run(element, axis);
            }
        });
    }

    /**
     * Iterate over all the elements within an array that has any number of dimensions.
     *
     * @param array the array to iterate over.
     * @param each  the each interface that will be used to expose the value and axis of each iteration to the user.
     */
    public static <A, T, E extends Throwable> void deepFor(A[] array, final Each<T, E> each) throws E {

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
     * An interface that can be used with any of the {@link #traverse} methods to expose the current iterations element,
     * dimension, and axis.
     */
    public static interface Next<T, E extends Throwable> {

        /**
         * Implement this method to get access to each iterations element, dimension, and axis.
         *
         * @param element   the element for the current iteration.
         * @param dimension the array dimension of the current iteration.
         * @param axis      the axis of the current iteration, it is an array with a length matching the dimensions of
         *                  the array being iterated.
         */
        public void run(T element, int dimension, int[] axis) throws E;
    }

    /**
     * An interface that can be used with any of the {@link #deepFor} methods to expose the current iterations element
     * and axis.
     */
    public static abstract class Each<T, E extends Throwable> implements Next<T, E> {

        /**
         * Implement this method to get access to each iterations element and axis.
         *
         * @param element the element for the current iteration.
         * @param axis    the axis of the current iteration, it is an array with a length matching the dimensions of
         *                the array being iterated.
         */
        protected abstract void run(T element, int[] axis) throws E;

        /**
         * {@inheritDoc}
         */
        public void run(T element, int dimension, int[] axis) throws E {

            run(element, axis);
        }
    }
}
