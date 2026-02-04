package OOP.ComputerInfoManagement;

public class Computer {
    private Manufactor manufacturer;
    private Date manufactureDate;
    private double price;
    private int warrantPeriod;

    public Computer(Manufactor manufacturer, Date manufactureDate, double price, int warrantPeriod) {
        this.manufacturer = manufacturer;
        this.manufactureDate = manufactureDate;
        this.price = price;
        this.warrantPeriod = warrantPeriod;
    }

    public Manufactor getManufacturer() {
        return manufacturer;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public double getPrice() {
        return price;
    }

    public int getWarrantPeriod() {
        return warrantPeriod;
    }

    public void setManufacturer(Manufactor manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWarrantPeriod(int warrantPeriod) {
        this.warrantPeriod = warrantPeriod;
    }

    @Override
    public String toString() {
        return "Computer[" +
                "manufacturer=" + manufacturer +
                ", manufactureDate=" + manufactureDate +
                ", price=" + price +
                ", warrantPeriod=" + warrantPeriod +
                ']';
    }

    public boolean checkIfCheaper(Computer computer) {
        return this.price < computer.getPrice();
    }

    public String getCountryName(){
        return this.manufacturer.getCountry().getCountryName();
    }
}
