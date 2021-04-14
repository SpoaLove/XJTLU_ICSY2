package cn.edu.xjtlu.cpt105.week5.lab5;

import java.util.Scanner;

public class PersonDetails {

    static Scanner scanner = new Scanner(System.in);

    static String[] inputNames() {
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Input name number " + i);
            names[i] = scanner.nextLine();
        }
        return names;
    }

    static void displayNames(String[] names) {
        System.out.println("Output is:\n  ***");
        for (String name : names) {
            System.out.println(name + "\n  ***");
        }
    }

    static void searchName(String[] names) {
        System.out.println("Please input a name for search: ");
        String targetName = scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (name.equalsIgnoreCase(targetName)) {
                System.out.println("Find your name in the list at position " + i);
                return;
            }
        }
        System.out.println("Sorry your name is not in the list");
    }

    static String getLongestName(String[] names) {
        int longestNameIndex  = 0;
        for (int i = 1; i < names.length; i++)
            if (names[i].length() > names[longestNameIndex].length())
                longestNameIndex = i;
        return names[longestNameIndex];
    }

    static void testPersonDetails() {
        String[] names = inputNames();
        displayNames(names);
        searchName(names);
        System.out.println("The longest name is: " + getLongestName(names));
    }

    public static void main(String[] args) {
        testPersonDetails();
    }
}
