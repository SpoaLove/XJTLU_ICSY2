/*
 * CW2.2 Lab-Group-02
 */
package cn.edu.xjtlu.cpt105.CW2;
public class CountryRoads {
    
    // CW2.2 Lab-Group-02 Question 5
    // Given a string input that consists of lowercase letters,
    // or other characters (such as whitespace, numbers, punctuations),
    // add " roads" for every occurrences of "country" to the input string and return it.
    // Do not add " roads" if "country" is part of another word,
    // such as "backcountry" or "countryfolk".
    // But add " roads" if "country" is preceded or followed by non-letter characters.
	
    public static String countryRoads(String input) {
//        StringBuilder results = new StringBuilder();
//        input = " " + input + " ";
//
//        if (input.startsWith(" country") && input.length() > 8 && !Character.isAlphabetic(input.charAt(8))) {
//            results.append(" country roads");
//            input = input.substring(8);
//        }
//
//        while(input.contains("country")) {
//            int nextCountry = input.indexOf("country");
//            if ((nextCountry != 0 && !Character.isAlphabetic(input.charAt(nextCountry-1)))
//              ||(nextCountry + 7 < input.length() && !Character.isAlphabetic(input.charAt(nextCountry+1)))
//            ) {
//                results.append(input, 0, nextCountry+7).append(" roads");
//                input = input.substring(nextCountry+7);
//            }
//        }
//
////
////
////        String[] words = input.split(" ");
//        return (results.toString()+input).substring(1,(results.toString()+input).length()-1);
//
//        if (!input.contains("country")) return input;
//        if (input.startsWith("country ")
//         ||(input.startsWith("country") && input.length() > 7 && !Character.isAlphabetic(input.charAt(7))))
//            input.replaceFirst("country", "country roads");
//        if (input.endsWith(" country")
//         ||(input.endsWith("country") && input.length() > 7 && !Character.isAlphabetic(input.charAt(input.length()-8))))
//            input = input.substring(0, input.length()-8) + "country roads";
//
//        String[] splitedInput = input.split(" ");
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < splitedInput.length; i++) {
//            String curr= splitedInput[i];
//
//            if (curr.matches("[^a-z]country[^a-z]"))
//                continue;
//            if (curr.equals("country"))
//                splitedInput[i] = "country roads";
//            else if (((curr.startsWith("country") && !Character.isAlphabetic(curr.charAt(7)))
//                    || (curr.endsWith("country") && !Character.isAlphabetic(curr.charAt(curr.lastIndexOf("country")-1)))
//                    || (curr.contains("country") && curr.length() >= 9
//                        && !Character.isAlphabetic(curr.indexOf("country")-1)
//                        && !Character.isAlphabetic(curr.indexOf("country")+7)))
//
//
//            ) splitedInput[i] = curr.replace("country", "country roads");
//
//
//            result.append(splitedInput[i]).append(" ");
//        }
//        return result.toString();

        input = " " + input + " ";
        String tmp;
        for (int i = 0; i < input.length()-8; i++) {
            if (input.substring(i, i+9).matches("[^a-z]country[^a-z]")){
                tmp = input.substring(0,i+1)+"country roads";
                input = tmp + input.substring(i+8, input.length());
            }
        }
        input = input.substring(1, input.length()-1);
        return input;

    }
    
    // Test Client
    public static void main(String[] args) {
//        String testIn = "no country in the wilderness country";
//        int nextCountry = testIn.indexOf("country");
//        System.out.println(nextCountry);
//        System.out.println(testIn.charAt(nextCountry-1));
//
        System.out.println(countryRoads("acountryb"));

        //System.out.println(".country.".charAt(".country.".indexOf("country")+7));
        System.out.println(countryRoads("no country in the wilderness"));
//         no country roads in the wilderness
//
        System.out.println(countryRoads("country, take me home..."));
//         country roads, take me home...

        System.out.println(countryRoads("talk to the countryfolk instead!")); // wrong
        // talk to the countryfolk instead!

        System.out.println(countryRoads("country, .county. countryfolk! fuckcountry!"));

        // add your own test cases !
		
		
		
        
    }
}
