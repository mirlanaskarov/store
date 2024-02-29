package kg.mega.shop.models;

public class CustomerProduct {
    private int productId;
    private String name;
    private int amount;
    private double totalPrice;
    private double price;
    private String category;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public CustomerProduct() {
        this.name = name;
        this.amount = amount;
        this.totalPrice = totalPrice;
        this.price = price;
        this.category = category;
    }
}