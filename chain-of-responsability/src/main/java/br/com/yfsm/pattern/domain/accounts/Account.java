package br.com.yfsm.pattern.domain.accounts;

public interface Account {

    void pay(double value);

    double verifyBalance();


    default double verifyLimitCredit(double value) {
        return value;
    }
}
