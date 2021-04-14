package cn.edu.xjtlu.cpt105.week3.java;
import java.util.Scanner;

/**
 * Exercises for week 3
 *
 * @author Hsun.Pu20
 */
public class Exercises3 {

    /**
     * Exercise 3.1 Black Jack<br/>
     * <br/>
     * On input 2 integer values greater than 0, prints whichever value is nearest to 21 without going bust.
     * Print -1 if both values bust.<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * Input:
     * 20
     * 19
     * Output:
     * 20
     *
     * Input:
     * 19
     * 22
     * Output:
     * 19
     *
     * Input:
     * 22
     * 23
     * Output:
     * -1
     * </pre>
     *
     * @author Hsun.Pu20
     */
    public static void blackJack() {
        int answer;

        Scanner scanner = new Scanner(System.in);

        int firstNumber  = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        boolean firstIsValid  = firstNumber  > 0 && firstNumber  <= 21;
        boolean secondIsValid = secondNumber > 0 && secondNumber <= 21;

        if (firstIsValid && !secondIsValid) {
            answer = firstNumber;
        } else if (secondIsValid && !firstIsValid) {
            answer = secondNumber;
        } else if (firstIsValid) {
            answer = Math.max(firstNumber,secondNumber);
        } else {
            answer = -1;
        }

        System.out.println(answer);
    }

    /**
     * Exercise 3.2 Pandemic Spread<br/>
     * <br/>
     * Simulates how fast a pandemic spread with the following input:<br/>
     * - init : the initial number of infected persons on day 1<br/>
     * - numInfect : the average number of healthy people that one infected person newly infects per day<br/>
     * - population : the total number of people in the area<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * Input:
     * 1
     * 2
     * 10
     * Output:
     * 4
     *
     * Input:
     * 5
     * 3
     * 1000
     * Output:
     * 5
     * </pre>
     *
     * @author Hsun.Pu20
     */
    public static void pandemicSpread(){
        Scanner scanner = new Scanner(System.in);

        int init, numInfect, population;
        init       = scanner.nextInt();
        numInfect  = scanner.nextInt();
        population = scanner.nextInt();

        int infected = init, days=1;

        while (population > infected) {
            infected += infected*numInfect;
            days++;
        }

        System.out.println(days);
    }


}
