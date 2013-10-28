package shiver.me.timbers.utils;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Karl Bennett
 */
public abstract class AbstractPrimitiveAsListTest<T, A> {

    private final List<T> list;
    private final A array;

    protected AbstractPrimitiveAsListTest(List<T> list, A array) {

        this.list = list;
        this.array = array;
    }

    protected abstract List<T> primitiveAsList(A array);

    @Test
    public void testPrimitiveAsListProduceValue() {

        assertNotNull("a value should be produced.", primitiveAsList(array));
    }

    @Test
    public void testPrimitiveAsListProducesCorrectList() {

        assertEquals("the list should be correct.", list, primitiveAsList(array));
    }

    @Test(expected = NullPointerException.class)
    public void testPrimitiveAsListWithNull() {

        primitiveAsList(null);
    }
}
