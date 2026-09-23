package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> elements = new HashMap<>();

        for (int num : nums) {
            elements.put(num, elements.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        Solution main = new Solution();
        int [] nums = {3,2,3};

        System.out.println(main.majorityElement(nums));
    }
}