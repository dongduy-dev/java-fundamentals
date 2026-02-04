package OOP.ComputerInfoManagement;

public class ComputerManagementTest {
    public static void main(String[] args) {
        Country Japan = new Country("Japan", "Japan+81");
        Country usa = new Country("United State Of America", "USA+1");

        Date date1 = new Date(4,2,2026);
        Date date2 = new Date(6,2,2026);

        Manufactor m1 = new Manufactor("Fujitsu", Japan);
        Manufactor m2 = new Manufactor("HP", usa);

        Computer c1 = new Computer(m1, date1, 5400, 24);
        Computer c2 = new Computer(m2, date2, 3200, 12);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.getCountryName());
        System.out.println(c1.checkIfCheaper(c2));
    }
}
