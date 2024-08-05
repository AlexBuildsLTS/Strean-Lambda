package se.alex.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Package {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Bread", 120.00, 0));
        products.add(new Product("Butter", 130.00, 5));
        products.add(new Product("Bacon", 80.00, 15));
        products.add(new Product("Milk", 110.00, 8));
        products.add(new Product("Cheese", 160.00, 0));

        // Print out all products that have stock of 0
        System.out.println("Products with stock of 0:");
        products.stream()
                .filter(product -> product.getStock() == 0)
                .forEach(System.out::println);

        // Print out the product name of all products that start with 'B'
        System.out.println("\nProducts that start with 'B':");
        products.stream()
                .filter(product -> product.getProductName().startsWith("B"))
                .map(Product::getProductName)
                .forEach(System.out::println);

        // Print out all products that have a price above 100 and lower than 150
        System.out.println("\nProducts with price > 100 and < 150:");
        products.stream()
                .filter(product -> product.getPrice() > 100 && product.getPrice() < 150)
                .forEach(System.out::println);

        // Increase the price of all products that have a stock value less than 10 and above 0 by 50%
        System.out.println("\nIncreasing price of products with stock > 0 and < 10 by 50%:");
        products.stream()
                .filter(product -> product.getStock() > 0 && product.getStock() < 10)
                .forEach(product -> product.setPrice(product.getPrice() * 1.5));

        // Print all products to verify the price increase
        System.out.println("\nAll products after price increase:");
        products.forEach(System.out::println);
    }
}
