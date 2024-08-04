package com.yfsm.patterns;

import com.yfsm.patterns.domain.employee.Departament;
import com.yfsm.patterns.domain.employee.Employee;
import com.yfsm.patterns.domain.service.PayrollService;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var listEmployee = getEmployees();
        System.out.println("This list with employee before adjust salary");
        listEmployee.forEach(System.out::println);
        var payrollService = new PayrollService();
        listEmployee.forEach(payrollService::adjustSalary);
        System.out.println("---------------------------------------------");
        System.out.println("This list with employee after adjust salary");
        listEmployee.forEach(System.out::println);
    }

    private static ArrayList<Employee> getEmployees() {
        var john = new Employee("John", 50000, 35, Departament.IT);
        var jane = new Employee("Jane", 60000, 42, Departament.FINANCE);
        var bob = new Employee("Bob", 55000, 28, Departament.SALES);
        var alice = new Employee("Alice", 65000, 51, Departament.IT);
        var tom = new Employee("Tom", 70000, 45, Departament.FINANCE);
        var emily = new Employee("Emily", 48000, 38, Departament.SALES);

        var listEmployee = new ArrayList<Employee>();
        listEmployee.add(john);
        listEmployee.add(jane);
        listEmployee.add(bob);
        listEmployee.add(alice);
        listEmployee.add(tom);
        listEmployee.add(emily);
        return listEmployee;
    }
}