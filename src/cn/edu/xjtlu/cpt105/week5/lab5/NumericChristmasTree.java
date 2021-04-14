package cn.edu.xjtlu.cpt105.week5.lab5;

import java.util.Scanner;

public class NumericChristmasTree {

    static Scanner scanner = new Scanner(System.in);

    /**
     * Numeric Christmas Tree</br>
     * </br>
     * Prompts user to input a height, and generate a
     * numeric christmas tree of input height</br>
     * </br>
     * Test input:
     * </br>
     * <pre>
     *  Input the height of the tree: 5
     *  				1
     *  			2	1	2
     *  		3	2	1	2	3
     *  	4	3	2	1	2	3	4
     *  5	4	3	2	1	2	3	4	5
     * </pre>
     */
    static void numericChristmasTree() {
        System.out.print("Input the height of the tree: ");
        numericChristmasTree(scanner.nextInt());
    }

    /**
     * Numeric Christmas Tree</br>
     * </br>
     * Generate a numeric christmas tree of input height</br>
     *
     * @param height the total height of tree.
     */
    static void numericChristmasTree(int height) {
        for (int i = 1; i <= height; i++)
            printTreeLine(i, height);
    }

    /**
     * Prints the nth line of numeric christmas tree of height.</br>
     *
     * @param n the line of numeric christmas tree.
     * @param height the total height of tree.
     */
    static void printTreeLine(int n, int height) {
        System.out.print("\t".repeat(height-n));
        int[] line = new int[n*2-1];
        for (int i = 0; i < n; i++) line[i] = line[(n-1)*2 - i] = n-i;
        for (int i: line) System.out.print(i + "\t");
        System.out.println();
    }


    /**
     * Numeric Christmas Tree 2</br>
     * </br>
     * Prompts user to input a height, and generate a
     * numeric christmas tree of input height</br>
     * </br>
     * Test input:
     * </br>
     * <pre>
     *  Input the height of the tree: 5
     *  				1
     *  			3	2	3
     *  		5	4	3	4	5
     *  	7	6	5	4	5	6	7
     *  9	8	7	6	5	6	7	8	9
     * </pre>
     */
    static void numericChristmasTree2() {
        System.out.print("Input the height of the tree: ");
        numericChristmasTree2(scanner.nextInt());
    }

    /**
     * Numeric Christmas Tree 2</br>
     * </br>
     * Generate a numeric christmas tree of input height</br>
     *
     * @param height the total height of tree.
     */
    static void numericChristmasTree2(int height) {
        for (int i = 1; i <= height; i++)
            printTreeLine2(i, height);
    }

    /**
     * Prints the nth line of numeric christmas tree 2 of height.</br>
     *
     * @param n the line of numeric christmas tree.
     * @param height the total height of tree.
     */
    static void printTreeLine2(int n, int height) {
        System.out.print("\t".repeat(height-n));
        int[] line = new int[n*2-1];
        for (int i = 0; i < n; i++) line[i] = line[(n-1)*2 - i] = 2*n - i -1;
        for (int i: line) System.out.print(i + "\t");
        System.out.println();
    }


    public static void main(String[] args) {
        numericChristmasTree2(100);
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            sum += 2*i -1;
        }
        System.out.println(sum);
    }
}
