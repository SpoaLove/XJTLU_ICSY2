package cn.edu.xjtlu.cpt105.week5.CW2;

import java.util.Scanner;

/**
 * CW2.1 Question 1
 */
public class Question1 {

    public static void main(String[] args) {
        // Create an instance of Scanner
        Scanner scanner = new Scanner(System.in);

        // Let x be the input integer from Scanner
        int x = scanner.nextInt();

        // Print: "y = (5x^3 + 2x - 88)"
        System.out.println("y = "+(5*x*x*x+2*x-88));
    }
}
