# java-string-program

📘 Java String, StringBuilder & StringBuffer – Complete Guide

This repository explains the three ways to handle strings in Java:

String

StringBuilder

StringBuffer

It includes definitions, key features, and commonly used methods, useful for learning, interviews, and revision.

📌 1. String (java.lang.String)
🔹 Definition

String is an immutable class in Java.
Once a String object is created, its value cannot be changed. Any modification creates a new object in memory.

🔹 Key Features

Immutable

Thread-safe

Stored in String Constant Pool

More secure

Slower for frequent modifications

🔹 Commonly Used String Methods

length()

charAt(int index)

toUpperCase()

toLowerCase()

equals(Object obj)

equalsIgnoreCase(String s)

compareTo(String s)

contains(CharSequence s)

startsWith(String prefix)

endsWith(String suffix)

indexOf(int ch / String s)

lastIndexOf(int ch / String s)

substring(int beginIndex)

substring(int beginIndex, int endIndex)

replace(char old, char new)

replace(CharSequence old, CharSequence new)

trim()

split(String regex)

isEmpty()

concat(String s)

valueOf(any type)

📌 2. StringBuilder (java.lang.StringBuilder)
🔹 Definition

StringBuilder is a mutable class used to create modifiable strings.
It is not thread-safe, but faster than StringBuffer.

🔹 Key Features

Mutable

Not thread-safe

Faster performance

Used in single-threaded applications

🔹 Commonly Used StringBuilder Methods

append(String s)

insert(int index, String s)

replace(int start, int end, String s)

delete(int start, int end)

deleteCharAt(int index)

reverse()

charAt(int index)

setCharAt(int index, char ch)

length()

capacity()

ensureCapacity(int minCapacity)

substring(int start)

substring(int start, int end)

indexOf(String s)

lastIndexOf(String s)

toString()

trimToSize()

📌 3. StringBuffer (java.lang.StringBuffer)
🔹 Definition

StringBuffer is a mutable and thread-safe class.
All methods are synchronized, making it safe for multi-threaded environments.

🔹 Key Features

Mutable

Thread-safe (synchronized)

Slower than StringBuilder

Used in multi-threaded applications

🔹 Commonly Used StringBuffer Methods

append(String s)

insert(int index, String s)

replace(int start, int end, String s)

delete(int start, int end)

deleteCharAt(int index)

reverse()

charAt(int index)

setCharAt(int index, char ch)

length()

capacity()

ensureCapacity(int minCapacity)

substring(int start)

substring(int start, int end)

indexOf(String s)

lastIndexOf(String s)

toString()

trimToSize()

📊 Comparison Table
Feature	String	StringBuilder	StringBuffer
Mutability	❌ Immutable	✅ Mutable	✅ Mutable
Thread-safe	✅ Yes	❌ No	✅ Yes
Performance	Slow	Fast	Medium
Synchronization	Yes	No	Yes
Use Case	Read-only strings	Single-threaded	Multi-threaded
🎯 When to Use What?

✅ Use String when data should not change

✅ Use StringBuilder for fast string manipulation

✅ Use StringBuffer when thread safety is required

🚀 Conclusion

Understanding the difference between String, StringBuilder, and StringBuffer is mandatory for Java developers.
This knowledge helps in writing efficient, optimized, and thread-safe code.
