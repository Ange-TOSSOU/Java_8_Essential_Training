# Instructions

## Output values from an object's super types
This challenge calls a method with no parameters.

**Your task**: Return a `String` expression based on returned values from two classes, one of which overrides a method of its superclass.

## Parameters
**None**

## Result
`String`: An expression based on returned values from two classes, one of which overrides a method of its superclass.

## Constraints
- The `Dog` class should return a `String` value of `"Woof"`.
- The `Poodle` class should have a `getBark()` method that overrides the same method in the `Dog` superclass and returns the value `"Arf"`. The `Retriever` class should inherit the `getBark()` method from its `Dog` superclass.
- The returned value must have the form:\
"The poodle says Arf and the retriever says Woof."

You could just return that `String` and the challenge would appear to succeed, but the goal is to accomplish this using inheritance.

## Output
The returned value must have the form:\
"The poodle says Arf and the retriever says Woof."
