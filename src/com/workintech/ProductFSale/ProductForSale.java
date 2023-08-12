package com.workintech.ProductFSale;

public class ProductForSale {
    private String type;
    private int price;
    private String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void getSalesPrice(int quantity) {
        return quantity * price;

    }

    public void showDetails () {
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
    }


}
