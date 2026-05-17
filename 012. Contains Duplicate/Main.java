package LeetCode.Contains_Duplicate;

import java.util.HashSet;

public class Main {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numcontaint = new HashSet<>();

        for(int num: nums){

            if(numcontaint.contains(num)){
                return true;
            }
            numcontaint.add(num);
        }
        return false;
    }
}