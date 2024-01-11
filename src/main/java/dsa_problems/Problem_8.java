package dsa_problems;

import java.util.Scanner;

/**
 * Given a number, find the sum of the value of all the numbers
 * eg: n = 20
 * iterate upto 20 and print each number value
 */
public class Problem_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i =0; i<=n; i++) {
            int sum = 0;
            for (int num = i; num>0; num/=10) {
                int lastDigit = num % 10;
                sum += lastDigit;
            }
            System.out.println(sum);
        }
    }
}
