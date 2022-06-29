package com.devmello.chapter6.assignemnet625;
/** Ex 6.25
 * Write a method that determines whether a number is prime
 * Use this method in an application that determines and displays all the prime numbers less than 10,000
 * Initially, you might think that n/2 is the upper limit for which you must test to see whether a number n is prime, but you need only go as high as the square root of n
 * rewrite the program to see if it works both ways
 * @author devmello
 * 6/14/22
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
