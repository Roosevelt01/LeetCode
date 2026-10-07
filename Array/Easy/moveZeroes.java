package LeetCode;

import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for(int i = 0;i < nums.length;i++){

            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;//PR: j = 1 |
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution main = new Solution();

        int[] nums = {0,1,0,3,12};

        main.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}