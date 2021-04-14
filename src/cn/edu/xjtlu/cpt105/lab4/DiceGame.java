package cn.edu.xjtlu.cpt105.lab4;

public class DiceGame {

    public static void main(String[] args) {
        int[] dice = rollDice();
        calcHighest(dice);
        calLowest(dice);
        calAvg(dice);

    }

    private static int random(int lowerBound, int upperBound) {
        return (int) ( Math.random() * (upperBound+1-lowerBound) + lowerBound );
    }

    /**
     * Roll 6 randomly generated dice
     * @return integer array with 6 random number between 1 to 12
     */
    private static int[] rollDice() {
        int[] dice = new int[6]; // create a new int array of size 6

        for (int i = 0; i < 6; i++) {
            // assign a random num between 1 to 12 and round to int
            dice[i] = (int) (Math.random()*12) +1;
            System.out.println("Result is "+dice[i]);
        }
        System.out.println(" ***");
        return dice; // return generated array
    }

    /**
     * Calculate and print the highest value and it's index
     * in input array of integer
     * @param dice the input array of dice values
     */
    private static void calcHighest(int[] dice) {
        // assume max is at index 0
        int maxIndex = 0, max = dice[0];

        for (int i = 1; i < dice.length; i++) {
            // if the next value is greater than max
            // then update the max value and index
            if (dice[i] > max) {
                max = dice[i];
                maxIndex = i;
            }
        }

        System.out.println("Highest Value is : " + max);
        System.out.println("It was found at dice index: " + maxIndex);
        System.out.println(" ***");
    }

    /**
     * Calculate and print the lowest value and it's index
     * in input array of integer
     * @param dice the input array of dice values
     */
    private static void calLowest(int[] dice) {
        // assume min is at index 0
        int minIndex = 0, min = dice[0];

        for (int i = 1; i < dice.length; i++) {
            // if the next value is smaller than min
            // then update the min value and index
            if (dice[i] < min) {
                min = dice[i];
                minIndex = i;
            }
        }

        System.out.println("Lowest Value is : " + min);
        System.out.println("It was found at dice index: " + minIndex);
        System.out.println(" ***");
    }

    /**
     * Calculate and print the sum and average value of
     * an input array of integer
     * @param dice the input array of dice values
     */
    private static void calAvg(int[] dice) {
        int sum = 0;
        for (int i = 0; i < dice.length; i++) {
            sum += dice[i]; // sum all the values in the array
        }
        double average = (double) sum / (double) dice.length;
        System.out.println("Sum total of all dice is : "+sum);
        System.out.println("Average value is : "+average );
    }

}
