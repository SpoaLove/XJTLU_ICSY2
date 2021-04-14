package cn.edu.xjtlu.cpt105.lab4;

import java.util.Scanner;

public class ChristmasTree {

    public static void main(String[] args) {
        treePrint();
    }

    /**
     * Print an asterisk tree of height from a user input
     */
    public static void treePrint() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the height of the tree: ");
        int height = sc.nextInt();
        treePaint(height);
    }

    /**
     * Print an asterisk tree of input height
     * @param height height of tree
     */
    public static void treePaint(int height) {
        for (int i = 1; i <= height; i++) {
            // print tabs in front height - i times
            for (int j = i; j < height; j++) System.out.print("\t");
            // print left asterisks i times
            for (int j = 0; j < i; j++)      System.out.print("*\t");
            // print right asterisks i-1 times
            for (int j = 0; j < i-1; j++)    System.out.print("*\t");
            // Change line
            System.out.println();
        }
    }
}
