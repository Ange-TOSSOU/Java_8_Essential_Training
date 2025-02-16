# Instructions

## Create and use a custom class
You're given four values that will become the values of fields in a class named `Dog`.

**Your task**: Add a constructor method to an existing `Dog` class that passes these values to a new instance of the class and returns the new object. Also implement accessor (getter) methods that allow read-only access for each of the class's fields.

## Parameters
`name`: `String`\
`breed`: `String`\
`weight`: `double`\
`color`: `String`

## Result
`Dog`: A new instance of the `Dog` class that has its fields set to the specified values and has accessor (getter) methods allowing read-only access of field values.

## Constraints
- The `Dog` class starts with a no-arguments constructor method and a constructor with 4 parameters that should be passed to the new `Dog` object. The constructor with 4 parameters isn't implemented yet.
- There are also accessor methods for each of the class's fields. They initially return empty `String` values or `0`, depending on type.
- The `Dog` class already has a custom `toString()` method that returns the object as a `String`. This method shouldn't be changed.

## Example:
Input: `"Rover", "Beagle", 32.5, "Brown"`\
Result: `Dog{name='Rover', breed='Beagle', weight=32.5, color='Brown'}`
