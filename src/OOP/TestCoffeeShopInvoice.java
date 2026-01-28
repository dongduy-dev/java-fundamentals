package OOP;

public class TestCoffeeShopInvoice {
    public static void main(String[] args) {
        CoffeeShopInvoice invoice1 = new CoffeeShopInvoice("Trung Nguyen", 200000, 2);
        CoffeeShopInvoice invoice2 = new CoffeeShopInvoice("Legend", 600000, 2);
        System.out.println(invoice1.totalPrice());

        String checkAmount = (invoice1.checkAmount(5))? "Yes":"No";
        System.out.println(checkAmount);

        String checkTTPrice = (invoice1.checkTotalPrice())? "Yes":"No";
        System.out.println(checkTTPrice);

        System.out.println(invoice1.calculateDiscount(15));
        System.out.println(invoice2.calculateDiscount(20));

        System.out.println("Check Out: " + invoice2.checkOutPrice(20));

    }
}
