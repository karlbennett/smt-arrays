package shiver.me.timbers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
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

    @Test
    public void testCheckWithNonArray() {

        assertTrue("an object should pass the check.", doCheck(create()));
    }

    @Test
    public void testCheckWithNull() {

        assertFalse("null should not pass the check.", doCheck(null));
    }
}
