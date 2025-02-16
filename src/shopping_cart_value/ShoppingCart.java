package shopping_cart_value;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    static class Cart {

        List<Product> items = new ArrayList<>();

        void addItem(ProductType productType, int quantity, double price) {
            items.add(new Product(productType, quantity, price));
        }

        double getTotal() {
            double result = 0.0;

            for (Product item : items) {
                result += item.getPrice() * item.getQuantity();
            }

            return result;
        }

    }

}
