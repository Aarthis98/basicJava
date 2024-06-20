package June_18;

public class Address {
    String street;
    String city;
    String province;
    String country;
    String postalcode;

    public Address(String street, String city, String province, String country, String postalcode) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.country = country;
        this.postalcode = postalcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", postalcode='" + postalcode + '\'' +
                '}';
    }
}
