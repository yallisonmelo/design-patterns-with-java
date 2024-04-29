package br.com.yfsm.pattern.domain.payments;

import br.com.yfsm.pattern.domain.accounts.Account;
import lombok.Setter;

import java.util.logging.Level;


public class PaymentDebit implements Payment {

    @Setter
    private Payment nextPayment;

    @Override
    public void execute(Account bankAccount, double value) {
        double balance = bankAccount.verifyBalance();
        if (balance > 0) {
            pay(bankAccount, value);
        } else {
            nextPayment.execute(bankAccount, value);
        }
    }


    @Override
    public void pay(Account bankAccount, double value) {
        value = value - value * 0.9;
        bankAccount.pay(value);
        logger.info("Payment done!");
        logger.log(Level.INFO, "Amount Paid : {0}", value);
        logger.log(Level.INFO, "Balance actual: {}", bankAccount.verifyBalance());
    }
}
