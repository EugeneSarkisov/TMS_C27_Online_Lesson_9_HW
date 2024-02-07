package com.teachmeskills.lesson9.task3.fabric;

import com.teachmeskills.lesson9.task3.card.BaseCard;
import com.teachmeskills.lesson9.task3.card.bel.BelCard;
import com.teachmeskills.lesson9.task3.card.master.MasterCard;
import com.teachmeskills.lesson9.task3.card.visa.VisaCard;

public class CardFabric {
    public static BaseCard[] createCards(){
        BaseCard card1 = new BelCard(111_111_111, 111, 1000.00, 123, 2);
        BaseCard card2 = new VisaCard(222_222_222, 222, 2000.00, 456, 1);
        BaseCard card3 = new MasterCard(333_333_333, 333, 3000.00, 789,
                3, "Belarus");
        BaseCard[] cards = new BaseCard[3];
        cards[0] = card1;
        cards[1] = card2;
        cards[2] = card3;
        return cards;
    }
}
