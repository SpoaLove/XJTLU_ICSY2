/*
 * CW2.2 Lab-Group-05
 */

public class AllAppear {
    
    // CW2.2 Lab-Group-05 Question 5
    // Given two non-empty strings source and target consisting of
    // lowercase letters, numbers, and other characters,
    // return true if and only if all characters in source also appear in target,
    // while considering the number of times the character appears.
    // That is, return true for source = "aab" and target = "dabac",
    // because two "a"s and one "b" of source appear in target as well.
    // However, return false for source = "aab" and target = "dabc",
    // because only one of the two "a"s in source appears in target.
    // You must use String methods in lecture notes.
    // You must NOT use StringBuilder or Regular Expression methods.
    
    public static boolean allAppear(String source, String target) {
        int[] frequency = new int[256];
        for (int i = 0; i < source.length(); i++)
            frequency[source.charAt(i)]--;
        for (int i = 0; i < target.length(); i++)
            frequency[target.charAt(i)]++;
        for (int i = 'a'; i <= 'z'; i++)
            if (frequency[i] < 0) return false;
        return true;
    }
    
    // Test Client
    public static void main(String[] args) {
        System.out.println(allAppear("aab", "dabac"));  // true
        System.out.println(allAppear("aab", "dabc"));   // false
        
        
        // add your own test cases :
		
		
		
        
        
    }
}
