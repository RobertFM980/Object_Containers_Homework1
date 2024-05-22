package org.example.objectContainers1;

public class Adress {

    public String country;
    public String city;
    public String street;
    public int postalcode;

    public Adress(String country, String city, String street, int postalcode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalcode = postalcode;
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "country='" + country + '\'' ;
    }
}
