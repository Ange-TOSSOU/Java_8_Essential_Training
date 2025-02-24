# Instructions

## Read a text file with Apache Commons
You're given a text file named `hello.txt`, in the directory `/tmp/deps`. The Java runtime for this challenge includes the Apache Commons io library as a dependency, so you can use any classes or interfaces in that library. Documentation for the Apache Commons `IOUtils` class is available on their [web site][apache_commons_material].

**Your task**: Return the contents of the text file as a `String`.

## Parameters
No parameters are passed into the function. Use the name and location of the text file noted above in your code.

## Result
`String`: The contents of the text file

## Constraints
- When you read a file from storage, the process can throw an `IOException`. Wrap any calls to `IOUtils` methods with `try/catch` to handle that exception.


[apache_commons_material]: https://commons.apache.org/proper/commons-io/apidocs/org/apache/commons/io/IOUtils.html
