package cn.edu.xjtlu.cpt105.week1.java;

/**
 * Course Works for week 1
 *
 * @author Hsun.Pu20
 */
public class Courseworks1 {

    /**
     * CW1 1.1 Simple Math<br/>
     * <br/>
     * Print computation results as in the test case below:<br/>
     * <br/>
     * <pre>
     * Output:
     * num1 + num2 = 13
     * num1 / num2 = 3
     * real1 + real2 = 13.0
     * real1 / real2 = 3.3333333333333335
     * <pre/>
     *
     * @author Hsun.Pu20
     */
    public static void simpleMath() {
        int num1 = 10, num2 = 3;
        double real1 = 10.0 , real2 = 3.0;
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("real1 + real2 = " + (real1 + real2));
        System.out.println("real1 / real2 = " + (real1 / real2));
    }

    /**
     * CW1 1.2 ASCII Art<br/>
     * <br/>
     * Prints characters depicting a Christmas tree as in the test case below.<br/>
     * <br/>
     * <pre>
     *    *
     *   / \
     *  /   \
     * /     \
     * --| |--
     * -------
     * <pre/>
     *
     * @author Hsun.Pu20
     */
    public static void charXmasTree() {
        System.out.println("   *");
        System.out.println("  / \\");
        System.out.println(" /   \\");
        System.out.println("/     \\");
        System.out.println("--| |--");
        System.out.println("-------");
    }

}
