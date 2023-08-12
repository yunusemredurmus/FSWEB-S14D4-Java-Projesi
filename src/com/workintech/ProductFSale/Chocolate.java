package com.workintech.ProductFSale;

public class Chocolate extends ProductForSale {
    private String fruits;

    public Chocolate
            (String type, int price, String description, String fruits) {
        super(type, price, description);

        this.fruits =fruits;
}


}
