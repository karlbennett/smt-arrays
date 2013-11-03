The [`ArrayReflections`](apidocs/shiver/me/timbers/ArrayChecks.html) class contains type safe versions of the
[`ArrayReflections`](apidocs/shiver/me/timbers/ArrayReflections.html)
[`isEmpty`/`isNotEmpty`](ArrayReflections.html#isEmptyObject:booleanisNotEmptyObject:boolean) and
[`isBlank`/`isNotBlank`](ArrayReflections.html#isBlankObject:booleanisNotBlankObject:boolean) methods.
These behave in exactly the same way but can only be called with an array.

<pre class="source">
<span class="methodName">isEmpty</span><span class="parentheses">(</span>new byte[0]<span class="parentheses">)</span>; <span class="comment">// fine</span>
<span class="methodName">isEmpty</span><span class="parentheses">(</span>new char[3][]<span class="parentheses">)</span>; <span class="comment">// fine</span>
<span class="methodName">isEmpty</span><span class="parentheses">(</span>new short[3][][]<span class="parentheses">)</span>; <span class="comment">// fine</span>
<span class="methodName">isEmpty</span><span class="parentheses">(</span>new Object[3][][][]<span class="parentheses">)</span>; <span class="comment">// fine</span>
<span class="methodName">isEmpty</span><span class="parentheses">(</span>null<span class="parentheses">)</span>; <span class="comment">// fine</span>
<span class="methodName">isEmpty</span><span class="parentheses">(</span>new Object<span class="parentheses">())</span>; <span class="comment">// syntax error</span>
<span class="methodName">isEmpty</span><span class="parentheses">(</span>1<span class="parentheses">)</span>; <span class="comment">// syntax error</span>
</pre>