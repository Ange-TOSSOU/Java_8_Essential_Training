# Instructions

## Create a complex calculator application
You're given two values typed as `String` values.

**Your task**: Return the result of a mathematical operation selected as part of the inputs after converting the values to `double` numbers.

Use exception handling to ensure that the `String` parameters can be converted to `double` values. If either value can't be converted, return the constant `Double.NEGATIVE_INFINITY`.

Use a `switch` statement to evaluate the operation and run the requested math operation. The `operation` variable should be one of these characters : `+`, `-`, `*`, `/`.

## Parameters
`value1`: A first String representing a number

`value2`: A second String representing a number

`operation`: A single character representing a mathematical operation

## Result
`double`: The result of the selected mathematical operation

## Constraints
+ The math operation should be represented by one of four characters:
  - `+` The sum of the two numbers
  - `-` The result of subtracting the second number from the first number
  - `*` The result of multiplying the two numbers
  - `/` The result of dividing the first number by the second number
+ The two `String` values must be formatted so they can be converted to a numeric type.
+ After conversion, each number can be either positive or negative.

## Example 1:
Input: `"5"`, `"10"`\
Result: `15`

## Example 2:
Input: `"15"`, `"2"`\
Result: `7.5`
