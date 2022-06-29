package com.devmello.chapter3.assignment313;
/** Ex Assignment #
 * Defines the Employee class
 * @author devmello
 * 6/14/22
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    //Provide a constructor that initializes the three instance variables.
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    //Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not set its value.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
    public double getSalary() {
        return salary;
    }
}
