package MyPackage;

public class Book{
    private String isbn;
    private String title;
    private Author auth;
    private double price;
    
    Book(String isbn, String title, Author auth, double price){
        this.isbn = isbn;
        this.title = title;
        this.auth = auth;
        this.price = price;
    }
    public void display(){
        System.out.println("Book : "+title);
        System.out.println("Author : "+auth.toString());
        System.out.println("ISBN : "+isbn);
        System.out.println("Price : "+price);
    }
}