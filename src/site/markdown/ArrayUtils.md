The [`ArrayUtils`](apidocs/shiver/me/timbers/ArrayUtils.html) class contains helper methods for working with single and
multi dimensional arrays.

#### deepCopyOf(T[]):T[]

The deep copy method can be used to copy an array with any number of dimensions. The resulting array will be completely
copied, that is every dimension will be created with a new array so that modifications to the original array will not
effect the copy. Though, it should be noted that it is only the array that is copied, the references within the array
will still point at the same object instances. So mutations to the containing objects will naturally be reflected in
both arrays.

<pre class="source">
class TestClass {

    public int test;

    public TestClass(int test) {
        this.test = test;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        TestClass testClass = (TestClass) o;

        return test == testClass.test;
    }

    @Override
    public int hashCode() {

        return test;
    }
}

TestClass[][] tests = {
        {new TestClass(1), new TestClass(2), new TestClass(3)},
        {new TestClass(4), new TestClass(5), new TestClass(6)},
        {new TestClass(7), new TestClass(8), new TestClass(9)},
};

TestClass[][] testsCopy = deepCopyOf(tests);

assertThat(testsCopy, equalTo(tests)); // pass.

tests[1][1].test = 99;

assertThat(testsCopy, equalTo(tests)); // pass.

tests[1][1] = new TestClass(100);

assertThat(testsCopy, not(equalTo(tests))); // pass.
</pre>

The method can also handle arrays of any shape, they do not have to be square, that is they don't have to have all
dimension arrays of the same length. It is also possible to have missing dimensions as well.

<pre class="source">
TestClass[][][] tests = {
        null,
        {
                {new TestClass(1), new TestClass(2), new TestClass(3)},
                {null, new TestClass(5)},
                null
        },
        {
                null
        },
        {
                {new TestClass(6)},
                {new TestClass(7), new TestClass(8)},
                {new TestClass(9), new TestClass(10), new TestClass(11)}
        },
        null
};

TestClass[][][] testsCopy = deepCopyOf(tests);

assertThat(testsCopy, equalTo(tests)); // pass.

tests[1][0][1].test = 99;

assertThat(testsCopy, equalTo(tests)); // pass.

tests[3][1][1] = new TestClass(100);

assertThat(testsCopy, not(equalTo(tests))); // pass.
</pre>