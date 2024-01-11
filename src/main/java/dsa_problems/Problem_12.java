package dsa_problems;

import java.util.Scanner;

/**
 * Print first N numbers
 * that have their
 * sum of digits = K
 *
 * eg: n = 5, k =15
 * output: 69, 78, 87, 96, 159
 * 6+9=15
 * 7+8=15
 * 8+7=15
 * 9+6=15
 * 1+5+9=15
 */
public class Problem_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter value for k : ");
        int k = sc.nextInt();
        int count = 0;
        for (int i = 1; ; i++ ) {
            if (count == n) {
                break;
            }
            int sum = 0;
            for (int num = i; num>0; num/=10) {
                int lastDigit = num % 10;
                sum += lastDigit;
            }
            if (sum == k) {
                System.out.println("no. : " + i);
                count++;
            }
        }
    }
}
