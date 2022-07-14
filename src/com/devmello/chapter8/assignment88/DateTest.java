package com.devmello.chapter8.assignment88;
/** Ex 8.8
 * Date Class tester
 * @author devmello
 * 7/5/22
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(11, 30, 2000);
        System.out.println(date);
        date.nextDay();
        System.out.println(date);
        //Write a program that tests method nextDay in a loop that prints the date during each iteration to illustrate that the method works correctly.
        for (int i = 0; i < 365; i++) {
            date.nextDay();
            System.out.println(date);
            if (date.month == 12 && date.day == 2 && date.year == 2000) {
                break;
            }
        }
        date = new Date(12, 29, 2000);
        for (int i = 0; i < 365; i++) {
            date.nextDay();
            System.out.println(date);
            if (date.month == 1 && date.day == 2 && date.year == 2001) {
                break;
            }
        }
    }
}//The program should stop when the date is December 31, 2000.


