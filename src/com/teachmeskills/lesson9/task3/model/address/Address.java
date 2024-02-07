package com.teachmeskills.lesson9.task3.adress;

public class Address {
    private int postIdx;
    private String country;
    private String city;
    private String street;
    private int houseNum;

    public Address(int postIdx, String country, String city, String street, int houseNum) {
        this.postIdx = postIdx;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNum = houseNum;
    }

    public int getPostIdx() {
        return postIdx;
    }

    public void setPostIdx(int postIdx) {
        this.postIdx = postIdx;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }
}
