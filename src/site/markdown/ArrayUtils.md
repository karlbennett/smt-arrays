The [`ArrayUtils`](apidocs/shiver/me/timbers/ArrayUtils.html) class contains helper methods for working with single and
multi dimensional arrays.

#### deepCopyOf(T[]):T[]

The `deepCopy` method can be used to copy an array with any number of dimensions. The resulting array will be completely
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

#### deepFor(A[],Each<T, E>) throws E

The `deepFor` method will iterate over every element within an array of any number of dimensions. It does this in the
with a depth first traversal.

<pre class="source">
int[][][] array = {
        {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        },
        {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18},
        },
        {
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27},
        }
};

deepFor(array, new Each<Integer, RuntimeException>() {

    @Override
    public void run(Integer element, int[] axis) throws RuntimeException {

        System.out.println(Arrays.toString(axis) + ": " + element);
    }
});
//    [0, 0, 0]: 1
//    [0, 0, 1]: 2
//    [0, 0, 2]: 3
//    [0, 1, 0]: 4
//    [0, 1, 1]: 5
//    [0, 1, 2]: 6
//    [0, 2, 0]: 7
//    [0, 2, 1]: 8
//    [0, 2, 2]: 9
//    [1, 0, 0]: 10
//    [1, 0, 1]: 11
//    [1, 0, 2]: 12
//    [1, 1, 0]: 13
//    [1, 1, 1]: 14
//    [1, 1, 2]: 15
//    [1, 2, 0]: 16
//    [1, 2, 1]: 17
//    [1, 2, 2]: 18
//    [2, 0, 0]: 19
//    [2, 0, 1]: 20
//    [2, 0, 2]: 21
//    [2, 1, 0]: 22
//    [2, 1, 1]: 23
//    [2, 1, 2]: 24
//    [2, 2, 0]: 25
//    [2, 2, 1]: 26
//    [2, 2, 2]: 27
</pre>

Each element is exposed to the user by implementing the
[`Each<T, E>`](site/apidocs/shiver/me/timbers/ArrayUtils.Each.html) interfaces `run(T,int[]) throws E` method. The first
argument of this method is the element for the current iteration, the second argument is an array containing the axis of
the current element. The axis array will have a length equal to the number of dimensions of the array, so for a 3D array
the axis with have length three and each index will contain an `int` with the index of each dimension. So again for a
3D array the axis arrays indexes will relate the as follows.

<pre class="source">
axis[0]: x
axis[1]: y
axis[2]: z
</pre>

The exception that the `deepFor` method throws can be set with the generic typing of the method. This means it is
possible to set weather the method throws a checked or runtime exception.

<pre class="source">
deepFor(array, new Each<Object, RuntimeException>() {...}); // throws unchecked RuntimeException.
deepFor(array, new Each<Object, Error>() {...}); // throws unchecked Error.

 // Throws checked Exception that will need to be rethrown or caught.
deepFor(array, new Each<Object, Exception>() {...});
</pre>

The method can handle arrays of any shape and that also have null dimensions.

<pre class="source">
int[][][] array = {
        {
                null,
                {1, 2, 3},
                {4}
        },
        null,
        {
                {5, 6},
                {7, 8, 9}
        },
        {
                {10},
                null
        },
        null
};

deepFor(array, new Each<Integer, RuntimeException>() {

    @Override
    public void run(Integer element, int[] axis) throws RuntimeException {

        System.out.println(Arrays.toString(axis) + ": " + element);
    }
});
//    [0, 1, 0]: 1
//    [0, 1, 1]: 2
//    [0, 1, 2]: 3
//    [0, 2, 0]: 4
//    [2, 0, 0]: 5
//    [2, 0, 1]: 6
//    [2, 1, 0]: 7
//    [2, 1, 1]: 8
//    [2, 1, 2]: 9
//    [3, 0, 0]: 10
</pre>