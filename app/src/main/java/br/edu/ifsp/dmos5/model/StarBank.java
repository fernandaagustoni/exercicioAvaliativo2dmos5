package br.edu.ifsp.dmos5.model;

import java.util.ArrayList;
import java.util.List;

public class StarBank {
    private static StarBank instance = null;


    public StarBank(){
    };

    public static StarBank getInstance(){
        if (instance == null){
            instance = new StarBank();
        }
        return instance;
    }

    public void startCreditCards(CreditCard card){
        card.setBalance(15000);
    }

    public void roundCompleted(CreditCard card, double value){
        card.setBalance(card.getBalance() + 2000);
    }
    public boolean transfer(CreditCard payer, CreditCard receiver, double value){
        try{
            receive(receiver, value);
            pay(payer, value);
        }catch (InsufficientMoney e){
            return false;
        }
        return true;
    }

    public void receive(CreditCard card, double value){
        card.creditValue(value);
    }

    public void pay(CreditCard card, double value) throws InsufficientMoney{
        card.debitValue(value);
    }


}

