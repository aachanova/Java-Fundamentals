package Ex04_Orders;

public class Product {
    private double price;
    private Integer quantity;

    public Product(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void increaseQuantity(int quantity) {
        this.quantity += quantity;
    }

    public double calculateTotalPrice() {
        return this.price * this.quantity;
    }
}
