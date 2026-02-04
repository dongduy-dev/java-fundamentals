package OOP.ComputerInfoManagement;

public class Country {
    private String countryCode, countryName;

    public Country(String countryName, String countryCode) {
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country[" +
                "countryCode='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ']';
    }
}
