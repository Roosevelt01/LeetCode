package LeetCode.Validparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Validparentheses {
    public static void main(String[] args) {
            String s = "()[]{}";
            Deque<Character> stack = new ArrayDeque<>();

            for(int i = 0; i<s.length();i++){
                char c = s.charAt(i);

                if(c== '(' || c == '[' || c == '{'){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        System.out.println(false);
                        return;
                    }else {
                        char ultimo = stack.pop();

                        if ((c==')' && ultimo != '(') ||
                            (c == ']' && ultimo != '[') ||
                            (c == '}' && ultimo != '{')   ){
                            System.out.println(false);
                            return;
                        }
                    }
                }
            }
        System.out.println(stack.isEmpty());
        return;
    }
}
