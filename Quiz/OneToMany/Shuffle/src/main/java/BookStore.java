import java.util.ArrayList;
import java.util.List;

public class BookStore{

    public static void main(String[] args) {
        BookStore bs = new BookStore();
        Book b4 = new Book(201,"Let us C","Robert de Neero","BPB",8);
        Book b5 = new Book(301,"Let us C","James Kent","McGrawHill",18);
        Book b6 = new Book(401,"Let us C","Renan Regalado","Schaums",28);

        List<Book> listofBooks = new ArrayList<Book>();
        listofBooks.add(b4);
        listofBooks.add(b5);
        listofBooks.add(b6);

        for (Book b: listofBooks){
            System.out.println("Author: " + b.author + "," +
                               " Publisher: " + b.publisher + "," +
                               " Quantity: " + b.quantity);
        }
       //System.out.println(listofBooks);

    }
}
