package com.teachmeskills.lesson9.task3.card.visa;

import com.teachmeskills.lesson9.task3.card.BaseCard;
import com.teachmeskills.lesson9.task3.utils.Utils;

public class VisaCard extends BaseCard {

    public VisaCard(long cardNumber, int cvcCode, double currentValue, int cardCode, int currencyCode) {
        super(cardNumber, cvcCode, currentValue, cardCode, currencyCode);
    }

    @Override
    public boolean checkTransferLimit() {
        if(getCurrentValue() > Utils.VISA_CARD_LIMIT){
            return true;
        } else {
            return false;
        }
    }
}
