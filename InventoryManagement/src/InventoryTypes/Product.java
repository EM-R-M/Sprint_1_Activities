package InventoryTypes;

import java.util.ArrayList;

public class Product {

    private static final ArrayList<Product> inventory = new ArrayList<>();
    private static int nextProductID = 0;
    private final int productID;
    private String productName;
    private String productDescription;
    private float productPrice;
    private int quantityInStock;

    public Product(String productName, String productDescription, float productPrice, int quantity) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.productID = nextProductID++;
        this.quantityInStock = quantity;
        inventory.add(this);
    }

    // No setProductID required.
    public int getProductID() { return productID; }

    public void setProductName(String productName) { this.productName = productName; }
    public String getProductName() { return productName; }

    public void setProductDescription(String productName) { this.productDescription = productDescription; }
    public String getProductDescription() { return productDescription; }

    public void setProductPrice(float newPrice) { this.productPrice = newPrice; }
    public float getProductPrice(){ return productPrice; }

    public void setQuantityInStock(int quantity) { this.quantityInStock = quantity; }
    public float getQuantityInStock(){ return quantityInStock; }

    // GOING TO CHANGE BELOW LATER WHEN THE PROGRAM GETS MORE COMPLEX
    public ArrayList<Product> getInventory() {
        return inventory;
    }
    public void removeFromInventory(Product oldProduct) {
        inventory.remove(oldProduct);
    }

}
