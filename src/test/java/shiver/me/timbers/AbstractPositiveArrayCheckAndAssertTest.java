package shiver.me.timbers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void testCheckWithNonArray() {

        assertFalse("an object should not pass that check.", doCheck(create()));
    }

    @Test
    public void testCheckWithNull() {

        assertTrue("null should be pass that check.", doCheck(null));
    }
}
