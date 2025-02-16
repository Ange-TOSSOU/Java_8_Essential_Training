# Instructions

## Calculate the total value of a shopping cart
The starting code includes 3 classes and an enumeration. The `ShoppingCart` class has an inner `Cart` class that uses a `List`, implemented as `ArrayList`, to manage the cart's items. Each item is an instance of the `Product` class, which has fields for product type, quantity and price. The testing code calls an `addItem()` method to add items to the cart.

**Your task**:
- Implement the `getTotal()` method of the nested `Cart` class to calculate and return the cart's total value.

## Parameters
Items are added to the cart by calling `addItem()` from the `ShoppingCart` class's nested `Cart` class. The method can be called multiple times to add multiple items to the cart. 

## Result
`double`: The cart's total value, calculated as the sum of each item's value. Each item's value should be calculated as `quantity * price`.

## Constraints
- The `addItem()` method's signature should not be changed.
- The `Product` class is already finished and has fields for a product type, quantity, and price. You do not need to change it.
- The `ProductType` enum is finished, and has values for 3 different types of products. You do not need to change it.

## Example:
- The starting code adds two items to the cart:
```
cart.addItem(ProductType.PANTS, 2, 16.99);
cart.addItem(ProductType.SHIRT, 3, 11.99);
```
The resulting cart value after adding these items should be `69.95` expressed as a `double` value.
