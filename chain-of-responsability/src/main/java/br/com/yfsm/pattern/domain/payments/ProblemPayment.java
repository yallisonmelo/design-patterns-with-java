package br.com.yfsm.pattern.domain.payments;

import br.com.yfsm.pattern.domain.accounts.Account;

public class ProblemPayment implements Payment {
    @Override
    public void execute(Account account, double value) {
        logger.info("Payment not possible!");
    }

    @Override
    public void pay(Account account, double value) {
        logger.info("Payment not executed!");
    }
}
