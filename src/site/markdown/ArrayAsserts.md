The [`ArrayAsserts`](apidocs/shiver/me/timbers/ArrayAsserts.html) class contains assertions for all the different
checks. That is
[`isArray/isNotArray`](ArrayReflections.html#isArrayClassObject:booleanisNotArrayClassObject:boolean),
[`isEmpty`/`isNotEmpty`](ArrayReflections.html#isEmptyObject:booleanisNotEmptyObject:boolean), and
[`isBlank`/`isNotBlank`](ArrayReflections.html#isBlankObject:booleanisNotBlankObject:boolean), which all accept `Object`
arguments because type safety isn't as important since there is a chance that you may want to assert emptiness after
asserting that an object is an array.

All the assertions throw an [`AssertionError`](http://docs.oracle.com/javase/7/docs/api/java/lang/AssertionError.html)
if they fail.

<pre class="source">
<span class="methodName">assertIsArray</span><span class="parentheses">(</span>1<span class="parentheses">)</span>; <span class="comment">// throw AssertionError</span>
<span class="methodName">assertIsNotArray</span><span class="parentheses">(</span>new char[3][]<span class="parentheses">)</span>; <span class="comment">// throw AssertionError</span>
<span class="methodName">assertIsEmpty</span><span class="parentheses">(</span>new short[3][3][3]<span class="parentheses">)</span>; <span class="comment">// throw AssertionError</span>
<span class="methodName">assertIsNotEmpty</span><span class="parentheses">(</span>new Object[3][3][3][]<span class="parentheses">)</span>; <span class="comment">// throw AssertionError</span>
<span class="methodName">assertIsBlank</span><span class="parentheses">(</span>new int[] {0, 0, 1}<span class="parentheses">)</span>; <span class="comment">// throw AssertionError</span>
<span class="methodName">assertIsNotBlank</span><span class="parentheses">(</span>new String[3]<span class="parentheses">)</span>; <span class="comment">// throw AssertionError</span>
</pre>