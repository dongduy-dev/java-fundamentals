package OOP;

public class CoffeeShopInvoice {
    private String coffeeType;
    private double pricePerKg;
    private double checkOutAmount;

    public CoffeeShopInvoice(String coffeeType, double pricePerKg, double CheckOutAmount) {
        this.coffeeType = coffeeType;
        this.pricePerKg = pricePerKg;
        this.checkOutAmount = CheckOutAmount;
    }

    public double totalPrice() {
        return this.pricePerKg * this.checkOutAmount;
    }

    public boolean checkAmount(double amount) {
//        LEVEL 1
//        if (this.CheckOutAmount > amount) {
//            return true;
//        }
//        else  {
//            return false;
//        }
//        LEVEL 2
//        return (this.checkOutAmount > amount)? true:false;
//        LEVEL 3
        return (this.checkOutAmount > amount);
    }

    public boolean checkTotalPrice() {
        return (this.totalPrice() > 500000);
    }

    public double calculateDiscount(double x){
        if(this.totalPrice() >= 500000){
            return this.totalPrice()*(x/100.0);
        }
        else{
            return 0;
        }
    }

    public double checkOutPrice(double x){
        return this.totalPrice() - this.calculateDiscount(x);
    }
}
