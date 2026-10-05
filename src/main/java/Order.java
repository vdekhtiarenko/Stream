import java.util.Objects;

public final class Order {
    private final String product;
    private final double cost;

    public Order(String product, double cost) {
        this.product = Objects.requireNonNull(product, "product");
        if (product.isBlank()) throw new IllegalArgumentException("Product must not be blank");
        if (!Double.isFinite(cost) || cost < 0) throw new IllegalArgumentException("Cost must be finite and non-negative");
        this.cost = cost;
    }

    public String getProduct() {
        return product;
    }

    public double getCost() {
        return cost;
    }
}
