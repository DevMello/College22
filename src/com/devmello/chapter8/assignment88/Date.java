package com.devmello.chapter8.assignment88;
/** Ex 8.4
 * Date Class
 * @author devmello
 * 7/5/22
 */
public class Date {
      int month; // 1-12
      int day; // 1-31 based on month
      int year; // any year

      private static final int[] daysPerMonth =
         {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

      // constructor: confirm proper value for month and day given the year
      public Date(int month, int day, int year) {
         // check if month in range
         if (month <= 0 || month > 12) {
            throw new IllegalArgumentException(
               "month (" + month + ") must be 1-12");
         }

         // check if day in range for month
         if (day <= 0 ||
            (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day (" + day +
               ") out-of-range for the specified month and year");
         }

         // check for leap year if month is 2 and day is 29
         if (month == 2 && day == 29 && !(year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day +
               ") out-of-range for the specified month and year");
         }

         // check for valid year
            if (year < 0) {
                throw new IllegalArgumentException("year (" + year +
                ") must be at least 1 digit long");
            }

         this.month = month;
         this.day = day;
         this.year = year;

         System.out.printf("Date object constructor for date %s%n", this);
      }

      // return a String of the form month/day/year
      public String toString() {
         return String.format("%d/%d/%d", month, day, year);
      }
      // Provide a method nextDay to increment the day by one
        public void nextDay() {
             if (day < daysPerMonth[month]) {
                day++;
             } else {
                day = 1;
                if (month < 12) {
                 month++;
                } else {
                 month = 1;
                 year++;
                }
             }
        }
        //get methods
        public int getMonth() {
            return month;
        }
        public int getDay() {
            return day;
        }
        public int getYear() {
            return year;
        }


   }