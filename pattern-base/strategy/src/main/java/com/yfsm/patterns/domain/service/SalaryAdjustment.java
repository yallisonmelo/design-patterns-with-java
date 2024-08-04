package com.yfsm.patterns.domain.service;

import com.yfsm.patterns.domain.employee.Employee;

public interface SalaryAdjustment {

    double adjustSalary(Employee employee);

   default double calculateValues(double salary, double value){
        return salary + (salary /100) * value;
   }
}
