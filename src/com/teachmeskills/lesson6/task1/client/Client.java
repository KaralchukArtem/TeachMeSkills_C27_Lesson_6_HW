package com.teachmeskills.lesson6.task1.client;

import com.teachmeskills.lesson6.task1.card.CreditCard;

public class Client {

    String name;
    String bankAccountNumber;
    CreditCard creditCard = new CreditCard();

    public Client(String name, String bankAccountNumber) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
    }


    public void depositCard(double deposit, CreditCard[] agr) {
        creditCard.depositCard(deposit, bankAccountNumber, agr);
    }

    public void withdrawMoney(double deposit, CreditCard[] agr) {
        creditCard.withdrawMoney(deposit, bankAccountNumber, agr);
    }

}


