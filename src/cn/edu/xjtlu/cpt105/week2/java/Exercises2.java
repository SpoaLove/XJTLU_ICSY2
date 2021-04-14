package cn.edu.xjtlu.cpt105.week2.java;
import java.util.Scanner;

/**
 * Exercises for week 2
 *
 * @author Hsun.Pu20
 */
public class Exercises2 {

    /**
     * Exercise 2.1 What day is it?<br/>
     * <br/>
     * Takes a date as input and prints the day of the week that date falls on.<br/>
     * <br/>
     * Your program should take three integers: y (year), m (month), and d (day).<br/>
     * For m use 1 for January, 2 for February, and so on.<br/>
     * For output print 0 for Sunday, 1 for Monday, 2 for Tuesday, and so on.<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * Input:
     * 2018
     * 12
     * 24
     * Output:
     * It's day 1 !
     * </pre>
     *
     * @author Hsun.Pu20
     */
    public static void dateToDay() {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int a = y - (14 - m) / 12;
        int b = a + a / 4 - a / 100 + a / 400;
        int c = m + 12 * ((14 - m) / 12) - 2;
        int day = (d + b + (31 * c) / 12) % 7;
        System.out.println("It's day " + day+ " !");
    }

    /**
     * Exercise 2.2 Polar Coordinates<br/>
     * <br/>
     * take two real input numbers x and y, and print the Polar coordinates r and θ according to the formulas below.<br/>
     * r = \sqrt{x^2 + y^2}<br/>
     * \theta = \arctan ( y / x )<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * Input:
     * 3.0
     * 4.0
     * Output:
     * r = 5.0
     * theta = 0.9272952180016122
     *
     *
     * Input:
     * 1.0
     * 1.0
     * Output:
     * r = 1.4142135623730951
     * theta = 0.7853981633974483
     * </pre>
     *
     * @author Hsun.Pu20
     */
    public static void polarCoordinates() {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y =  scanner.nextDouble();
        double r = Math.hypot(x,y);
        double theta = Math.atan2(y,x);
        System.out.println("r = "+r+"\ntheta = "+theta);
    }
}
