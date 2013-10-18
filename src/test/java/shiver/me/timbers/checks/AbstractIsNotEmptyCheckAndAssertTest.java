package shiver.me.timbers.checks;

import org.junit.Test;
import shiver.me.timbers.AbstractCheckAndAssertTest;

import static org.junit.Assert.assertFalse;

/**
 * @author Karl Bennett
 */
public abstract class AbstractIsNotEmptyCheckAndAssertTest<T> extends AbstractCheckAndAssertTest<T> {

    public AbstractIsNotEmptyCheckAndAssertTest(T positiveValue, T negativeValue) {
        super(positiveValue, negativeValue);
    }

    @Test
    public void testIsEmptyWithNull() {

        assertFalse("null should be empty.", doCheck(null));
    }
}
