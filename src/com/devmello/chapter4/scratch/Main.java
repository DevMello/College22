package com.devmello.chapter4.scratch;

public class Main {
    	public static void main(String[] args) {
            int c = 0;
            int val = 5;
            c = 8;
            val = val + (c == 3 ? 2 : 3);
            System.out.println(val);
            int temp;
            temp = 200;
            if (temp > 90)
                System.out.println("This porridge is too hot.");
            if (temp < 70)
                System.out.println("This porridge is too cold.");
            if (temp == 80)
                System.out.println("This porridge is just right!");
            int counter;
            counter = 1;
            while (counter > 20) {

// body of loop

                counter = counter - 1;
                System.out.println(counter);

            } // end while
            //c = 8;

            c++;

            ++c;

            c %= 5;
            System.out.println(c);
	}

}
