package cn.edu.xjtlu.cpt105.week5.lab5;

import java.util.Scanner;

public class DuplicateWords {

    static Scanner scanner = new Scanner(System.in);

    static String inputSentence() {
        System.out.println("Input a sentence with duplicate words:");
        return scanner.nextLine();
    }

    static void getDuplicateWords(String str) {
        System.out.println("The duplicate words are:");
        String[] sentence = str.split(" ");
        for (int i = 0; i < sentence.length; i++) {
            String currentWord = sentence[i];
            for (int j = i+1; j < sentence.length; j++) {
                if (currentWord.equals(sentence[j])) {
                    System.out.println(currentWord);
                    break;
                }
            }
        }

    }

    static void getDuplicateWords2(String str) {
        System.out.println("The duplicate words are:");
        String[] sentence = str.split(" ");
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == null) continue;
            String currentWord = sentence[i];
            boolean found = false;
            for (int j = i+1; j < sentence.length; j++)
                if (currentWord.equals(sentence[j])) {
                    if (found)
                        sentence[j] = null;
                    else {
                        System.out.println(currentWord);
                        found = true;
                    }
                }
        }
    }


    public static void main(String[] args) {
        //String sentence = inputSentence();
        // hello boys and girls most boys and girls like java do you also like java programming?
        getDuplicateWords("hello erick hello andrew hello erick");

        getDuplicateWords2("hello erick hello andrew hello erick");
    }

}
