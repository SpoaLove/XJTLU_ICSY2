package cn.edu.xjtlu.cpt105.week5.CW2;

import java.util.Scanner;

/**
 * CW2.1 Question 2
 */
public class Question2 {

    public static void main(String[] args) {
        // Create an instance of Scanner
        Scanner scanner = new Scanner(System.in);

        // Let a,b,c be a double from Scanner
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        // Print "equal" iff a=b=c else print "not equal"
        System.out.println(a == b && b == c ? "equal" : "not equal");

    }
}
