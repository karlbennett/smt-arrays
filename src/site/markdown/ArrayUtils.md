The [`ArrayUtils`](apidocs/shiver/me/timbers/ArrayUtils.html) class contains helper methods for working with single and
multi dimensional arrays.

#### deepCopyOf(T[]):T[]

The `deepCopy` method can be used to copy an array with any number of dimensions. The resulting array will be completely
copied, that is every dimension will be created with a new array so that modifications to the original array will not
effect the copy. Though, it should be noted that it is only the array that is copied, the references within the array
will still point at the same object instances. So mutations to the containing objects will naturally be reflected in
both arrays.

<pre class="source">
<span class="keyWord">class</span> <span class="className">TestClass</span> {

    <span class="keyWord">public int</span> test;

    <span class="keyWord">public</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="keyWord">int</span> test<span class="parentheses">)</span> {
        <span class="keyWord">this</span>.test = test;
    }

    <span class="annotation">@Override</span>
    <span class="keyWord">public boolean</span> <span class="methodName">equals</span><span class="parentheses">(</span>Object o<span class="parentheses">)</span> {

        <span class="keyWord">if</span> <span class="parentheses">(</span><span class="keyWord">this</span> == o<span class="parentheses">)</span> <span class="keyWord">return true</span>;

        <span class="keyWord">if</span> <span class="parentheses">(</span>o == null || <span class="methodName">getClass</span><span class="parentheses">()</span> != o.<span class="methodName">getClass</span><span class="parentheses">())</span> <span class="keyWord">return false</span>;

        <span class="className">TestClass</span> testClass = <span class="parentheses">(</span><span class="className">TestClass</span><span class="parentheses">)</span> o;

        <span class="keyWord">return</span> test == testClass.test;
    }

    <span class="annotation">@Override</span>
    <span class="keyWord">public int</span> <span class="methodName">hashCode</span><span class="parentheses">()</span> {

        <span class="keyWord">return</span> test;
    }
}

<span class="className">TestClass</span>[][] tests = {
        {<span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">1</span><span class="parentheses">)</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">2</span><span class="parentheses">)</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">3</span><span class="parentheses">)</span>},
        {<span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">4</span><span class="parentheses">)</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">5</span><span class="parentheses">)</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">6</span><span class="parentheses">)</span>},
        {<span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">7</span><span class="parentheses">)</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">8</span><span class="parentheses">)</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">9</span><span class="parentheses">)</span>},
};

<span class="className">TestClass</span>[][] testsCopy = <span class="methodName">deepCopyOf</span><span class="parentheses">(</span>tests<span class="parentheses">)</span>;

<span class="methodName">assertThat</span><span class="parentheses">(</span>testsCopy, <span class="methodName">equalTo</span><span class="parentheses">(</span>tests<span class="parentheses">))</span>; <span class="comment">// pass.</span>

tests[<span class="primitive">1</span>][<span class="primitive">1</span>].test = <span class="primitive">99</span>;

<span class="methodName">assertThat</span><span class="parentheses">(</span>testsCopy, <span class="methodName">equalTo</span><span class="parentheses">(</span>tests<span class="parentheses">))</span>; <span class="comment">// pass.</span>

tests[<span class="primitive">1</span>][<span class="primitive">1</span>] = new TestClass<span class="parentheses">(</span><span class="primitive">100</span><span class="parentheses">)</span>;

<span class="methodName">assertThat</span><span class="parentheses">(</span>testsCopy, <span class="methodName">not</span><span class="parentheses">(</span><span class="methodName">equalTo</span><span class="parentheses">(</span>tests<span class="parentheses">)))</span>; <span class="comment">// pass.</span>
</pre>

The method can also handle arrays of any shape, they do not have to be square, that is they don't have to have all
dimension arrays of the same length. It is also possible to have missing dimensions as well.

<pre class="source">
<span class="className">TestClass</span>[][][] tests = {
        <span class="keyWord">null</span>,
        {
                {<span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">1</span><span class="parentheses">)</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">2</span><span class="parentheses">)</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">3</span><span class="parentheses">)</span>},
                {<span class="keyWord">null</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">5</span><span class="parentheses">)</span>},
                <span class="keyWord">null</span>
        },
        {
                <span class="keyWord">null</span>
        },
        {
                {<span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">6</span><span class="parentheses">)</span>},
                {<span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">7</span><span class="parentheses">)</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">8</span><span class="parentheses">)</span>},
                {<span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">9</span><span class="parentheses">)</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">10</span><span class="parentheses">)</span>, <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">11</span><span class="parentheses">)</span>}
        },
        <span class="keyWord">null</span>
};

<span class="className">TestClass</span>[][][] testsCopy = <span class="methodName">deepCopyOf</span><span class="parentheses">(</span>tests<span class="parentheses">)</span>;

<span class="methodName">assertThat</span><span class="parentheses">(</span>testsCopy, <span class="methodName">equalTo</span><span class="parentheses">(</span>tests<span class="parentheses">))</span>; <span class="comment">// pass.</span>

tests[<span class="primitive">1</span>][<span class="primitive">0</span>][<span class="primitive">1</span>].test = <span class="primitive">99</span>;

<span class="methodName">assertThat</span><span class="parentheses">(</span>testsCopy, <span class="methodName">equalTo</span><span class="parentheses">(</span>tests<span class="parentheses">))</span>; <span class="comment">// pass.</span>

tests[<span class="primitive">3</span>][<span class="primitive">1</span>][<span class="primitive">1</span>] = <span class="keyWord">new</span> <span class="className">TestClass</span><span class="parentheses">(</span><span class="primitive">100</span><span class="parentheses">)</span>;

<span class="methodName">assertThat</span><span class="parentheses">(</span>testsCopy, <span class="methodName">not</span><span class="parentheses">(</span><span class="methodName">equalTo</span><span class="parentheses">(</span>tests<span class="parentheses">)))</span>; <span class="comment">// pass.</span>
</pre>

#### deepFor(A[],Each<T, E>) throws E

The `deepFor` method will iterate over every element within an array of any number of dimensions. It does this in the
with a depth first traversal.

```
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
```

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

```
deepFor(array, new Each<Object, RuntimeException>() {...}); // throws unchecked RuntimeException.
deepFor(array, new Each<Object, Error>() {...}); // throws unchecked Error.

 // Throws checked Exception that will need to be rethrown or caught.
deepFor(array, new Each<Object, Exception>() {...});
```

The method can handle arrays of any shape and that also have null dimensions.

```
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
```