package Exp1;
/*
Create a class called Product that includes three pieces of information as instance variables:
productName, productCode, and price. Your class should have a constructor to initialize these
variables. Provide set and get methods for each variable. If the price is negative, set it to 0.0. Write a
test application named ProductTest that demonstrates the class capabilities. Create two Product
objects and calculate the total price of both products.
 */

class Product{
    private String productName;
    private int productCode;
    private double price;

    Product(String name, int code, double price){
        this.productName = name;
        this.productCode = code;
        if(price < 0){
            this.price = 0;
        }else{
            this.price = price;
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class ProductTest {
    public static void main(String[] args){

        Product p1 = new Product("Bread",101,35);
        Product p2 = new Product("Cold Drink",102,20);
        System.out.println("Total Price : "+(p1.getPrice()+ p2.getPrice()));

    }
}
