package com.teachmeskills.lesson9.task3.utils;

import com.teachmeskills.lesson9.task3.model.card.BaseCard;

/**
 * This class contain utility variables and methods.
 */

public class Utils {
    public static final double BEL_CARD_LIMIT = 100.00;
    public static final double VISA_CARD_LIMIT = 0.00;
    public static final double MASTERCARD_LIMIT = 500.00;
    public static final double USD_TO_BYN_TRANSFER = 3.2;
    public static final double USD_TO_EUR_TRANSFER = 0.9;
    public static final double BYN_TO_EUR_TRANSFER = 0.29;
    public static final double BYN_TO_USD_TRANSFER = 0.31;
    public static final double EUR_TO_BYN_TRANSFER = 3.44;
    public static final double EUR_TO_USD_TRANSFER = 1.07;
    public static final int USD_CURRENCY_CODE = 1;
    public static final int BYN_CURRENCY_CODE = 2;
    public static final int EUR_CURRENCY_CODE = 3;
    public static final double TRANSFER_COMMISSION = 0.03;

    public static boolean currencyChecker(BaseCard card, BaseCard card2){
        if(card.getCurrencyCode() != card2.getCurrencyCode()){
            return true;
        } else {
            return false;
        }
    }
    public static double currencyConverter(int currencyFrom, int currencyTo, double value){
        if(currencyFrom == USD_CURRENCY_CODE){
            if(currencyTo == BYN_CURRENCY_CODE){
                value *= USD_TO_BYN_TRANSFER;
            } else if(currencyTo == EUR_CURRENCY_CODE){
                value *= USD_TO_EUR_TRANSFER;
            }
            return value;
        } else if(currencyFrom == BYN_CURRENCY_CODE){
            if(currencyTo == USD_CURRENCY_CODE){
                value *= BYN_TO_USD_TRANSFER;
            } else if(currencyTo == EUR_CURRENCY_CODE){
                value *= BYN_TO_EUR_TRANSFER;
            }
            return value;
        } else if(currencyFrom == EUR_CURRENCY_CODE){
            if(currencyTo == BYN_CURRENCY_CODE){
                value *= EUR_TO_BYN_TRANSFER;
            } else if(currencyTo == USD_CURRENCY_CODE){
                value *= EUR_TO_USD_TRANSFER;
            }
            return value;
        } else {
            System.out.println("Incorrect data!");
            return -1;
        }
    }
}

}
