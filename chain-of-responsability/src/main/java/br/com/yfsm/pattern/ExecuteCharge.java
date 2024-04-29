package br.com.yfsm.pattern;

import br.com.yfsm.pattern.domain.accounts.BankAccount;
import br.com.yfsm.pattern.domain.customer.Customer;
import br.com.yfsm.pattern.domain.payments.QueuePayments;

public class ExecuteCharge {

    public static void main(String[] args) {

        var account = BankAccount.builder().balanceCredit(1000).build();
        var customer = Customer.builder()
                .name("John")
                .email("j@j.com")
                .phone("12345678")
                .account(account)
                .build();
        new QueuePayments().executePayment(customer, 100);

    }
}
