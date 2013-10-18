package shiver.me.timbers;

import static shiver.me.timbers.ArrayChecks.*;
import static shiver.me.timbers.ArrayReflections.isArray;
import static shiver.me.timbers.ArrayReflections.isNotArray;
import static shiver.me.timbers.Asserts.assertIsTrue;

/**
 * A class that contains useful helper methods for manipulating arrays.
 *
 * @author Karl Bennett
 */
public final class ArrayAsserts {

    private ArrayAsserts() {
    }

    /**
     * Assert that the supplied {@code type} is an array.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param type    the type to check.
     * @throws AssertionError if the supplied if the type is not of an array.
     */
    public static void assertIsArray(String message, Class type) {

        assertIsTrue(message, isArray(type));
    }

    /**
     * Assert that the supplied object is an array.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param object  the object to check.
     * @throws AssertionError if the supplied object is not an array.
     */
    public static void assertIsArray(String message, Object object) {

        assertIsTrue(message, isArray(object));
    }

    /**
     * Assert that the supplied {@code type} is not an array.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param type    the type to check.
     * @throws AssertionError if the supplied if the type is of an array.
     */
    public static void assertIsNotArray(String message, Class type) {

        assertIsTrue(message, isNotArray(type));
    }

    /**
     * Assert that the supplied {@code type} is not an array.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param object  the object to check.
     * @throws AssertionError if the supplied object is an array.
     */
    public static void assertIsNotArray(String message, Object object) {

        assertIsTrue(message, isNotArray(object));
    }

    /**
     * Assert that the supplied array is empty, that is if it is {@code null} or of length {@code 0}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is not empty.
     */
    public static <T> void assertIsEmpty(String message, T[] array) {

        assertIsTrue(message, isEmpty(array));
    }

    /**
     * Assert that the supplied {@code byte} array is empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is not empty.
     */
    public static void assertIsEmpty(String message, byte[] array) {

        assertIsTrue(message, isEmpty(array));
    }

    /**
     * Assert that the supplied {@code char} array is empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is not empty.
     */
    public static void assertIsEmpty(String message, char[] array) {

        assertIsTrue(message, isEmpty(array));
    }

    /**
     * Assert that the supplied {@code short} array is empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is not empty.
     */
    public static void assertIsEmpty(String message, short[] array) {

        assertIsTrue(message, isEmpty(array));
    }

    /**
     * Assert that the supplied {@code int} array is empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is not empty.
     */
    public static void assertIsEmpty(String message, int[] array) {

        assertIsTrue(message, isEmpty(array));
    }

    /**
     * Assert that the supplied {@code long} array is empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is not empty.
     */
    public static void assertIsEmpty(String message, long[] array) {

        assertIsTrue(message, isEmpty(array));
    }

    /**
     * Assert that the supplied {@code float} array is empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is not empty.
     */
    public static void assertIsEmpty(String message, float[] array) {

        assertIsTrue(message, isEmpty(array));
    }

    /**
     * Assert that the supplied {@code double} array is empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is not empty.
     */
    public static void assertIsEmpty(String message, double[] array) {

        assertIsTrue(message, isEmpty(array));
    }

    /**
     * Assert that the supplied array is not empty, that is if it is not {@code null} and has a length greater than
     * {@code 0}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is empty.
     */
    public static <T> void assertIsNotEmpty(String message, T[] array) {

        assertIsTrue(message, isNotEmpty(array));
    }

    /**
     * Assert that the supplied {@code byte} array is not empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is empty.
     */
    public static void assertIsNotEmpty(String message, byte[] array) {

        assertIsTrue(message, isNotEmpty(array));
    }

    /**
     * Assert that the supplied {@code char} array is not empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is empty.
     */
    public static void assertIsNotEmpty(String message, char[] array) {

        assertIsTrue(message, isNotEmpty(array));
    }

    /**
     * Assert that the supplied {@code short} array is not empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is empty.
     */
    public static void assertIsNotEmpty(String message, short[] array) {

        assertIsTrue(message, isNotEmpty(array));
    }

    /**
     * Assert that the supplied {@code int} array is not empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is empty.
     */
    public static void assertIsNotEmpty(String message, int[] array) {

        assertIsTrue(message, isNotEmpty(array));
    }

    /**
     * Assert that the supplied {@code long} array is not empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is empty.
     */
    public static void assertIsNotEmpty(String message, long[] array) {

        assertIsTrue(message, isNotEmpty(array));
    }

