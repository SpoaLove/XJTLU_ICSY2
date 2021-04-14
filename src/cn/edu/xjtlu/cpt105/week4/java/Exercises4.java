package cn.edu.xjtlu.cpt105.week4.java;

/**
 * Exercises for week 4
 *
 * @author Hsun.Pu20
 */
public class Exercises4 {

    /**
     * Exercise 4.1 Reverse Integers:<br/>
     * <br/>
     * Reverses the values within the input array.<br/>
     * The values in-place is swapped and a new array is not created.<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * reverseInts({1, 2, 3, 4, 5}) → [5, 4, 3, 2, 1]
     * reverseInts({1, 2, 3, 4})    → [4, 3, 2, 1]
     * </pre>
     *
     * @param nums the integer array to be reversed.
     */
    public static void reverseInts(int[] nums) {
        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        }
    }

    /**
     * Exercise 4.2 Copy Even Indices<br/>
     * <br/>
     * Copies elements at even indices to a new array.<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * copyEven({1, 2, 3})    → [1, 3]
     * copyEven({1, 2, 3, 4}) → [1, 3]
     * </pre>
     *
     * @param nums the input integer array.
     * @return the new array with elements at even indicies.
     */
    public static int[] copyEven(int[] nums) {
        int[] output = new int[(nums.length+1)>>1];
        for (int i = 0, j = 0; i < nums.length; i+=2, j++) {
            output[j] = nums[i];
        }
        return output;
    }

    public static void main(String[] args) {
        int[] test = new int[]{3, 8, 1, 2, 3, 8, 5, 7, 1, 2, 6};
        printArr(test);
        printArr(copyEven(test));
    }

    /**
     * Exercise 4.3 A Diamond is FORever<br/>
     * <br/>
     * Takes an odd integer argument n and prints an n-by-n pattern
     * like the test cases below, with an asterisk (*) for each element
     * which makes up a diamond, and a dot (.) for each entry that is not,
     * and one space between each * or .<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * diamond(5):
     * . . * . .
     * . * * * .
     * * * * * *
     * . * * * .
     * . . * . .
     *
     * diamond(9):
     * . . . . * . . . .
     * . . . * * * . . .
     * . . * * * * * . .
     * . * * * * * * * .
     * * * * * * * * * *
     * . * * * * * * * .
     * . . * * * * * . .
     * . . . * * * . . .
     * . . . . * . . . .
     *
     * </pre>
     * @param n the height of the diamond.
     */
    public static void diamond(int n) {
        // flip if negative
        if (n < 0) {
            n*=-1;
        }
        // increment if odd
        if (n % 2 == 0) {
            n++;
        }
        /* top    */
        for (int i = 1; i <= n/2; i++) {
            buildDiamondRow(n,i);
        }
        /* center */
        System.out.println("* ".repeat(n));
        /* bottom */
        for (int i = n/2; i >= 1; i--) {
            buildDiamondRow(n,i);
        }

    }

    /**
     * Helper function to build half a diamond
     *
     * @param n the diamond height.
     * @param i the diamond asterisk (*) count.
     */
    private static void buildDiamondRow(int n, int i) {
        /*
         * print '. ' in front  n/2 + 1 - i times
         * print '* ' in center 2*i - 1     times
         * print '. ' in back   n/2 + 1 - i times
         */
        System.out.println(". ".repeat( n / 2 + 1 - i )
                   .concat("* ".repeat( 2 * i - 1 ))
                   .concat(". ".repeat( n / 2 + 1 - i ))
        );
    }

    /**
     * Exercise 4.4 Arithmetic Series<br/>
     * <br/>
     * On input an integer n >= 0, outputs an array with the pattern
     * <code>[1, 1, 2, 1, 2, 3, ....., 1, 2, 3, ..., n].</code><br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * arithSeries(2) → [1, 1, 2]
     * arithSeries(3) → [1, 1, 2, 1, 2, 3]
     * arithSeries(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
     * </pre>
     *
     * @param n the input in series.
     * @return the array of integer following all sequences of the arithmetic progression a_{n+1}=a_n+1
     */
    public static int[] arithSeries(int n) {
        if (n<0) {
            return null;
        }
        int[] outputSeries = new int[(n*(n+1))/2];
        for (int i = 0, k = 0; k < outputSeries.length; i++) {
            for (int j = 1; j < i; j++, k++) {
                outputSeries[k] = j;
            }
        }
        return outputSeries;
    }

    static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1]+"]");
    }

    static void testArithSeries(int n) {
        System.out.printf("arithSeries(%d) → ",n);
        printArr(arithSeries(n));
    }

    static void testArithSeries() {
        for (int i = 1; i <= 5; i++) {
            testArithSeries(i);
        }
    }



}
