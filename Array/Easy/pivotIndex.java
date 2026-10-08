package LeetCode;

import java.util.Arrays;

public class Solution {
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sumLeft = 0, sumRight;

        for(int i = 0;i < nums.length;i++){
            sumRight = total - sumLeft - nums[i];

            if(sumRight == sumLeft){
                return i;
            }
            sumLeft += nums[i];
        }
        return - 1;
    }
    public static void main(String[] args) {
        Solution main = new Solution();

        int[] nums = {1,7,3,6,5,6};

        System.out.println(main.pivotIndex(nums));
    }
}