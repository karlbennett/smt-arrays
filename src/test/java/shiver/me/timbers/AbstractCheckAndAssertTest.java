package shiver.me.timbers;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * An abstract class that can be used to easily create tests for is and isNot tests.
 *
 * @author Karl Bennett
 */
public abstract class AbstractCheckAndAssertTest<T> {

    private final T isValue;
    private final T isNotValue;

    /**
     * Create a new {@code AbstractCheckAndAssertTest} with an affirmative and negative value.
     *
     * @param positiveValue the value that should produce success from the check.
     * @param negativeValue the value that should produce failure from the check.
     */
    public AbstractCheckAndAssertTest(T positiveValue, T negativeValue) {

        isValue = positiveValue;
        isNotValue = negativeValue;
    }

    /**
     * Implement this method with the call to the affirmative check.
     *
     * @param value the value that is being checked.
     * @return {@code true} if the affirmative check succeeds, otherwise {@code false}.
     */
    protected abstract boolean doCheck(T value);

    /**
     * Implement this method with the call to the affirmative assert.
     *
     * @param value the value that is being checked.
     * @throws AssertionError if the affirmative check fails.
     */
    protected abstract void doAssert(String message, T value);

    /**
     * @return the correct boolean result of running the check against {@code null}.
     */
    protected abstract boolean nullResult();

    @Test
    public void testCheck() {

        assertThat("should be true for (" + isValue + ")", doCheck(isValue), CoreMatchers.is(true));
        assertThat("should be false for not (" + isNotValue + ")", doCheck(isNotValue), CoreMatchers.not(true));
    }

    @Test
    public void testCheckWithNull() {

        assertThat("should be " + nullResult() + " for null", doCheck(null), CoreMatchers.is(nullResult()));
    }

    @Test
    public void testAssertIsWithIsValue() {

        doAssert("should not error", isValue);
    }

    @Test(expected = AssertionError.class)
    public void testAssertIsWithIsNotValue() {

        doAssert("should error", isNotValue);
    }
}
