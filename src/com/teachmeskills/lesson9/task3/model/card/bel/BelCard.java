package com.teachmeskills.lesson9.task3.card.bel;

import com.teachmeskills.lesson9.task3.card.BaseCard;
import com.teachmeskills.lesson9.task3.utils.Utils;

public class BelCard extends BaseCard {
    public BelCard(long cardNumber, int cvcCode, double currentValue, int cardCode, int currencyCode) {
        super(cardNumber, cvcCode, currentValue, cardCode, currencyCode);
    }

    @Override
    public boolean checkTransferLimit(){
        if(getCurrentValue() >= Utils.BEL_CARD_LIMIT){
            return true;
        } else {
            return false;
        }
    }
}
