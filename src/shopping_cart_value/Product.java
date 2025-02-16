package shopping_cart_value;

enum ProductType {
    SOCKS, SHIRT, PANTS
}

public class Product {

    private final ProductType productType;
    private final int quantity;
    private final double price;

    public Product(ProductType productType, int quantity, double price) {
        this.productType = productType;
        this.quantity = quantity;
        this.price = price;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s, quantity: %d, price: %.2f", productType, quantity, price);
    }

}
