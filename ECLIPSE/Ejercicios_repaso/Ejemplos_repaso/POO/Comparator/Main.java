package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
    public static void main(String[] args) {
    	
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500.0));
        products.add(new Product("Smartphone", 800.0));
        products.add(new Product("Tablet", 500.0));

        PriceComparator comparator = new PriceComparator();
        Collections.sort(products, comparator);

        for (Product product : products) {
            System.out.println(product.getName() + ": $" + product.getPrice());
        }
    }
}