    /**
     * Assert that the supplied {@code float} array is not empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is empty.
     */
    public static void assertIsNotEmpty(String message, float[] array) {

        assertIsTrue(message, isNotEmpty(array));
    }

    /**
     * Assert that the supplied {@code double} array is not empty.
     *
     * @param message the message that will be contained in the error if the assertion fails.
     * @param array   the array to check.
     * @throws AssertionError if the array is empty.
     */
    public static void assertIsNotEmpty(String message, double[] array) {

        assertIsTrue(message, isNotEmpty(array));
    }

    /**
     * Assert that the supplied array is blank, that is if a call to {@link ArrayChecks#isEmpty(T[])} would return
     * {@code true} or of it only contains {@code null} values.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is not blank.
     */
    public static <T> void assertIsBlank(String message, T[] array) {
    }

    /**
     * Assert that the supplied array is blank, that is if a call to {@link ArrayChecks#isEmpty(byte[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is not blank.
     */
    public static void assertIsBlank(String message, byte[] array) {
    }

    /**
     * Assert that the supplied array is blank, that is if a call to {@link ArrayChecks#isEmpty(char[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is not blank.
     */
    public static void assertIsBlank(String message, char[] array) {
    }

    /**
     * Assert that the supplied array is blank, that is if a call to {@link ArrayChecks#isEmpty(short[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is not blank.
     */
    public static void assertIsBlank(String message, short[] array) {
    }

    /**
     * Assert that the supplied array is blank, that is if a call to {@link ArrayChecks#isEmpty(int[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is not blank.
     */
    public static void assertIsBlank(String message, int[] array) {
    }

    /**
     * Assert that the supplied array is blank, that is if a call to {@link ArrayChecks#isEmpty(long[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is not blank.
     */
    public static void assertIsBlank(String message, long[] array) {
    }

    /**
     * Assert that the supplied array is blank, that is if a call to {@link ArrayChecks#isEmpty(float[])} would return {@code true}
     * or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is not blank.
     */
    public static void assertIsBlank(String message, float[] array) {
    }

    /**
     * Assert that the supplied array is blank, that is if a call to {@link ArrayChecks#isEmpty(double[])} would return
     * {@code true} or of it only contains values of {@code 0}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is not blank.
     */
    public static void assertIsBlank(String message, double[] array) {
    }

    /**
     * Assert that the supplied array is not blank, that is if a call to {@link ArrayChecks#isNotEmpty(T[])} would return
     * {@code true} or if it contains something other than {@code null} values.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is blank.
     */
    public static <T> void assertIsNotBlank(String message, T[] array) {
    }

    /**
     * Assert that the supplied array is not blank, that is if a call to {@link ArrayChecks#isNotEmpty(byte[])} would return
     * {@code true} or if it contains something other than {@code null} values.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is blank.
     */
    public static void assertIsNotBlank(String message, byte[] array) {
    }

    /**
     * Assert that the supplied array is not blank, that is if a call to {@link ArrayChecks#isNotEmpty(char[])} would return
     * {@code true} or if it contains something other than {@code null} values.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is blank.
     */
    public static void assertIsNotBlank(String message, char[] array) {
    }

    /**
     * Assert that the supplied array is not blank, that is if a call to {@link ArrayChecks#isNotEmpty(short[])} would return
     * {@code true} or if it contains something other than {@code null} values.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is blank.
     */
    public static void assertIsNotBlank(String message, short[] array) {
    }

    /**
     * Assert that the supplied array is not blank, that is if a call to {@link ArrayChecks#isNotEmpty(int[])} would return
     * {@code true} or if it contains something other than {@code null} values.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is blank.
     */
    public static void assertIsNotBlank(String message, int[] array) {
    }

    /**
     * Assert that the supplied array is not blank, that is if a call to {@link ArrayChecks#isNotEmpty(long[])} would return
     * {@code true} or if it contains something other than {@code null} values.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is blank.
     */
    public static void assertIsNotBlank(String message, long[] array) {
    }

    /**
     * Assert that the supplied array is not blank, that is if a call to {@link ArrayChecks#isNotEmpty(float[])} would return
     * {@code true} or if it contains something other than {@code null} values.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is blank.
     */
    public static void assertIsNotBlank(String message, float[] array) {
    }

    /**
     * Assert that the supplied array is not blank, that is if a call to {@link ArrayChecks#isNotEmpty(double[])} would return
     * {@code true} or if it contains something other than {@code null} values.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is blank.
     */
    public static void assertIsNotBlank(String message, double[] array) {
    }
}
