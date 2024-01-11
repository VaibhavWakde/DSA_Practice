package dsa_problems;


import java.util.Scanner;

/**
 * Given a Positive number, find the number of digits in the no. (print how many digit present in no.)
 *
 *
 */
public class Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i>0; i/=10){
            sum ++;
        }
        System.out.println(sum);

    }
}
