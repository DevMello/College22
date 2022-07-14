package com.devmello.chapter10.assignment1013;

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
        Employee Employee5 = new Employee("Jim", "Jones", "555-55-5555", 8, 9, 1965) {
            @Override
            public double earnings() {
                return 90;
            }
        };

	/*
	System.out.println("Employees processed individually:");
	System.out.println("\n: " + salariedEmployee + " earned " + salariedEmployee.earnings());
	System.out.println("\n: " + hourlyEmployee + " earned " + hourlyEmployee.earnings());
	System.out.println("\n: " + commissionEmployee + " earned " + commissionEmployee.earnings());
	System.out.println("\n: " + basePlusCommissionEmployee + " earned " + basePlusCommissionEmployee.earnings());
	System.out.println("\n: " + pieceWorker + " earned " + pieceWorker.earnings());
	*/

        Employee[] employees = new Employee[5];
        // initialize array with Employees
        employees[0] = Employee1;
        employees[1] = Employee2;
        employees[2] = Employee3;
        employees[3] = Employee4;
        employees[4] = Employee5;
        System.out.printf("Employees processed polymorphically:%n%n");

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

        // generically process each element in array employees






    }//end main

}//end class PayrollSystemTest