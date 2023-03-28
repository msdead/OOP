package Семинар.v1_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Twix", 100);
        System.out.println(product);

        List<Product> products = new ArrayList<>();
        products.add(product);

        VendingMachine vendingMachine = new VendingMachine(products);
        vendingMachine.addProduct(product);

        Product bottle = new Bottle("Aqva", 112, 2);
        System.out.println(bottle);
    }
}
