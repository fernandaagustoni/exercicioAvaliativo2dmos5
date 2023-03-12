package br.edu.ifsp.dmos5.model;

public class CreditCard {
    private int id;
    private double balance;
    private static int LAST_CARD_ID = 0;

    public CreditCard(){
        this.id = LAST_CARD_ID + 1;
        LAST_CARD_ID++;
        this.setBalance(15000);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void creditValue(double newValue){
        this.setBalance(this.getBalance() + newValue);
    }

    public void debitValue(double newValue) throws InsufficientMoney {
        if(newValue < this.getBalance()){
            this.setBalance(this.getBalance() - newValue);
        }else{
            throw new InsufficientMoney();
        }
    }

}