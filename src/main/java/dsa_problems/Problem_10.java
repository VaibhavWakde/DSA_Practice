package dsa_problems;

import java.util.Scanner;

/**
 * Given number l and r, find the sum of the numbers between given numbers
 * eg: l = 5095 & r =5101
 * iterate from l to r and print each number sum
 */
public class Problem_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int l = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int r = sc.nextInt();
        for (int i = l; i<=r; i++) {
            int sum = 0;
            for (int num = i; num>0; num/=10) {
                int lastDigit = num % 10;
                sum += lastDigit;
            }
            System.out.println(sum);
        }
    }
}
