package LeetCode;

import java.text.NumberFormat;
import java.util.HashMap;

public class Solution {
    public int maxSubArray(int[] arr){
        int currentSum = arr[0]; //-2
        int maxSum = arr[0]; //-2

        // PR: i = 1
        // SR: i = -3
        // TR: i = 4
        // CR = - 1
        // QR: 2
        // SR: 1
        // SR: - 5
        // OR: 4
        for (int i = 1; i<arr.length ;i++){

               //PR: currentSum = ((-2 + 1), 1) -> currentSum = 1
               //SR: currentSum = ((1 + -3), -3) -> currentSum = - 2
               //TR: currentSum = ((-2 + 4), 4) -> currentSum = 4
               //CR: currentSum = ((4 + -1 ), -1) -> currentSum = 3
               //QR: currentSum = ((3 + 2 ), 2) -> currentSum = 5
               //SR: currentSum = ((5 + 1), 1) -> currentSum = 6
               //SR: currentSum = ((6 + - 5 ), -5 ) -> currentSum = 1
               //OR: currentSum = ((1 + 4 ), 4 ) -> currentSum = 5
               currentSum = Math.max(currentSum + arr[i],arr[i]);

            // PR: 1 > - 2
            // SR: -2 > 1
            // TR: 4 > 1
            // CR: 3 > 4
            // QR: 5 > 4
            // SR: 6 > 5
            // SR: 1 > 6
            // OR: 5 > 6
               if(currentSum > maxSum){
                   //PR: maxSum = 1
                   //TR: maxSum = 4
                   //QR: maxSum = 5
                   //SR: maxSum = 6
                   maxSum = currentSum;
               }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Solution main = new Solution();
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(main.maxSubArray(nums));

    }
}