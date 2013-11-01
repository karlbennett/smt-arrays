The [`ArrayReflections`](apidocs/shiver/me/timbers/ArrayReflections.html) class contains reflection methods for
inspecting the existence and status of arrays.

#### isArray(Class|Object):boolean

Check if the supplied `Object` or `Class` is that of an array.

<pre class="source">
<span class="methodName">isArray</span><span class="parentheses">(</span>new Object[0]<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isArray</span><span class="parentheses">(</span>new Object[0].getClass<span class="parentheses">())</span>; <span class="comment">// true</span>
<span class="methodName">isArray</span><span class="parentheses">(</span>null<span class="parentheses">)</span>; <span class="comment">// false</span>
<span class="methodName">isArray</span><span class="parentheses">(</span>new Object<span class="parentheses">())</span>; <span class="comment">// false</span>

<span class="methodName">isNotArray</span><span class="parentheses">(</span>new Object[0]<span class="parentheses">)</span>; <span class="comment">// false</span>
<span class="methodName">isNotArray</span><span class="parentheses">(</span>new Object[0].getClass<span class="parentheses">())</span>; <span class="comment">// false</span>
<span class="methodName">isNotArray</span><span class="parentheses">(</span>null<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isNotArray</span><span class="parentheses">(</span>new Object<span class="parentheses">())</span>; <span class="comment">// true</span>
</pre>

#### findComponentType(Class|Object):Class

Find the core type of an array of any dimensions, that is for a 3D int array (`int[0][][]`) the returned type would be
`int.class`.

<pre class="source">
<span class="methodName">findComponentType</span><span class="parentheses">(</span>new byte[0]<span class="parentheses">)</span>; <span class="comment">// byte.class</span>
<span class="methodName">findComponentType</span><span class="parentheses">(</span>new char[0][]<span class="parentheses">)</span>; <span class="comment">// char.class</span>
<span class="methodName">findComponentType</span><span class="parentheses">(</span>new short[0][][]<span class="parentheses">)</span>; <span class="comment">// short.class</span>
<span class="methodName">findComponentType</span><span class="parentheses">(</span>1<span class="parentheses">)</span>; <span class="comment">// Integer.class</span>
</pre>

#### isEmpty(Object):boolean

Check if the supplied array is empty, that is it has a length of `0` at it's final dimension or is `null`.

<pre class="source">
<span class="methodName">isEmpty</span><span class="parentheses">(</span>new byte[0]<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isEmpty</span><span class="parentheses">(</span>new char[3][]<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isEmpty</span><span class="parentheses">(</span>new short[3][3][]<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isEmpty</span><span class="parentheses">(</span>null<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isEmpty</span><span class="parentheses">(</span>new int[3][3][3]<span class="parentheses">)</span>; <span class="comment">// false</span>
<span class="methodName">isEmpty</span><span class="parentheses">(</span>1<span class="parentheses">)</span>; <span class="comment">// false</span>
</pre>

#### isEmpty(Object):boolean

Check if the supplied array is blank, that is it empty or all it's values are `null` or `0`.

<pre class="source">
<span class="methodName">isBlank</span><span class="parentheses">(</span>new byte[0]<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isBlank</span><span class="parentheses">(</span>new char[3][]<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isBlank</span><span class="parentheses">(</span>new short[3][3][]<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isBlank</span><span class="parentheses">(</span>new int[3][3][3]<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isBlank</span><span class="parentheses">(</span>new Object[3]<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isBlank</span><span class="parentheses">(</span>null<span class="parentheses">)</span>; <span class="comment">// true</span>
<span class="methodName">isBlank</span><span class="parentheses">(</span>new String[] {<span class="string">"not blank."</span>}<span class="parentheses">)</span>; <span class="comment">// false</span>
<span class="methodName">isBlank</span><span class="parentheses">(</span>1<span class="parentheses">)</span>; <span class="comment">// false</span>
</pre>