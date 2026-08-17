package LeetCode.Merge;

import java.util.HashSet;

public class Solution {
    public static boolean isRotation(String s1, String s2) {
        if(s1.length()!=s2.length())return false;

        String newChain = s1+s1;

        return newChain.contains(s2);
    }

    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";

        System.out.println(isRotation(s,goal));
    }
}