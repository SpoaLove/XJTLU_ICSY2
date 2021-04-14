package cn.edu.xjtlu.cpt105.lab4;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        printOdd();
    }

    /**
     *  Ask the user to input a positive integer.
     *  Use for loop to print all the odd integers
     *  which is smaller than or equal to the input integer.
     */
    private static void printOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int input = sc.nextInt();
        while (input<1) {
            System.out.print("Input a positive integer: ");
            input = sc.nextInt();
        }
        printOdd(input);
    }

    /**
     * Use for loop to print all the odd integers
     * which is smaller than or equal to the input integer
     * @param input input positive number
     */
    private static void printOdd(int input) {
        for (int i = 1; i <= input; i+=2) {
            System.out.printf("%d\t\t",i);
            if ((i+1) % 10 == 0) System.out.println();
        }
    }
}
