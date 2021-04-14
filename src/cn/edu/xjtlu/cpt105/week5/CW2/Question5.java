package cn.edu.xjtlu.cpt105.week5.CW2;

/**
 * CW2.1 Question 5
 */
public class Question5 {

    public static int[] shiftEvenNumber(int[] nums) {

        int[] newNums = new int[nums.length];

        for (int i = 0, j = 0, k = nums.length-1; i < nums.length; i++)
            if   (nums[i] % 2 != 0)  newNums[j++] = nums[i];
            else/*nums[i] % 2 == 0*/ newNums[k--] = -1;

        return newNums;
    }

    public static int[] shiftNumber(int[] nums) {

        int[] temp = new int[nums.length];

        for (int i = 0, j = 0, k = nums.length-1; i < nums.length; i++)
            if   (nums[i] != 5)  temp[j++] = nums[i];
            else/*nums[i] == 5*/ temp[k--] = -1;

        return temp;
    }



    public static void main(String[] args) {
        test(new int[]{1, 2, 3, 4, 5,8,11,7,11,8,99,11});
        test(new int[]{10, 111, 33, 555,11});
    }


    static void printInts(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++)
            System.out.print(arr[i]+", ");
        System.out.println(arr[arr.length-1]+"]");
    }

    static void test(int[] nums) {
        printInts(shiftEvenNumber(nums));
    }

}
