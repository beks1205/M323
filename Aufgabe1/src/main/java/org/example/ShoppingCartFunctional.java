package org.example;

import java.util.List;

public class ShoppingCartFunctional {
    public static double getDiscountPercentage(List<String> items) {
        boolean bookAdded = items.stream().anyMatch(item -> item.equalsIgnoreCase("book"));
        return bookAdded ? 0.05 : 0.0;
    }
}
