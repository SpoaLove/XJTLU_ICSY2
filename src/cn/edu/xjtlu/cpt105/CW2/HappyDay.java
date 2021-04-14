package cn.edu.xjtlu.cpt105.CW2;/*
 * CW2.2 Lab-Group-01
 */

public class HappyDay {
    
	// CW2.2 Lab-Group-01 Question 5
    // 1. Given a string input that consists of lowercase letters,
    //    or other characters (such as whitespace, numbers, punctuations),
    // 2. add " day" for every occurrences of "happy" to the input string and return it.
    // 3. Do not add " day" if "happy" is part of another word,
    // 4. such as "unhappy" or "happygolucky".
    // 5. But add " day" if "happy" is immediately followed by non-letter characters.
	// happy, -> happy day,
    // prefix = happy + ".,/\";
    // happy** happy*

    public static String happyDay(String input) {
        String[] splitedInput = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < splitedInput.length; i++) {
            String curr= splitedInput[i];
            if (curr.equals("happy"))
                splitedInput[i] =  "happy day";
            else if (curr.startsWith("happy")
                  && curr.length() >= 6
                  && !Character.isAlphabetic(curr.charAt(5)))
                splitedInput[i] = curr.replace("happy", "happy day");
            result.append(splitedInput[i]).append(" ");
        }
        return result.toString();
    }
    
    // Test Client
    public static void main(String[] args) {
        
        System.out.println(happyDay("don't worry, be happy"));
        // don't worry, be happy day
        
        System.out.println(happyDay("wish you all happy, always!"));
        // wish you all happy day, always!
        
        System.out.println(happyDay("she is unhappy with the result"));
        // she is unhappy with the result        

        System.out.println(happyDay("happy, happy. nothappy!"));
		// Add your own testcases below !
		

		
    }
    
}
