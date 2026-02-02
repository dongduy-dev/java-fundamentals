package OOP.BookManagement;

public class BookManagementTest {
    public static void main(String[] args) {
        Date date1 = new Date(15, 06, 2004);
        Date date2 = new Date(1, 1, 2005);

        Author author1 = new Author("DongDuy", date1);
        Author author2 = new Author("Zoe", date1);

        Book book1 = new Book("No Longer Human", 1290000, 2005, author1);
//        System.out.println(book1);
        Book book2 = new Book("Harry Potter", 1290000, 2005, author2);
//        book1.setTitle("On the floor");
//        book1.setAuthor(new Author("Jane", new Date(1,1,2000)));
//        book1.setPrice(980000);
//        book1.setPublishYear(2010);
//        System.out.println(book1);

        book1.printTitle();
        System.out.println(book1.checkSameYear(book2));
        System.out.println(book2.priceAfterDiscount(0));
    }
}
