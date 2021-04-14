package cn.edu.xjtlu.cpt105.week5;

public class Notes {


    public static boolean isBetweenAT(char c) {
        // returns if c is in A ~ T which means 'T' - c is in 'T'-'T' to 'T' - 'A'
        return 'T' - c >= 0 && 'T' - c <= 'T' - 'A';
    }

    public static boolean blockIsDigit(String block) {
        boolean blockIsDigit = true; // Assume is True
        for (char c: block.toCharArray()) {
            blockIsDigit &= Character.isDigit(c);
        }
        return blockIsDigit;
    }

    public static boolean validate(String input) {
        int currentBlock = 0;
        boolean block23isValid = true;
        boolean block4isValid = true;
        for (String block: input.split("-")) {
            char[] blockArray = block.toCharArray();
            currentBlock++;
            if (currentBlock == 2 || currentBlock == 3)
                block23isValid = block23isValid
                        && Character.isDigit(blockArray[0])
                        && Character.isDigit(blockArray[1])
                        && Character.isDigit(blockArray[2]);
            if (currentBlock == 4)
                block4isValid = block4isValid
                        && Character.isDigit(blockArray[0])
                        && Character.isDigit(blockArray[1])
                        && isBetweenAT(blockArray[2]);
        }
        return block23isValid && block4isValid;
    }

    private static boolean warAndPeace(String a) {
        char[] inputCharArray= a.toCharArray();

        int numOfWar = 0;
        int numOfPeace = 0;

        for (int i = 0;i<inputCharArray.length;i++){
            if (
                    i<=inputCharArray.length-2
                    &&(inputCharArray[i]=='w')
                    &&(inputCharArray[i+1]=='a')
                    &&(inputCharArray[i+2]=='r')
            ) numOfWar++;

            if (
                    i<=inputCharArray.length-4
                    &&(inputCharArray[i]=='p')
                    &&(inputCharArray[i+1]=='e')
                    &&(inputCharArray[i+2]=='a')
                    &&(inputCharArray[i+3]=='c')
                    &&(inputCharArray[i+4]=='e')
            ) numOfPeace++;
        }

        return numOfPeace == numOfWar;
    }




    public static void main(String[] args) {
//        String input = "A-123-456-23A";
//        System.out.println(validate(input));
        System.out.println(warAndPeace("war peacepeace war p"));
    }


}
