package LeetCode.Suma_de_dos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Sums {

    public static int[] encontrarDosSumas(int[] num, int objetivo) {
        HashMap <Integer,Integer> numVistos = new HashMap<>();

        for(int i = 0; i<num.length;i++){
            int numActual = num[i];

            int complemento = objetivo - numActual;

            if(numVistos.containsKey(complemento)){
                int indiceActual = numVistos.get(complemento);

                return new int [] {indiceActual, i};
            }

            numVistos.put(numActual, i);
        }

        throw new IllegalArgumentException("No se encontró ninguna pareja que sume el objetivo.");
    }

    public static void main(String[] args) {
        int[] misNumeros = {2, 7, 11, 15};
        int miObjetivo = 9;

        int[] resultado = encontrarDosSumas(misNumeros, miObjetivo);

        System.out.println("Indices encontrados: [" + resultado[0] + ", " + resultado[1] + "]");
    }
}
