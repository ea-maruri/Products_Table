package beans;

/**
 * @author EAMT on 23/11/2020
 * Class to represent a <strong>Product</strong>
 */
public class Product {
    // Variable instances
    private String serialNumber;
    private String productName;
    private double itemPrice;
    private int stock;

    /*Constructor*/
    public Product(String serialNumber, String productName, double itemPrice, int stock) {
        this.serialNumber = serialNumber;
        this.productName = productName;
        this.itemPrice = itemPrice;
        this.stock = stock;
    }


    /*Getters and Setters*/
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
