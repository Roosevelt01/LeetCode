package LeetCode;

import java.util.Arrays;

public class Solution {
    public int findNumbers(int[] nums) {
        int countEven = 0;
        int aux=0;

        for(int i = 0;i<nums.length;i++) {
            int count = 0;
            aux = nums[i];

            while(aux > 0){
                count++;
                aux = aux / 10;
            }

            if(count % 2 == 0){
                countEven++;
            }
        }

        return countEven;
    }
    public static void main(String[] args) {
        Solution main = new Solution();

        int[] nums = {12,345,2,6,7896};

        System.out.println(main.findNumbers(nums));
    }
}