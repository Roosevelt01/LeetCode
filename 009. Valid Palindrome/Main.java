package LeetCode.Valid_PalIndrome;

public class Main {
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left < right){

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if(leftChar != rightChar){
                return false;
            }

            left++;
            right--;

        }

        return true;
    }

    public static void main(String[] args) {
        Main programa = new Main();

        System.out.println("--- INICIANDO PRUEBA ---");
        System.out.println(programa.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
