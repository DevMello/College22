package com.devmello.midterm.sample.problem2;

import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args) {
        //Ask user to input 8 judges’ scores on a competition. Scores range from 1 to 10
        //Store the score in an array
        //Calculate the average score of the 8 judges
        //Display the average score of the 8 judges
        //Display the number of judges who scored higher than the average score
        //Display the number of judges who scored lower than the average score
        //Display the number of judges who scored equal to the average score
        Scanner input = new Scanner(System.in);
        int[] scores = new int[8];
        int i;
        double average = 0;
        int counter = 0;
        int counter2 = 0;
        int counter3 = 0;
        for (i = 0; i < 8; i++) {
            System.out.println("Enter the score for judge " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }
        for (i = 0; i < 8; i++) {
            average += scores[i];
        }
        average = average/8;
        System.out.printf("The average score is %.2f%n", average);
        //Iterate through the array to find the highest, lowest, total and average of these scores.


    }
}
