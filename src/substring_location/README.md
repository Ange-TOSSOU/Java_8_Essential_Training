# Instructions

## Find the location of a substring
You're given a `String` value.

**Your task**: Return the location of a substring within the original value as an `int`.

## Parameters
`message`: A String value

`substring`: A String within the value

## Result
`int`: The location of the substring

## Constraints
- Both the original value and the substring have lengths greater than 0.
- The substring's length is always less than the length of the original value.
- The returned value should not use a zero-based offset. For example, if the substring is at the beginning of the original value, the returned value should be `1`, not `0`.

## Example 1:
Input: `"dogs and cats"`, `"cats"`\
Result: `10`

## Example 2:
Input: `"Now is the time"`, `"is the"`\
Result: `5`
