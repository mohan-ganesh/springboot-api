package com.example.user.demo.pojo;

public class Address {

    public String street1;
    public String stree2;
    public String city;
    public String state;
    public int zipcode;

    public Address(String id) {
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStree2() {
        return stree2;
    }

    public void setStree2(String stree2) {
        this.stree2 = stree2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
