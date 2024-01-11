package dsa_problems;

import java.util.Scanner;

/**
 * Fizz Buzz Variation:
 *
 * Write a short program that prints each number from 1 to N on a new line.
 *
 * For each multiple of 3, print "Fizz" instead of the number.
 *
 * For each multiple of 5, print "Buzz" instead of the number.
 *
 * For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
 *
 * otherwise print the value.
 *
 * ***
 * The code has to stop as soon as the sum of the number printed becomes greater then 3*N.
 *
 */
public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int sum   = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }
            else {
                sum +=i;
                System.out.println(i+" sum : "+sum);
            }

            if (sum > 3*n) {
                System.out.println("program break at : "+i);
                break;
            }
        }
    }
}
