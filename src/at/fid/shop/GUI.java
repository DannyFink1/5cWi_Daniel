package at.fid.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import at.fid.shop.products.Product;

public class GUI {
    private Scanner scanner = new Scanner(System.in);
    private List<Product> products = new ArrayList();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void run() {
        System.out.println("What do you want to do?");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                for (Product pro : products) {
                    System.out.println(pro);
                }
                break;
            case 2:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Goodbye!");
                break;
        }
    }
}
