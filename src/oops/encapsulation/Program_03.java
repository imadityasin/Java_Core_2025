//Encapsulation.

//Product Price Control
//Question:
//Create a class Product with private fields:
//
//productId (int)
//
//productName (String)
//
//price (double)
//
//Implement getters and setters for all fields. Ensure that:
//
//price cannot be negative.
//
//If a negative price is set, set it to 0.0 and print a warning.

package oops.encapsulation;

import java.util.Scanner;

class Product{
    private int productId;
    private String productName;
    private double price;

    public void setProductId(int productId) {
        this.productId=productId;
    }

    public void setProductName(String productName) {
        this.productName=productName;
    }

    public void setPrice(double price) {
        if(0<=price) {
            this.price=price;
        }
        else{
            System.out.println("price cannot be negative");
        }
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

public class Program_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Product pt=new Product();

        System.out.println("Enter Product ID");
        int productInt=sc.nextInt();
        pt.setProductId(productInt);

        System.out.println("Enter Product Name");
        String productName=sc.nextLine();
        pt.setProductName(productName);

        System.out.println("Enter Product Price");
        double price=sc.nextDouble();
        pt.setPrice(price);

        System.out.println("Your Product ID is = "+pt.getProductId());
        System.out.println("Your Product Name is = "+pt.getProductName());
        System.out.println("Product Price is = "+pt.getPrice());


    }
}
