package cn.edu.xjtlu.cpt105.week6.java;

/**
 * Exercise Week 6
 * @author Hsun.Pu20
 */

public class ColorHSB {

    private int hue;
    private int saturation;
    private int brightness;


    /**
     * Exercise 6.1
     * Creates a color with hue h, saturation s, and brightness b.
     * @param h the hue of the color.
     * @param s the saturation of the color.
     * @param b the brightness of the color.
     */
    public ColorHSB(int h, int s, int b) {
        this.hue        = h;
        this.saturation = s;
        this.brightness = b;
    }

    /**
     * Exercise 6.2
     * @return a string representation of this color, using the format (h, s, b).
     */
    @Override
    public String toString() {
        return "(" + this.hue + ", " + this.saturation + ", " + this.brightness + ")";
    }

    /**
     * Exercise 6.3
     * A color is in grayscale if either the saturation or brightness is 0%.
     * @return if the color is in grayscale.
     */
    public boolean isGrayscale() {
        return saturation == 0 || brightness == 0;
    }


    /**
     * Exercise 6.4
     * The squared distance between two colors is defined as:
     * \min((h_1 - h_2)^2, (360 - |h_1-h_2|)^2) + (s_1-s_2)^2 + (b_1-b_2)^2
     * @param that the other color to compare.
     * @return the squared distance between two colors.
     */
    public int squareDist(ColorHSB that) {
        return (int) (Math.min(Math.pow((hue - that.hue),2), Math.pow((360-Math.abs(hue-that.hue)),2))
                        + Math.pow((saturation-that.saturation),2)
                        + Math.pow((brightness- that.brightness),2));
    }

    // Tests:
    public static void main(String[] args) {
        ColorHSB green = new ColorHSB(100, 100, 50);
         ColorHSB orange = new ColorHSB(25, 100, 100);
         ColorHSB gray = new ColorHSB(0, 0, 50);

        System.out.println(green);

         System.out.println(orange.isGrayscale());
         System.out.println(gray.isGrayscale());

         int distGreenOrange = green.squareDist(orange);
         System.out.println(distGreenOrange);
         System.out.println(gray.squareDist(orange));
    }

}