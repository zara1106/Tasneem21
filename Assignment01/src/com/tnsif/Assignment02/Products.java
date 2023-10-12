package com.tnsif.Assignment02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Products {
    private List<String> productList;

    public Products() {
        this.productList = new ArrayList<>();
    }

    // Getter and Setter for productList
    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(List<String> productList) {
        this.productList = productList;
    }

    public void addProductToList(String product) {
        productList.add(product);
    }

    public void sortProductList() {
        Collections.sort(productList);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Products products = new Products();

        while (true) {
            System.out.println("1. Add\n2. Display\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the product: ");
                    scanner.nextLine();  // Consume the newline character
                    String product = scanner.nextLine();
                    products.addProductToList(product);
                    break;

                case 2:
                    List<String> productList = products.getProductList();
                    if (productList.isEmpty()) {
                        System.out.println("The list is empty");
                    } else {
                        products.sortProductList();
                        System.out.println("Products in alphabetical order:");
                        for (String item : productList) {
                            System.out.println(item);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the application");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}