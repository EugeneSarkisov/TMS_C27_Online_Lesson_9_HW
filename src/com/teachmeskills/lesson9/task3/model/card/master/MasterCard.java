package com.teachmeskills.lesson9.task3.card.master;

import com.teachmeskills.lesson9.task3.card.BaseCard;
import com.teachmeskills.lesson9.task3.utils.Utils;

public class MasterCard extends BaseCard {
    private String country;

    public MasterCard(long cardNumber, int cvcCode, double currentValue, int cardCode, int currencyCode, String country) {
        super(cardNumber, cvcCode, currentValue, cardCode, currencyCode);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country.equals("Belarus") || country.equals("Poland") || country.equals("China")){
            this.country = country;
        } else {
            System.out.println("Master Card doesn't support this country.");
        }
    }

    @Override
    public boolean checkTransferLimit() {
        if (getCurrentValue() >= Utils.MASTERCARD_LIMIT && country.equals("Belarus")) {
            return true;
        } else {
            return false;
        }
    }
}
