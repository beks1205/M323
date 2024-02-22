package org.example;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("book");
        cart.addItem("castor");
        cart.removeItem("book");
        cart.addItem("book");
        cart.addItem("book");

        System.out.println(cart.calculateDiscount());
    }
    public static int wordScore(String word) {
        return (int) word.chars()
                .filter(ch -> ch != 'a' && ch != 'A')
                .count();
    }
    public static int calculateScore(String word){
        int score = 0;
        for (char c : word.toCharArray()) {
            if (!(c == 'a')){
                score++;
            }
        }
        return score;
    }
}

