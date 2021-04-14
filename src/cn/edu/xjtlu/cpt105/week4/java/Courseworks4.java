package cn.edu.xjtlu.cpt105.week4.java;

/**
 * Course Works for week 4
 *
 * @author Hsun.Pu20
 */
public class Courseworks4 {

    /**
     * CW1 4.1 Band Matrix<br/>
     * <br/>
     * Takes two integer arguments n and width and
     * prints an n-by-n pattern like the ones below,
     * with a zero (0) for each element whose distance
     * from the main diagonal is strictly more than width,
     * and an asterisk (*) for each entry that is not,
     * and two spaces between each 0 or *.<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * bandMatrix(4, 0):
     * *  0  0  0
     * 0  *  0  0
     * 0  0  *  0
     * 0  0  0  *
     *
     * bandMatrix(4, 1):
     * *  *  0  0
     * *  *  *  0
     * 0  *  *  *
     * 0  0  *  *
     *
     * bandMatrix(4, 2):
     * *  *  *  0
     * *  *  *  *
     * *  *  *  *
     * 0  *  *  *
     * </pre>
     *
     * @param n     the dimension of the array.
     * @param width the width of the band.
     * @author Hsun.Pu20
     */
    public static void bandMatrix(int n, int width) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1; j++) {
                System.out.print(Math.abs(j-i) <= width ? "*  " : "0  ");
            }
            System.out.println(Math.abs(n-1-i) <= width ? "*" : "0");
        }
    }

    /**
     * CW1 4.2 Easy As 123<br/>
     * <br/>
     * Takes an array of integers and returns an array
     * that contains exactly the same numbers as the given array,
     * but rearranged so that every 1 and 2 is immediately followed by a 3,
     * in the order of appearance, as in the test cases below.<br/>
     * <br/>
     * Specifically,<br/>
     * (1) In the input array, every 1 is always immediately followed by a 2.<br/>
     * (2) However, even though every 2 is immediately followed by a number,
     * not every 2 is immediately followed by a 3.<br/>
     * (3) Do not move the 1 and 2's, but every other number may move to swap place with a 3.<br/>
     * (4) The input array contains the same number of 1's, 2's and 3's.<br/>
     * <br/>
     * Test cases :<br/>
     * <br/>
     * <pre>
     * easyAs123({5, 1, 2, 4, 3, 5}):
     *         → [5, 1, 2, 3, 4, 5]
     *
     * easyAs123({1, 2, 9, 8, 3, 5, 3, 7, 1, 2, 6, 4}):
     *         → [1, 2, 3, 8, 9, 5, 6, 7, 1, 2, 3, 4]
     *
     * easyAs123({5, 5, 5}):
     *         → [5, 5, 5]
     * </pre>
     *
     * @param nums input int array.
     * @return processed int array.
     * @author Hsun.Pu20
     */
    public static int[] easyAs123(int[] nums) {

        // initialize arrays for indicies of 3
        int[] indiciesOf3 = new int[nums.length/3];

        // record indicies of 3 in order of occurrence
        for (int i = 0, threeCount = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                indiciesOf3[threeCount++] = i;
            }
        }

        // search for index of 2 and swap element at i+1 with a 3
        for (int i = 0, threeCount = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] != 3){
                nums[indiciesOf3[threeCount++]] = nums[i+1];
                nums[i+1] = 3;
            }
        }

        return nums;
    }

    private static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[arr.length-1]+"]");
    }

    private static void test() {
        int[] test = new int[]{3, 8, 1, 2, 3, 8, 5, 7, 1, 2, 6};
        printArr(test);
        printArr(easyAs123(test));
    }


    public static void main(String[] args) {
        test();
    }

}
