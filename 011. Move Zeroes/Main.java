package LeetCode.Move_Zeroes;

import java.util.Arrays;

public class Main {
    public void moveZeroes(int[] num){
        int write = 0;
        int read = 0;

        for(read =0 ;read<num.length;read++){
            if(num[read] !=0){
                num[write] = num[read];
                write++;
            }
        }

        while (write < num.length) {
            num[write] = 0;
            write++;
        }

        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {
        Main mainprg = new Main();

        int [] num = {0,2,0,4,5};

        mainprg.moveZeroes(num);
    }
}

--------------------------------------------------------

class Solution {
    public void moveZeroes(int[] nums) {
        int write = 0;

        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            }
        }

        while (write < nums.length) {
            nums[write] = 0;
            write++;
        } 
    }
}