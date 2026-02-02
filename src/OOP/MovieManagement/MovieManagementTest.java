package OOP.MovieManagement;

public class MovieManagementTest {
    public static void main(String[] args) {
        Date date1 = new Date(2,2,2026);
        Date date2 = new Date(20,06,2027);

        Producer producer1 = new Producer("Jane", "America");
        Producer producer2 = new Producer("Alex", "Netherlands");

        Movie move1 = new Movie("The Penguin", 2026, producer1, 25, date1);
        Movie move2 = new Movie("The Grown", 2027, producer2, 50, date2);

//        System.out.println(move1.checkCheaperPrice(move2));s
//        System.out.println(move1.getProducerName());
        System.out.println(move1.priceAfterDiscount(50));
        System.out.println(move2);
        System.out.println(move1.getProducer().getName());

    }
}
