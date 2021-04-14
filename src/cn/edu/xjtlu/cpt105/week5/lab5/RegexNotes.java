package cn.edu.xjtlu.cpt105.week5.lab5;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexNotes {

    public static void main(String[] args) {
        String input = "ISBN 978-0-273-72131-4";
        // \\w = a-z A-Z 0-9
        // \\d = digit 0-9
        // \\s = space
        String regex = "ISBN\\s";
        Pattern isbnPattern = Pattern.compile(regex);
        Matcher matcher = isbnPattern.matcher(input);

        boolean result = matcher.matches();
        System.out.println(result);
    }
}
