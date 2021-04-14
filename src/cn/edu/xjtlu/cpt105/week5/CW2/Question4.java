package cn.edu.xjtlu.cpt105.week5.CW2;

/**
 * CW2.1 Question 4wo
 */
public class Question4 {

    public static int countSeven(long num) {
        int sevenCounts = 0;

        while (num >= 7){
            if (num % 10 == 7) sevenCounts++;
            num /= 10;
        }

        return sevenCounts;
    }

    public static int sumSeven(long num) {
        int sum = 0;

        while (num >= 7){
            if (num % 10 == 7) sum+=7;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        testCountSeven(1177);
        testCountSeven(722777227);
        testCountSeven(7777773);
    }

    static void testCountSeven(long num){
        System.out.println(sumSeven(num));
    }

}
