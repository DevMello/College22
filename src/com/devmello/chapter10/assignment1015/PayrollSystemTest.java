package com.devmello.chapter10.assignment1015;

public class PayrollSystemTest {

    public static void main(String[] args)
    {
        Date.setDate(11, 1, 12);

        // create subclass objects
        Employee Employee1 = new Employee("John", "Smith", "111-11-1111", 11, 03, 1990) {
            @Override
            public double earnings() {
                return 50;
            }
        };
        Employee Employee2 = new Employee("Karen", "Price", "222-22-2222", 10, 22, 1986) {
            @Override
            public double earnings() {
                return 30;
            }
        };
        Employee Employee3 = new Employee("Sue", "Jones", "333-33-3333", 1, 2, 1965) {
            @Override
            public double earnings() {
                return 40;
            }
        };
        Employee Employee4 = new Employee("Bob", "Lewis", "444-44-4444", 5, 6, 1905) {
            @Override
            public double earnings() {
                return 70;
            }
        };
        PieceWorker Employee5 = new PieceWorker ("Jim", "Jones", "555-55-5555", 8, 9, 165, 10, 100);
        Employee[] employees = new Employee[5];
        employees[0] = Employee1;
        employees[1] = Employee2;
        employees[2] = Employee3;
        employees[3] = Employee4;
        employees[4] = Employee5;
        for (int i = 0; i < employees.length; i++)
        {
            if (employees[i].birthMonth == Date.getMonth())
            {
                System.out.println(employees[i] + " earned " + (employees[i].earnings() + 100) + " Birthday Bonus!");
            }
            else
            {
                System.out.println(employees[i] + " earned " + employees[i].earnings());
            }
        }
        for (int j = 0; j < employees.length; j++)
            System.out.printf("Employee %d is a %s%n", j,
                    employees[j].getClass().getName());

    }

}