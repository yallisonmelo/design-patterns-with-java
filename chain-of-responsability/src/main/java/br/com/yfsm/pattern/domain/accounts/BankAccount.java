package br.com.yfsm.pattern.domain.accounts;

import br.com.yfsm.pattern.domain.customer.Customer;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BankAccount implements Account {

    private Customer customer;
    private double balance;
    private String accountNumber;
    private String accountType;
    private double balanceCredit;
    private double balanceInvestment;

    @Override
    public void pay(double value) {
        this.balance -= value;
    }

    @Override
    public double verifyBalance() {
        return this.balance;
    }
}
