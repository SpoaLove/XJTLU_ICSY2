package cn.edu.xjtlu.cpt105.lab4;

public class RandomIntegers {

    public static void main(String[] args) {
        int[] a = getRandIntegers();
        printRandom(a);
    }

    /**
     * Generate and return a random integer
     * between 10 and 20 using Math.random()
     * @return a random integer between 10 and 20
     */
    public static int getOneRandInteger() {
        return (int) (Math.random() * 10) + 10;
    }

    /**
     * Checks if integer r is in the array a
     * @param a input array
     * @param r input integer
     * @return true if r is in the array a, false otherwise
     */
    public static boolean isNumInArray(int[] a, int r) {
        boolean itemExists = false;
        for (int item : a) if (item == r) {
            itemExists = true;
            break;
        }
        return itemExists;
    }

    /**
     * Generate 8 different random integers
     * using the methods 'getOneRandInteger()’
     * and ‘isNumInArray(int[] a, int r)’.
     * @return an integer array of 8 unique random numbers
     */
    public static int[] getRandIntegers() {
        int[] randIntegers = new int[8];
        for (int i = 0; i < randIntegers.length; i++) {
            int randomNum = getOneRandInteger();
            while (isNumInArray(randIntegers,randomNum))
                randomNum = getOneRandInteger();
            randIntegers[i] = randomNum;
        }
        return randIntegers;
    }

    /**
     * Prints all the random integer
     * @param a the array to be print
     */
    public static void printRandom(int[] a) {
        System.out.println("The eight random integers are:");
        for (int num:a) System.out.println(num);
    }


}
