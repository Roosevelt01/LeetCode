package LeetCode.Merge;

import java.util.HashSet;

public class Solution {
    public static int[] commonElements(int[] nums1, int[] nums2) {
        HashSet<Integer> numsSeeing = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(Integer num2: nums2){
            numsSeeing.add(num2);
        }

        for(Integer num1: nums1){
            if(numsSeeing.contains(num1)){
                result.add(num1);
            }
        }

        int[] response = new int[result.size()];

        int index = 0;

        for (Integer num : result) {
            response[index] = num;
            index++;
        }

        return response;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};

        int[] result = commonElements(nums1, nums2);

        for(int num : result){
            System.out.println(num);
        }
    }
}