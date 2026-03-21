package LeetCode.ReverseString;

import java.util.ArrayDeque;
import java.util.Deque;

public class Exercise {
    public static void main(String[] args) {
        String palabra = "hola";
        Deque<Character> pila = new ArrayDeque<>();

        for(char letraActual : palabra.toCharArray()){
            pila.push(letraActual);
        }

        StringBuilder resultado = new StringBuilder();

        while(!pila.isEmpty()){

            char letraFirst = pila.pop();

            resultado.append(letraFirst);
        }

        System.out.println("Original: " + palabra);

        System.out.println("Invertida: " + resultado.toString());
    }
}