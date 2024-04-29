package br.com.yfsm.pattern.domain.payments;

import br.com.yfsm.pattern.domain.accounts.Account;
import br.com.yfsm.pattern.domain.accounts.BankAccount;

import java.util.logging.Logger;

public interface Payment {

    Logger logger = Logger.getLogger(Payment.class.getName());

    void execute(Account account, double value);

    default void nextPayment(Payment payment, BankAccount bankAccount, double value) {
        payment.execute(bankAccount, value);
    }


    void pay(Account account, double value);
}
