package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> items;
    private boolean bookAdded;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.bookAdded = false;
    }

    public void addItem(String item){
        items.add(item);
        if (item.equalsIgnoreCase("book")){
            bookAdded = true;
        }
    }

    public void removeItem(String item) {
        items.remove(item);
        if (item.equalsIgnoreCase("book")) {
            bookAdded = false;
        }
    }

    public boolean hasBook(){
        return  bookAdded;
    }

    public double calculateDiscount() {
        return bookAdded ? 0.05 : 0.0;
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }
}
