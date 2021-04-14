package cn.edu.xjtlu.cpt105.lab4;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
//        mulTable();

        mulTable(getNumber());

//        String[] names = inputNames();
//        displayNames(names);
    }

    /**
     * Gets an integer user input
     * @return an input integer from scanner
     */
    public static int getNumber() {
        System.out.print("Input a number: ");
        return new Scanner(System.in).nextInt();
    }

    /**
     * Print a multiplication table from 1 to 10
     */
    public static void mulTable() {
        mulTable(10);
    }

    /**
     * Print a multiplication table from 1 to n
     * @param n rows of the multiplication table
     */
    public static void mulTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i * j + "\t\t");
            System.out.println();
        }
    }

    /**
     * Prompts user to input 3 names and returns
     * the names as an array of String
     * @return an String array with 3 names
     */
    public static String[] inputNames() {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Input name number "+i);
            names[i] = sc.nextLine();
        }

        return names;
    }

    /**
     * Displays all names in the array of names
     * @param names the array of String with names
     */
    public static void displayNames(String[] names) {
        System.out.println("\nOutput is:\n  ***");
        for (String name:names) System.out.println(name+"\n ***");
    }

}
