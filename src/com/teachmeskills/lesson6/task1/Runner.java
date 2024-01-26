package com.teachmeskills.lesson6.task1;

import com.teachmeskills.lesson6.task1.card.CreditCard;
import com.teachmeskills.lesson6.task1.client.Client;

public class Runner {

    public static void main(String[] args) {


        Client [] clients = new Client[]{
                new Client("Тема1","111-222-333"),
                new Client("Тема2","444-555-666"),
                new Client("Тема3","777-888-999")
        };

        CreditCard []creditCards = new CreditCard[]{
                new CreditCard("111-222-333",270),
                new CreditCard("444-555-666",350),
                new CreditCard("777-888-999",420),
                new CreditCard("757-888-939",100),
                new CreditCard("767-228-111",200)
        };


        for (Client client: clients){
            client.DepositCard(53,creditCards);
        }
        for (Client client: clients){
            client.WithdrawMoney(5,creditCards);
        }
        for (CreditCard card: creditCards){
            System.out.println(card.bankAccountNumber + "  " + card.currentAccount);
        }

    }

}
