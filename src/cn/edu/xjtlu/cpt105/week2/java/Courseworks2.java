package cn.edu.xjtlu.cpt105.week2.java;
import java.util.Scanner;

/**
 * Course Works for week 2
 *
 * @author Hsun.Pu20
 */
public class Courseworks2 {

    /**
     * CW1 2.1 CMYK to RGB<br/>
     * <br/>
     * converts from CMYK format to RGB format
     * using the following formulas:<br/>
     * white = 1 − black<br/>
     * red = 255 × white × (1 − cyan)<br/>
     * green = 255 × white × (1 − magenta)<br/>
     * blue = 255 × white × (1 − yellow)<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * Input:
     * 0.0
     * 0.0
     * 1.0
     * 0.0
     * Output:
     * red = 255
     * green = 255
     * blue = 0
     *
     * Input:
     * 0.0
     * 1.0
     * 0.75
     * 0.50
     * Output:
     * red = 128
     * green = 0
     * blue = 32
     * </pre>
     *
     * @author Hsun.Pu20
     */
    public static void cmykToRgb() {
        Scanner scanner = new Scanner(System.in);
        double cyan    = scanner.nextDouble();
        double magenta =  scanner.nextDouble();
        double yellow  = scanner.nextDouble();
        double black   =  scanner.nextDouble();
        double white   = 1 - black;
        long red   = Math.round(255*white*(1-cyan));
        long green = Math.round(255*white*(1-magenta));
        long blue  = Math.round(255*white*(1-yellow));
        System.out.println("red = "+red+"\ngreen = "+green+"\nblue = "+blue);
    }

    /**
     * CW1 2.2 Great Circle Distance<br/>
     * <br/>
     * takes four double input numbers x1, y1, x2, y2,
     * which are the latitude and longitude in degrees of
     * two points on the surface of the Earth;<br/>
     * The great-circle distance is the length of
     * the shortest path between two points
     * (x1,y1) and (x2,y2) on the surface of a sphere.<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * Input:
     * 80.0
     * 25.0
     * 155.0
     * 102.5
     * Output:
     * 7509.440708014122 kilometres
     *
     * Input:
     * 10.55
     * 39.33
     * 21.47
     * -7.88
     * Output:
     * 5169.256612492542 kilometres
     * </pre>
     *
     * @author Hsun.Pu20
     */
    public static void greatCircleDistance() {
        Scanner scanner = new Scanner(System.in);
        // take input numbers
        double x1 = Math.toRadians(scanner.nextDouble());
        double y1 = Math.toRadians(scanner.nextDouble());
        double x2 = Math.toRadians(scanner.nextDouble());
        double y2 = Math.toRadians(scanner.nextDouble());
        // radius of Earth in km
        final double r = 6371.0;

        double xDiff = (x2 - x1) / 2.0;
        double a = Math.pow(Math.sin(xDiff),2);

        double b = Math.cos(x1)*Math.cos(x2);

        double yDiff = (y2 - y1) / 2.0;
        double c = Math.pow(Math.sin(yDiff),2);

        double dist = 2.0*r*Math.asin(Math.sqrt(a+b*c));
        System.out.println(dist + " kilometres");
    }

}
