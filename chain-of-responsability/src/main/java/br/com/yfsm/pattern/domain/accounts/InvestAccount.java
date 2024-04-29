package br.com.yfsm.pattern.domain.accounts;

import br.com.yfsm.pattern.domain.customer.Customer;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class InvestAccount implements Account {

    private Customer customer;
    private String accountNumber;
    private double balance;
    private String typeInvestment;
    private double cryptocurrency;


    @Override
    public void pay(double value) {
        this.balance -= value;
    }

    @Override
    public double verifyBalance() {
        return this.balance;
    }

}
