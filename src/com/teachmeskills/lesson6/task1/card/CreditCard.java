package com.teachmeskills.lesson6.task1.card;

import com.teachmeskills.lesson6.task1.service.ClientTransactionCard;

public class CreditCard {

    public String bankAccountNumber;
    public double currentAccount;

    public CreditCard(String bankAccountNumber, double currentAccount) {
        this.currentAccount = currentAccount;
        this.bankAccountNumber = bankAccountNumber;
    }

    public CreditCard() {
    }

    public void depositCard(double deposit, String bankAccountNumber, CreditCard[] creditCard) {
        ClientTransactionCard clientTransactionCard = new ClientTransactionCard();
        for (CreditCard arg : creditCard) {
            clientTransactionCard.depositCard(deposit, bankAccountNumber, arg);
        }
    }

    public void withdrawMoney(double deposit, String bankAccountNumber, CreditCard[] creditCard) {
        ClientTransactionCard clientTransactionCard = new ClientTransactionCard();
        for (CreditCard arg : creditCard) {
            clientTransactionCard.withdrawMoney(deposit, bankAccountNumber, arg);
        }
    }


}
