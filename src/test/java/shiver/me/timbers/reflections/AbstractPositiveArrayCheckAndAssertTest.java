package shiver.me.timbers.reflections;

import org.junit.Test;
import shiver.me.timbers.AbstractCheckAndAssertTest;

import static org.junit.Assert.assertFalse;

/**
 * @author Karl Bennett
 */
public abstract class AbstractPositiveArrayCheckAndAssertTest<T> extends AbstractCheckAndAssertTest<T> {

    public AbstractPositiveArrayCheckAndAssertTest(T positiveValue, T negativeValue) {
        super(positiveValue, negativeValue);
    }

    /**
     * @return an instance of the tested type.
     */
    protected abstract T create();

    @Override
    protected boolean nullResult() {

        return true;
    }

    @Test
    public void testCheckWithNonArray() {

        assertFalse("an object should not pass that check.", doCheck(create()));
    }
}
