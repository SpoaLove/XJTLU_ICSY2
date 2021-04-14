package cn.edu.xjtlu.cpt105.week5.lab5;


public class ValidateTester {

    static void test() {
        // expected answer:
        boolean[] ans = {true, false, false};

        // inputs:
        String[] inputs = new String[] {
                "ISBN 978-0-273-72131-4",
                "ISBN 978-0-273-7d131-4",
                "ISBN 978-0-273-72131-e"
        };

        // test validate:
        for (int i = 0, inputsLength = inputs.length; i < inputsLength; i++) {
            System.out.println("Test case " + i + ".");
            System.out.println("Your output: " + validateISBNString(inputs[i]));
            System.out.println("Expected: " + ans[i]);
            System.out.println();
        }
    }

    private static boolean validateISBNString(String input) {
        if (input.length() != 22 || !input.startsWith("ISBN ")) return false;
        input = input.substring(5);
        for (String block : input.split("-"))
            for (char c : block.toCharArray())
                if (!Character.isDigit(c)) return false;
        return true;
    }


    public static void main(String[] args) {
        test();
    }

}
