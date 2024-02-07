package com.teachmeskills.lesson9.task3.client;

import com.teachmeskills.lesson9.task3.adress.Address;
import com.teachmeskills.lesson9.task3.card.BaseCard;
import com.teachmeskills.lesson9.task3.fabric.AddressFabric;
import com.teachmeskills.lesson9.task3.fabric.CardFabric;

public final class Client {
    private String name;
    private String surname;
    private String passNumber;
    private int birthYear;
    private Address address;
    private BaseCard[] cards;

    public Client(String name, String surname, String passNumber, int birthYear, Address address, BaseCard[] baseCards) {
        this.name = name;
        this.surname = surname;
        this.passNumber = passNumber;
        this.birthYear = birthYear;
        this.address = address;
        this.cards = baseCards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        this.passNumber = passNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        if (birthYear < 1900 || birthYear > 2024){
            this.birthYear = birthYear;
        } else {
            System.out.println("Incorrect birth year!");
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = AddressFabric.createAddress();
    }

    public BaseCard[] getCards() {
        return cards;
    }

    public void setCards(BaseCard[] cards) {
        this.cards = CardFabric.createCards();
    }
}