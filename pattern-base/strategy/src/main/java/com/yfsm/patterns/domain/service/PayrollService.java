package com.yfsm.patterns.domain.service;

import com.yfsm.patterns.domain.employee.Employee;

public class PayrollService {

    public void adjustSalary(Employee employee) {

        switch (employee.getDepartment()) {
            case SALES:
                employee.setSalary(new SalesPaymentRules().adjustSalary(employee));
                break;
            case IT:
                employee.setSalary(new ITPaymentRules().adjustSalary(employee));
                break;
            case FINANCE:
                employee.setSalary(new FinancePaymentRules().adjustSalary(employee));
                break;
            default:
                throw new IllegalArgumentException("Invalid department");
        }
    }
}
