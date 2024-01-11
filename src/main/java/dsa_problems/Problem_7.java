package dsa_problems;

import java.util.Scanner;

/**
 * Given a number, find the sum of the digits
 * eg: n = 71305
 * sout = 16
 */
public class Problem_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i>0; i/=10) {
            int lastDigit = i%10;
            sum +=lastDigit;
        }
        System.out.println(sum);
    }
}
