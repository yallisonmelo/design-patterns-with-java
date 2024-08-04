package com.yfsm.patterns.domain.service;

import com.yfsm.patterns.domain.employee.Employee;

public class ITPaymentRules implements SalaryAdjustment {

    @Override
    public double adjustSalary(Employee employee) {
        var adjust = 1.9;
        employee.setSalary(this.calculateValues(employee.getSalary(), adjust));
        employee.setSalary(this.calculateValues(employee.getSalary(), employee.getDepartment().fixedValueAdjustIntern));
        return employee.getSalary();
    }

}
