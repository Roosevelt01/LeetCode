package LeetCode;

import java.util.Arrays;

public class Solution {
    public int[] runningSum(int[] nums){
        int sum = 0;

        //PR: i = 0
        //SR: i = 1
        //TR: i = 2
        //TR: i = 3
        for(int i = 0;i < nums.length; i++){
            // PR: 0  +  1 -> sum = 1
            // SR: 1  +  2 -> sum = 3
            // TR: 3  +  3 -> sum = 6
            // CR: 6  +  4 -> sum = 10
            sum = sum + nums[i];

            //PR: nums[i] = 1
            //SR: nums[i] = 3
            //TR: nums[i] = 6
            //CR: nums[i] = 10
            nums[i] = sum;
        }

        return nums;
    }
    public static void main(String[] args) {
        Solution main = new Solution();
        int [] nums = {1,2,3,4};

        System.out.println(Arrays.toString(main.runningSum(nums)));
    }
}