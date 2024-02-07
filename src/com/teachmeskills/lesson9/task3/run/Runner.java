package com.teachmeskills.lesson9.task3;

import com.teachmeskills.lesson9.task3.model.card.Transfer;
import com.teachmeskills.lesson9.task3.model.client.Client;
import com.teachmeskills.lesson9.task3.model.fabric.AddressFabric;
import com.teachmeskills.lesson9.task3.model.fabric.CardFabric;


public class Runner {
    public static void main(String[] args) {
        Transfer transfer = new Transfer();
        Client client1 = new Client("Name", "Surname", "MP125231",
                                    1985, AddressFabric.createAddress(), CardFabric.createCards());
        transfer.moneyTransfer(client1, client1.getCards()[0], client1.getCards()[2]);
    }
}
