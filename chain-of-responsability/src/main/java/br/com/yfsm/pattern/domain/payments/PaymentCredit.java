package br.com.yfsm.pattern.domain.payments;

import br.com.yfsm.pattern.domain.accounts.Account;
import br.com.yfsm.pattern.domain.accounts.BankAccount;
import lombok.Setter;


public class PaymentCredit implements Payment {

    @Setter
    private Payment nextPayment;

    @Override
    public void execute(Account bankAccount, double value) {
        var bankAccountWithCredit = (BankAccount) bankAccount;
        double balance = bankAccount.verifyLimitCredit(bankAccountWithCredit.getBalanceCredit());
        if (balance > 0) {
            pay(bankAccount, value);
        } else {
            nextPayment.execute(bankAccount, value);
        }
    }

    @Override
    public void pay(Account bankAccount, double value) {
        var bankAccountWithCredit = (BankAccount) bankAccount;
        value = value + (value * 0.1);
        bankAccountWithCredit.pay(value);
        logger.info("Payment Credit done!");
        logger.info("Amount Paid : " + value);
        logger.info("Limit actual: " + bankAccount.verifyLimitCredit(bankAccountWithCredit.getBalanceCredit()));

    }
}
