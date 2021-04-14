package cn.edu.xjtlu.cpt105.week6;

public class Notes {
    public static void printBiNumbers(int n) {
        if (n == 1) {
            System.out.println(Integer.toBinaryString(11));
        } else {
            System.out.println(Integer.toBinaryString(biNumbers(n)));
            printBiNumbers(n-1);
        }
    }

    public static int biNumbers(int n) {
        if (n == 1) {
            return 11;
        } else {
            int prev = biNumbers(n-1);
            do {
                prev++;
            } while (Integer.bitCount(prev) <= (Integer.toBinaryString(prev).length() >> 1));
            return prev;
        }
    }

    public static void main(String[] args) {
        printBiNumbers(20);
    }
}
