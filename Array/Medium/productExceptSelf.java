package LeetCode;

import java.util.Arrays;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int[] result = new int[nums.length];

        //1,2,3,4

        //PR i = 1
        //SR i = 2
        //TR i = 3
        //CR i = 4
        for(int i = 0; i < nums.length;i++){
            //PR result[i] = 1
            //SR result[i] = 1
            //TR result[i] = 2
            //CR result[i] = 6
            result[i] = product;

            //PR prodcut = 1 * 1 -> 1
            //SR prodcut = 1 * 2 -> 2
            //TR prodcut = 2 * 3 -> 6
            //CR prodcut = 6 * 4 -> 24
            product = product * nums[i];
        }

        //result; [1,1,2,6]

        product = 1;

        //PR i = 6
        //SR i = 2
        //TR i = 1
        //CR i = 1
        for(int i = nums.length - 1; i >= 0; i--){
            //PR result[i] = 6 * 1 - > 6
            //SR result[i] = 2 * 4 - > 8
            //TR result[i] = 1 * 12 -> 12
            //CR result[i] = 1 * 24 -> 24
            result[i] = result[i] * product;

            //PR product = 1 * 4 -> 4
            //PR product = 4 * 3 -> 12
            //TR product = 12 * 2 -> 24
            //CR product = 24 * 1 -> 24
            product = product * nums[i];
        }

        return result; // [24,12,8,6]

    }

    public static void main(String[] args) {
        Solution main = new Solution();

        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(main.productExceptSelf(nums)));
    }
}