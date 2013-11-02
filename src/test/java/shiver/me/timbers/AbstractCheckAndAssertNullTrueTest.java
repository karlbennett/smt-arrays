package shiver.me.timbers;

/**
 * @author Karl Bennett
 */
public abstract class AbstractCheckAndAssertNullTrueTest<T> extends AbstractCheckAndAssertTest<T> {

    public AbstractCheckAndAssertNullTrueTest(T positiveValue, T negativeValue) {
        super(positiveValue, negativeValue);
    }

    @Override
    protected boolean nullResult() {

        return true;
    }
}
