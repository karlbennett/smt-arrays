package shiver.me.timbers;

import static shiver.me.timbers.ArrayReflections.isArray;
import static shiver.me.timbers.ArrayReflections.isBlank;
import static shiver.me.timbers.ArrayReflections.isEmpty;
import static shiver.me.timbers.ArrayReflections.isNotArray;
import static shiver.me.timbers.ArrayReflections.isNotBlank;
import static shiver.me.timbers.ArrayReflections.isNotEmpty;
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
     * Assert that the supplied array is empty, that is if a call to {@link ArrayReflections#isEmpty(Object)} would
     * return {@code true}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is not empty.
     */
    public static void assertIsEmpty(String message, Object array) {

        assertIsTrue(message, isEmpty(array));
    }

    /**
     * Assert that the supplied array is not empty, that is if a call to {@link ArrayReflections#isNotEmpty(Object)}
     * would return {@code true}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is empty.
     */
    public static void assertIsNotEmpty(String message, Object array) {

        assertIsTrue(message, isNotEmpty(array));
    }

    /**
     * Assert that the supplied array is blank, that is if a call to {@link ArrayReflections#isBlank(Object)} would
     * return {@code true}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is not blank.
     */
    public static void assertIsBlank(String message, Object array) {

        assertIsTrue(message, isBlank(array));
    }

    /**
     * Assert that the supplied array is not blank, that is if a call to {@link ArrayReflections#isNotBlank(Object)}
     * would return {@code true}.
     *
     * @param array the array to check.
     * @throws AssertionError if the array is blank.
     */
    public static void assertIsNotBlank(String message, Object array) {

        assertIsTrue(message, isNotBlank(array));
    }
}
