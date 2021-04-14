package cn.edu.xjtlu.cpt105.lab4;

public class ShowSquares {
    public static void main(String[] args) {
        //showSquares();
        showCube(20,2,-3);

    }

    /**
     * Print all squares of number from 1 to 10
     */
    static void showSquares() {
        for (int i = 1; i <= 10; i++)
            System.out.printf("%d\t%d\n", i, i * i);
    }

    /**
     * Print all cubes from 1 to 10 of step 1
     */
    static void showCube() {
        showCube(1,10,1);
    }

    /**
     * Print all cubes of number from start to end of step step
     * @param start
     * @param end
     * @param step
     */
    static void showCube(int start, int end, int step) {
        System.out.println("CSE105 Square Program");
        System.out.println("_____________________");
        if (start<=end)
            for (int i = start; i <= end; i+=step) {
                System.out.printf("Number : %d\tSquare : %d\tCube : %d\n",i,i*i,i*i*i);
                System.out.println("     ------");
            }
        else
            for (int i = start; i >= end; i+=step) {
                System.out.printf("Number : %d\tSquare : %d\tCube : %d\n",i,i*i,i*i*i);
                System.out.println("     ------");
            }
        System.out.println("Created by Hsun Pu ID: 2032831");
    }
}
