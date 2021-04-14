package cn.edu.xjtlu.cpt105.week3.java;
import java.util.Scanner;

/**
 * Course Works for week 3
 *
 * @author Hsun.Pu20
 */
public class Courseworks3 {

    /**
     * CW1 3.1 Right Triangle<br/>
     * <br/>
     * Print output true if and only if the following two conditions are true  :<br/>
     * (1) All three integers are positive (greater than zero).<br/>
     * (2) You can find two integers where the sum of the squares
     * of those two integers is equal to the square of the third integer.<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * Input:
     * 5
     * 12
     * 13
     * Output:
     * true
     *
     * Input:
     * 5
     * 4
     * 3
     * Output:
     * true
     *
     * Input:
     * -3
     * -4
     * 5
     * Output:
     * false
     * </pre>
     *
     * @author Hsun.Pu20
     */
    public static void rightTriangle() {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isPositive = a>0 && b>0 && c>0;
        boolean isRightTriangle = (a * a + b * b == c * c
                                || a * a + c * c == b * b
                                || b * b + c * c == a * a);

        System.out.println(isPositive && isRightTriangle);
    }

    /**
     * CW1 3.2 Hailstone Sequence<br/>
     * <br/>
     * On input a positive integer n, prints the length of the Hailstone sequence starting at n.<br/>
     * <br/>
     * The Hailstone sequence is computed as follows:<br/>
     * - Start with an integer number n<br/>
     * - If n is even, the next number in the sequence is n/2<br/>
     * - If n is odd, the next number is 3n+1<br/>
     * - Continue until it reaches 1<br/>
     * <br/>
     * For example,<br/>
     * for n = 3,  the sequence is 3, 10, 5, 16, 8, 4, 2, 1<br/>
     * and for n = 12,  the sequence is 12, 6, 3, 10, 5, 16, 8, 4, 2, 1<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * Input:
     * 3
     * Output:
     * 8
     *
     * Input:
     * 12
     * Output:
     * 10
     * <pre/>
     *
     * @author Hsun.Pu20
     */
    public static void hailStone() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int index=1;

        while (n!=1) {
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
            index++;
        }

        System.out.println(index);
    }

}
