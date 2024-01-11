package dsa_problems;

import java.util.Scanner;

/**
 * Given a Value of N, print only those numbers from 1 to N that the sum of digits = k
 */
public class Problem_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter a Digit: ");
        int k = sc.nextInt();

        for (int i = 0; i<=n; i++) {
            int sum = 0;
            for (int num = i; num>0; num/=10) {
                int lastDigit = num % 10;
                sum += lastDigit;
            }
            if (sum == k)
                System.out.println(i);
        }
    }
}
