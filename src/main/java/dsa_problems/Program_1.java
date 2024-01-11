package dsa_problems;

import java.util.Scanner;

/**
 * WAP given a value of N, print the sum of 1st N natural numbers.
 *
 * Natural No. : numbers get added, No. that starts for 1 ends with infinity except 0
 *
 */
public class Program_1 {
    public static int addNaturalNo(int n) {
        int sum = 0;
        for (int i = 1; i<=n; i++) {
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(addNaturalNo(n));

    }
}
