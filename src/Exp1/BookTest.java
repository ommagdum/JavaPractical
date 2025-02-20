package Exp1;

class Book {
    private String title;
    private String author;
    private double price;

    Book(String title,String author, double price){
        this.title = title;
        this.author = author;
        if(price < 0){
            this.price = 0;
        }else{
            this.price = price;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class BookTest{
    public static void main(String[] args){
        Book b1 = new Book("Core Java","XYZ",17.50);
        Book b2 = new Book("Advanced Python","ABC",-23);
        System.out.println(b1.getTitle() + " - "+b1.getAuthor()+" - $"+b1.getPrice());
        System.out.println(b2.getTitle() + " - "+b2.getAuthor()+" - $"+b2.getPrice());
        System.out.println("Total Cost : $"+(b1.getPrice() + b2.getPrice()));
    }
}
