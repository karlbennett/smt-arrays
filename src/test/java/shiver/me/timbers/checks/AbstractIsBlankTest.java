package shiver.me.timbers.checks;

import shiver.me.timbers.AbstractCheckAndAssertNullTrueTest;

/**
 * This is the parent class of all {@link shiver.me.timbers.ArrayChecks#isBlank} tests. This exist just to simplify
 * updating of classes in the tests inheritance hierarchy.
 *
 * @author Karl Bennett
 */
public abstract class AbstractIsBlankTest<T> extends AbstractCheckAndAssertNullTrueTest<T> {

    public AbstractIsBlankTest(T positiveValue, T negativeValue) {
        super(positiveValue, negativeValue);
    }
}
