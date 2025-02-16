package shopping_cart_value;

public class Test {

    public static void main(String[] args) {

        ShoppingCart.Cart cart = new ShoppingCart.Cart();
        cart.addItem(ProductType.PANTS, 2, 16.99);
        cart.addItem(ProductType.SHIRT, 3, 11.99);

        for (Product item : cart.items) {
            System.out.println(item);
        }

        System.out.println("Total : " + cart.getTotal());

    }

}
