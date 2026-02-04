package OOP.ComputerInfoManagement;

public class Manufactor {
    private String brandName;
    private Country country;

    public Manufactor(String brandName, Country country) {
        this.brandName = brandName;
        this.country = country;
    }

    public String getBrandName() {
        return brandName;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Manufactor[" +
                "brandName='" + brandName + '\'' +
                ", country=" + country +
                ']';
    }
}
