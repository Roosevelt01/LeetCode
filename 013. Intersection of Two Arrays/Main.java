package LeetCode.Intersection_two_Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> setnums = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num: nums1){
            setnums.add(num);
        }

        for(int num: nums2){
            if(setnums.contains(num)){
                result.add(num);
            }
        }

        int[]resultadoArray= new int[result.size()];
        int i = 0;

        for(Integer num: result ){
            resultadoArray[i++] = num;
        }

        return resultadoArray;
    }

    public static void main(String[] args) {
        Main programMain = new Main();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(programMain.intersection(nums1, nums2)));
    }
}
