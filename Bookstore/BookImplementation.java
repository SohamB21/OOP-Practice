package MyPackage;
/* Q.4) The bookstore sells a variety of books that cater to a large audience. The details of the book need to be
 * stored in an automated system that will help the store manager organize the stock efficiently. Write a java class
 * that will capture the attributes and behaviours of the program. Task Detail : 
 * 1) Create a book class and define the attributes like ISBN no, title, description and price 
 * 2) Identify the relation between book and the author. 
 * 3) Create an author class and create attributes like author name and pen name (toString()) 
 * 4) Another class to print both the details.
 */
 
public class BookImplementation{
    public static void main(String args[]){
        Author author1 = new Author("Chetan Bhagat", "C.B.");
        Book book1 = new Book("01234567891013", "2 States", author1, 350);
        book1.display();
    }
}
