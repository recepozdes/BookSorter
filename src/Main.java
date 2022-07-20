import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TreeSet<Book> books = new TreeSet<>();

        Book book1 = new Book("Java101", 100, "John", "2016");
        Book book2 = new Book("Java102", 200, "Micheal", "2020");
        Book book3 = new Book("Introduction To Java", 128, "Mary", "1998");
        Book book4 = new Book("Data Structure", 228, "Alicia", "2012");
        Book book5 = new Book("Evolution Of Java", 428, "Osborne", "2021");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println();
        System.out.println("Kitap ismine göre sıralama oluşturuluyor");
        System.out.println();

        for (Book book : books) {
            System.out.println(book.getTitle());
        }

        TreeSet<Book> bookss = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()- o2.getPageNumber();
            }
        });
        bookss.add(book1);
        bookss.add(book2);
        bookss.add(book3);
        bookss.add(book4);
        bookss.add(book5);
        System.out.println();
        System.out.println("Kitap sayfa sayısına göre sıralama oluşturuluyor");
        System.out.println();
        for (Book book : bookss) {
            System.out.println(book.getTitle()+" "+book.getPageNumber());
        }
    }
}
