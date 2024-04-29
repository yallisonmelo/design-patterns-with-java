package br.com.yfsm.pattern.domain.payments;

import br.com.yfsm.pattern.domain.customer.Customer;

public class QueuePayments {

    public void executePayment(Customer customer, double value) {
        var paymentDebit = new PaymentDebit();
        var paymentCredit = new PaymentCredit();
        var paymentinvestiment = new PaymentInvestiment();
        var paymentCripto = new PaymentCripto();
        var problem = new ProblemPayment();

        paymentDebit.setNextPayment(paymentCredit);
        paymentCredit.setNextPayment(paymentinvestiment);
        paymentinvestiment.setNextPayment(paymentCripto);
        paymentCripto.setNextPayment(problem);

        paymentDebit.execute(customer.getAccount(), value);
    }
}
