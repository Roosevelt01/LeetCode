package Suma_de_dos;

import java.util.HashMap;

public class Sums {
    public static void main(String[] args) {
        int [] num = {2,7,11,15};
        int objetivo = 9;
        HashMap<Integer, Integer> numerosVistos = new HashMap<>();

        for(int i = 0; i < num.length; i++){
            int numeroActual = num[i];

            int complemento = objetivo - numeroActual;

            if(numerosVistos.containsKey(complemento)){
                int indiceDelComplemento = numerosVistos.get(complemento);

                System.out.println("¡Reto superado! Índices: [" + indiceDelComplemento + ", " + i + "]");
                break;
            }

            numerosVistos.put(numeroActual,i);
        }
    }
}
