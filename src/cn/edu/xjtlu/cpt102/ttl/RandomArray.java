package cn.edu.xjtlu.cpt102.ttl;

import java.util.Random;

public class RandomArray {
    private final int[] arr;
    private final int[] ori;
    private final Random random = new Random();


    public RandomArray(int[] nums) {
        arr = new int[nums.length];
        ori = new int[nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        System.arraycopy(nums, 0, ori, 0, nums.length);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        System.arraycopy(ori, 0, arr, 0, arr.length);
        return arr;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int rand, temp;
        for(int i= arr.length-1; i > 0; i--){
            rand = random.nextInt(i);
            temp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = temp;
        }
        return arr;
    }
}
