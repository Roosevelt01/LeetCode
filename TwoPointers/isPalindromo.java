package LeetCode.Valid_PalIndrome;

public class Solution {
    public static boolean isPalindrome(int[] arr){
        int j = arr.length - 1;

        for (int k : arr) {
            if (k != arr[j]) {
                return false;
            }
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(isPalindrome(arr));

        int[] arr2 = {-1,2,1};
        System.out.println(isPalindrome(arr2));
    }
}
