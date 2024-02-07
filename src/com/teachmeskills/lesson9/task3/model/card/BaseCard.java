package com.teachmeskills.lesson9.task3.card;

import com.teachmeskills.lesson9.task3.utils.Utils;

public abstract class BaseCard implements ICardServices {
    private long cardNumber;
    private int cvcCode;
    private double currentValue;
    private int cardCode;
    private int currencyCode;

    public BaseCard(long cardNumber, int cvcCode, double currentValue, int cardCode, int currencyCode) {
        this.cardNumber = cardNumber;
        this.cvcCode = cvcCode;
        this.currentValue = currentValue;
        this.cardCode = cardCode;
        this.currencyCode = currencyCode;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        if(cardNumber > 100_000_000){
            this.cardNumber = cardNumber;
        } else{
            System.out.println("Incorrect card number!");
        }
    }

    public int getCvcCode() {
        return cvcCode;
    }

    public void setCvcCode(int cvcCode) {
        if(cvcCode >= 100 && cvcCode <= 999){
            this.cvcCode = cvcCode;
        } else {
            System.out.println("Incorrect cvc code!");
        }
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        if(currentValue > 0.00){
            this.currentValue = currentValue;
        } else {

        }
    }

    public int getCardCode() {
        return cardCode;
    }

    public void setCardCode(int cardCode) {
        if(cardCode >= 1000 && cardCode <= 9999){
            this.cardCode = cardCode;
        } else {
            System.out.println("Incorrect card code!");
        }
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(int currencyCode) {
        if(currencyCode == Utils.BYN_CURRENCY_CODE ||
           currencyCode == Utils.EUR_CURRENCY_CODE ||
           currencyCode == Utils.USD_CURRENCY_CODE){
            this.currencyCode = currencyCode;
        } else {
            System.out.println("Incorrect currency code!");
        }
    }
}
