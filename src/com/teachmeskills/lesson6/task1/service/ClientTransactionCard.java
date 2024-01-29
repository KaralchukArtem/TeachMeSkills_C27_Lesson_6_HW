package com.teachmeskills.lesson6.task1.service;


import com.teachmeskills.lesson6.task1.card.CreditCard;

import java.util.Objects;

public class ClientTransactionCard {

    public String bankAccountNumberClient;
    public String bankAccountNumberCard;

    public boolean depositCard(double deposit, String bankAccountNumber, CreditCard creditCard) {
        if (Objects.equals(creditCard.bankAccountNumber, bankAccountNumber)) {
            if (deposit >= 10) {
                creditCard.currentAccount += deposit;
                System.out.println("Счет пополнен на сумму - " + deposit + "р");
                System.out.println("Сумма счета - " + creditCard.currentAccount + "р");
                return true;
            } else {
                System.out.println("Минимальная сумма пополнения 10р");
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean withdrawMoney(double deposit, String bankAccountNumber, CreditCard creditCard) {
        if (Objects.equals(creditCard.bankAccountNumber, bankAccountNumber)) {
            double current = creditCard.currentAccount - deposit;
            if (current < 0) {
                System.out.println("Недостаточно средств на счете для снятия");
                return false;
            } else {
                creditCard.currentAccount -= deposit;
                System.out.println("Снято  - " + deposit + "р");
                System.out.println("Сумма счета - " + creditCard.currentAccount + "р");
                return true;
            }
        } else {
            return false;
        }
    }

}
