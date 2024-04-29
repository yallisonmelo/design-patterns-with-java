package br.com.yfsm.pattern.domain.customer;

import br.com.yfsm.pattern.domain.accounts.Account;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Customer {
    private String name;
    private String email;
    private String phone;

    private Account account;
}
