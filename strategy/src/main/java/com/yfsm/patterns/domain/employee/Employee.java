package com.yfsm.patterns.domain.employee;

public class Employee {

    private String name;
    private double salary;
    private int age;
    private Departament department;

    public Employee(String name, double salary, int age, Departament department) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Departament getDepartment() {
        return department;
    }

    public void setDepartment(Departament department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department=" + department +
                '}';
    }
}
