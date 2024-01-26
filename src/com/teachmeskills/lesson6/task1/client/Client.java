package com.teachmeskills.lesson6.task1.client;

import com.teachmeskills.lesson6.task1.card.CreditCard;
import com.teachmeskills.lesson6.task1.service.ClientTransactionCard;

public class Client {

    String name;
    String bankAccountNumber;

    public Client (String name, String bankAccountNumber){
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void DepositCard(double deposit, CreditCard ...creditCard){
        ClientTransactionCard clientTransactionCard = new ClientTransactionCard();
        for (CreditCard arg: creditCard){
            clientTransactionCard.DepositCard(deposit,bankAccountNumber,arg);
        }
        System.out.println(name + " " + bankAccountNumber + "\n");
    }

    public void WithdrawMoney(double deposit,CreditCard ...creditCard){
        ClientTransactionCard clientTransactionCard = new ClientTransactionCard();
        for (CreditCard arg: creditCard){
            clientTransactionCard.WithdrawMoney(deposit,bankAccountNumber,arg);
        }
        System.out.println(name + " " + bankAccountNumber + "\n");
    }

}


