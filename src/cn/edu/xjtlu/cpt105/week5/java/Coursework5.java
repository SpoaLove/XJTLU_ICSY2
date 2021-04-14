package cn.edu.xjtlu.cpt105.week5.java;

/**
 * Course Works for week 5
 *
 * @author Hsun.Pu20
 */
public class Coursework5 {

  /**
   * CW1 5.1 Sandwich Fillings<br/>
   * <br/>
   * This method returns the string that is between the first and last appearance of "bread"
   * in the given input string, or returns the string "none" if there are not two pieces of bread.
   * <br/>
   * Test cases :<br/>
   * <br/>
   * <pre>
   * sandwichFillings("breadtunabread")      → "tuna"
   * sandwichFillings("chipsbreadtunasalad") → "none"
   * </pre>
   *
   * @param input the input String to be processed.
   * @return the substring between first and last bread if exists else "none".
   * @author Hsun.Pu20
   */
  static String sandwichFillings(String input) {
        // find first and last bread
        int firstBread = input.indexOf("bread");
        int lastBread  = input.lastIndexOf("bread");

        if (firstBread == -1 || firstBread == lastBread) {
            // if no bread or same bread return none
            return "none";
        } else {
            // get substring of everything in between the two breads and return
            return input.substring(firstBread+5,lastBread);
        }
    }

  /**
   * CW1 5.2 Calculate Net Income <br/>
   * <br/>
   * This method takes an input string and computes the income minus the expenses. The income
   * components are indicated by numbers; while the expenses from your spending are numbers starting
   * with a minus sign '-'.<br/>
   * <br/>
   * Test cases :<br/>
   * <br/>
   * <pre>
   * calcNetIncome("salary 15000yuan bonus2000 rent -1000Y")           → 16000
   * calcNetIncome("25000 gross income, -200 water, electricity:-300") → 24500
   * </pre>
   *
   * @param input the input String.
   * @return the sum of all integer substring within the input string.
   * @author Hsun.Pu20
   */
  public static int calcNetIncome(String input) {
        boolean inNumber, inNegative = false;
        int sum = 0;
        for (int i = 0, temp = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            inNumber = Character.isDigit(currentChar);

            if (inNumber) {
                temp = (temp*10) + Integer.parseInt(String.valueOf(currentChar));
                if (i-1>=0 && input.charAt(i-1) == '-') {
                    inNegative = true;
                }
            } else {
                if (inNegative) {
                    temp *= -1;
                }
                inNegative = false;
                sum += temp;
                temp = 0;
            }

            if (i == input.length()-1) {
                if (inNegative) {
                    temp *= -1;
                }
                sum += temp;
            }
        }
        return sum;
    }

}

