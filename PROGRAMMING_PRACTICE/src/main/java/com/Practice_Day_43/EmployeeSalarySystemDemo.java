package com.Practice_Day_43;

class EmployeeSalaryBase {

    double salary;

    EmployeeSalaryBase(double salary) {
        this.salary = salary;
    }
}

class ManagerSalary extends EmployeeSalaryBase {

    ManagerSalary(double salary) {
        super(salary);
    }

    void calculate() {
        System.out.println("Manager Salary: " + (salary + 10000));
    }
}

class DeveloperSalary extends EmployeeSalaryBase {

    DeveloperSalary(double salary) {
        super(salary);
    }

    void calculate() {
        System.out.println("Developer Salary: " + (salary + 5000));
    }
}

public class EmployeeSalarySystemDemo {
    public static void main(String[] args) {

        ManagerSalary manager = new ManagerSalary(50000);
        manager.calculate();

        DeveloperSalary developer = new DeveloperSalary(40000);
        developer.calculate();
    }
}