package shiver.me.timbers.reflections;

import org.junit.Test;
import shiver.me.timbers.AbstractCheckAndAssertTest;

import static org.junit.Assert.assertTrue;

/**
 * @author Karl Bennett
 */
public abstract class AbstractNegativeArrayCheckAndAssertTest<T> extends AbstractCheckAndAssertTest<T> {

    public AbstractNegativeArrayCheckAndAssertTest(T positiveValue, T negativeValue) {
        super(positiveValue, negativeValue);
    }

    /**
     * @return an instance of the tested type.
     */
    protected abstract T create();

    @Override
    protected boolean nullResult() {

        return false;
    }

    @Test
    public void testCheckWithNonArray() {

        assertTrue("an object should pass the check.", doCheck(create()));
    }
}
