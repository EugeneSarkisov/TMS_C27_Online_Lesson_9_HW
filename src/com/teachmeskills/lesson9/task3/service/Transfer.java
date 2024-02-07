package com.teachmeskills.lesson9.task3.model.card;

import com.teachmeskills.lesson9.task3.model.client.Client;
import com.teachmeskills.lesson9.task3.utils.Utils;

import java.util.Scanner;

public class Transfer {
    public void moneyTransfer(Client client, BaseCard card, BaseCard card2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first card code: ");
        int card1ID = scanner.nextInt();
        System.out.println("Enter the second card code: ");
        int card2ID = scanner.nextInt();
        System.out.println("Enter the amount: ");
        double value = scanner.nextDouble();
        if(card.getCardCode() == card1ID && card2.getCardCode() == card2ID){
            if(card.checkTransferLimit() && card2.checkTransferLimit()){
                System.out.println("Client name and surname: " +  client.getName() + " " + client.getSurname());
                System.out.println("Client amount of cards: " + client.getCards().length);
                System.out.println("First card value before transfer: " + card.getCurrentValue());
                System.out.println("Second card value before transfer: " + card2.getCurrentValue());
                System.out.println("Bank commission: " + value * Utils.TRANSFER_COMMISSION);
                card.setCurrentValue(card.getCurrentValue() - (value + (value * Utils.TRANSFER_COMMISSION)));
                if(Utils.currencyChecker(card, card2)){
                    card2.setCurrentValue(card2.getCurrentValue() + Utils.currencyConverter(card.getCurrencyCode(), card2.getCurrencyCode(), value));
                } else {
                    card2.setCurrentValue(card2.getCurrentValue() + value);
                }
                System.out.println("First card value after transfer: " + card.getCurrentValue());
                System.out.println("Second card value after transfer: " + card2.getCurrentValue());
            } else {
                System.out.println("One of the cards doesn't pass limit verification!");
            }
        } else {
            System.out.println("Error!");
        }
        scanner.close();
    }
}
