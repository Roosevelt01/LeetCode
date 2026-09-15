package LeetCode;

public class Solution {
    public int removeDuplicates(int[] nums){
        int slow = 0;

        //PR: i = 1
        //SR: i = 2
        for(int i = 1; i < nums.length;i++){
            //PR: 1 != 1
            //SR: 1 != 2
            if(nums[slow] != nums[i]){
                slow++; // SR: 1
                nums[slow] = nums[i]; //SR: nums[slow] = 2
            }
        }
        return slow + 1;
    }
    public static void main(String[] args) {
        Solution main = new Solution();
        int [] nums = {1,1,2};

         System.out.println(main.removeDuplicates(nums));

//        int k = main.removeDuplicates(nums);
//
//        for(int i = 0; i < k; i++){
//            System.out.println(nums[i]);
//        }
    }
}