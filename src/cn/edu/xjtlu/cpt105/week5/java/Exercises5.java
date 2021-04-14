package cn.edu.xjtlu.cpt105.week5.java;

public class Exercises5 {

    static boolean warAndPeace(String text) {

        int warCount = 0, peaceCount = 0;
        for (int i = 0; i <= text.length()-3; i++)
            if (text.substring(i,i+3).equals("war"))
                warCount++;

        for (int i = 0; i <= text.length()-5; i++)
            if (text.substring(i,i+5).equals("peace"))
                peaceCount++;

        // return true if count matches
        return warCount == peaceCount;
    }


    static boolean warAndPeace2(String text) {
        text += " ";
        int warCount   = text.split("war").length;
        int peaceCount = text.split("peace").length;
        return warCount == peaceCount;
    }



    public static boolean isValidID(String id) {
        if (id.length() < 5) {
            return false;
        }
        char[] idChars = id.toUpperCase().toCharArray();
        int sum = 0;
        for (int i = 0; i < id.length()-1; i++) {
            if (Character.isDigit(id.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(id.charAt(i)));
            }
        }
        char lastId = idChars[idChars.length - 1];
        char validateId = (sum % 11 == 10 ? 'X' : (char) (sum+'0'));
        return lastId == validateId;
    }

    public static boolean isValidID2(String id) {
        if (id.length() < 5) {
            return false;
        }

        char[] idChars = id.toUpperCase().toCharArray();

        int sum = 0;

        for (int i = 0; i < id.length()-1; i++) {
            if (Character.isDigit(id.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(id.charAt(i)));
            }
        }

        char lastChar = idChars[idChars.length - 1];
        char checksum = (sum % 11 == 10 ? 'X' : (char) (sum+'0'));
        return lastChar == checksum;
    }




    public static void main(String[] args) {

        System.out.println((char) (0 + 48));
        System.out.println((char) (9 + 48));

        System.out.println(isValidID("01236"));
        System.out.println(isValidID("THMBB7092WD114221"));
        System.out.println(isValidID("A001-606X-17X"));



    }
}
