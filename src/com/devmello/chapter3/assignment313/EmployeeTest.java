package com.devmello.chapter3.assignment313;
/** Ex 3.13
 * testing the Employee class
 * @author devmello
 * 6/14/22
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Smith", 1000.0);
        Employee employee2 = new Employee("Jane", "Doe", 2000.0);
        System.out.println("Employee 1: " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSalary());
        System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getLastName() + " " + employee2.getSalary());
        employee.setSalary(employee.getSalary() * 1.1);
        employee2.setSalary(employee2.getSalary() * 1.1);
        System.out.println("Employee 1: " + employee.getFirstName() + " " + employee.getLastName() + " " + employee.getSalary());
        System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getLastName() + " " + employee2.getSalary());
    }
}
