package dsa_problems;

import java.util.Scanner;

/**
 * Given a Positive number, check if it's prime number or not
 */
public class Problem_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n>=2) {
            for (int i = 2; i < n / 2; i++) {
                if (n%i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime);
    }
}
