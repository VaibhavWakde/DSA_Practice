package dsa_problems;

import java.util.Scanner;

/**
 * WAP gives 2 integer, print one that has larger value.
 */

public class Program_2 {
    public static int largerNo(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println(largerNo(a,b));
    }
}
