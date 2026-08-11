package LeetCode.Move_Zeroes;
import java.util.Arrays;

public class Main {
    public static void moveZeroes(int[] num){
        int write = 0;

        for(int i =0;i<num.length;i++){
            if(num[i] != 0){
                num[write] = num[i];
                write++;
            }
        }

        while(write < num.length){
            num[write] = 0;
            write++;
        }
    }

    public static void main(String[] args) {
        int[] misNumeros = {0, 1, 0, 3, 12};

        System.out.println("Arreglo Original: " + Arrays.toString(misNumeros));
        System.out.println("---------------------------------");

        moveZeroes(misNumeros);

        System.out.println("---------------------------------");
        System.out.println("Arreglo Final: " + Arrays.toString(misNumeros));
    }
}