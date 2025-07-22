package Entityclassassignment2;

import java.util.Scanner;

public class Product {

        private int productId;
        private String productName;
        private double price;

        // Constructor
        public Product(int productId, String productName, double price) {
            this.productId = productId;
            this.productName = productName;
            this.price = price;
        }

        // Display method
        public void display() {
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("---------------------------");
        }
    

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[4];

        // Collect product details from user
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Product " + (i + 1));

            System.out.print("Enter Product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Consume leftover newline

            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Product Price: ");
            double price = scanner.nextDouble();

            products[i] = new Product(id, name, price);
            System.out.println();
        }

        // Display all product details
        System.out.println("----- Product Details -----");
        for (Product product : products) {
            product.display();
        }

        scanner.close();
    }
}

