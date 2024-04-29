package br.com.yfsm.pattern.domain.payments;

import br.com.yfsm.pattern.domain.accounts.Account;
import lombok.Setter;

public class PaymentInvestiment implements Payment {

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
        bankAccount.pay(value);
        logger.info("Payment done!");
        logger.info("Payment done!");
        logger.info( () -> "Value: " + value);
    }
}
