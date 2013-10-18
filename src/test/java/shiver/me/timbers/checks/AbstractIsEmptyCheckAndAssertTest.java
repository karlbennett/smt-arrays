package shiver.me.timbers.checks;

import org.junit.Test;
import shiver.me.timbers.AbstractCheckAndAssertTest;

import static org.junit.Assert.assertTrue;
import static shiver.me.timbers.ArrayChecks.isEmpty;

/**
 * @author Karl Bennett
 */
public abstract class AbstractIsEmptyCheckAndAssertTest<T> extends AbstractCheckAndAssertTest<T> {

    public AbstractIsEmptyCheckAndAssertTest(T positiveValue, T negativeValue) {
        super(positiveValue, negativeValue);
    }

    @Test
    public void testIsEmptyWithNull() {

        assertTrue("null should be empty.", doCheck(null));
    }
}
