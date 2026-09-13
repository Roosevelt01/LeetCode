package LeetCode;

public class Solution {
    public int maxProfit(int[] prices){
        int totalProfit = 0;

        //PR: i = 0
        //SR: i = 1
        //TR: i = 2
        //CR: i = 3
        //QR: i = 4
        for (int i = 0; i < prices.length - 1;i++){

            //PR: 1 > 7
            //SR: 5 > 1
            //TR: 3 > 5
            //CR: 6 > 3
            //QR: 4 > 6
            if(prices[i + 1] > prices[i]){
                //SR: totalProfit(0) = 5 - 1 -> SR: totalProfit = 4
                //CR: SR: totalProfit(4) = 6 - 3 -> totalProfit = 3
                totalProfit += prices[i+1] - prices[i];
            }
        }
        return totalProfit; // 7
    }
    public static void main(String[] args) {
        Solution main = new Solution();
        int [] nums = {7,1,5,3,6,4};

        System.out.println(main.maxProfit(nums));
    }
}