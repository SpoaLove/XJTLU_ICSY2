package cn.edu.xjtlu.cpt105.week5.CW2;

import java.util.Scanner;

/**
 * CW2.1 Question 3
 */
public class Question3 {

    public static void main(String[] args) {
        // Create an instance of Scanner
        Scanner scanner = new Scanner(System.in);

        // Let n be the input integer from Scanner
        int n = scanner.nextInt();

        // Declare and initialize a sum to be
        double sum = 0.0;

        for (int i = 1; i <= n; i++)
            sum += 1.0/(i*i*i);

        System.out.println(sum);
    }
}
