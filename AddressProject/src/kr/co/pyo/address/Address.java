package kr.co.pyo.address;

import java.util.Objects;

public class Address implements Comparable<Address> {
    private String name;
    private String city;
    private String detailedAddress;
    private String zipcode;

    public Address() {
        this(null, null, null, null);
    }

    public Address(String name, String city, String detailedAddress, String zipcode) {
        this.name = name;
        this.city = city;
        this.detailedAddress = detailedAddress;
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + city + ", " + detailedAddress + ", " + zipcode + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(zipcode);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address other = (Address) obj;
        return this.zipcode.equals(other.getZipcode());
    }

    @Override
    public int compareTo(Address other) {
        return this.zipcode.compareTo(other.zipcode);
    }
}