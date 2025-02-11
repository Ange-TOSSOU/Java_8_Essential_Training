# Instructions

## Throw and catch an exception
You're given a method that receives an `int` parameter and returns a `String` that's built based on that value. The `int` value can't be less than `1`.

**Your task**: Create `try / catch` block that throws and handles an exception when the `int` parameter is less than `1`.

## Parameters
`barks`: `int`, the number of times the dog should bark

## Result
`String`: If `barks` is 1 or greater, a `String` containing that number of sounds. If `barks` is less than `1`, the error message defined in the `ERROR_MESSAGE` constant.

## Constraints
- The decision as to what `String` is returned should be made with a `try / catch` block. (You should use an `if / else` block to do the same thing and "fool" the challenge, but that isn't the goal.)

## Example 1:
Input: `3`\
Output: `"Woof! Woof! Woof!"`

## Example 2:
Input: `0`\
Output: `"The value of barks must be greater than 0."`
