package LeetCode.Valid_PalIndrome;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> num = new HashSet<>();

        for(int k:arr){
            if(num.contains(k)){
                return true;
            }
            num.add(k);
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4};

        System.out.println(containsDuplicate(arr));

        int [] arr2 = {1,1,1,3,3,4,3,2,4,2};


        System.out.println(containsDuplicate(arr2));
    }
}
