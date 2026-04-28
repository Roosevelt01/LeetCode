package LeetCode.ReversString;
import java.util.Arrays;

public class Main {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1 ;

        System.out.println(Arrays.toString(s));
        System.out.println(s[right]);
        System.out.println(s[left]);

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        Main mainprogram = new Main();
        char[] palabra = {'h','e','l','l','o'};

        mainprogram.reverseString(palabra);
    }
}