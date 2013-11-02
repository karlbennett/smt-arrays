package shiver.me.timbers;

/**
 * @author Karl Bennett
 */
public abstract class AbstractCheckAndAssertNullFalseTest<T> extends AbstractCheckAndAssertTest<T> {

    public AbstractCheckAndAssertNullFalseTest(T positiveValue, T negativeValue) {
        super(positiveValue, negativeValue);
    }

    @Override
    protected boolean nullResult() {

        return false;
    }
}
