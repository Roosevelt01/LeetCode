package LeetCode;

import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();

        for(char letra: s.toCharArray()){
            mapS.put(letra, mapS.getOrDefault(letra, 0)+1);
        }

        HashMap<Character, Integer> mapT = new HashMap<>();

        for(char letra: t.toCharArray()){
            mapT.put(letra, mapT.getOrDefault(letra, 0)+1);
        }

        return mapS.equals(mapT);
    }
    public static void main(String[] args) {
        Solution main = new Solution();

        String s = "anagram", t = "nagaram";

        System.out.println(main.isAnagram(s,t));
    }
}