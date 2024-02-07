package com.teachmeskills.lesson9.task3.fabric;

import com.teachmeskills.lesson9.task3.adress.Address;

public class AddressFabric {
    public static Address createAddress(){
        Address clientAddress = new Address(123231, "Belarus", "Minsk", "SampleStreet", 14);
        return clientAddress;
    }
}
