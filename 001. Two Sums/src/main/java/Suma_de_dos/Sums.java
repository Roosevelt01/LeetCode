package Suma_de_dos;

import java.util.HashMap;

public class Sums {
    public static void main(String[] args) {
        // Paso 1: Crear un array de números y un objetivo        
        int [] num = {2,7,11,15};

        // Paso 2: Definir el objetivo que queremos alcanzar con la suma de dos números del array
        int objetivo = 9;

        //Paso 3: Crear un HashMap para almacenar los números que hemos visto y sus índices
        HashMap<Integer, Integer> numerosVistos = new HashMap<>();

        //Paso 4: Recorrer el array de números    
        for(int i = 0; i < num.length; i++){

            // Paso 5: Para cada número, calcular el complemento que necesitamos para alcanzar el objetivo
            int numeroActual = num[i];

            // Paso 6: Verificar si el complemento ya ha sido visto (es decir, si está en el HashMap)
            int complemento = objetivo - numeroActual;

            // Paso 7: Si el complemento ha sido visto, significa que hemos encontrado los dos números que suman el objetivo
            if(numerosVistos.containsKey(complemento)){

                // Paso 8: Obtener el índice del complemento desde el HashMap
                int indiceDelComplemento = numerosVistos.get(complemento);

                // Paso 9: Imprimir los índices de los dos números que suman el objetivo
                System.out.println("¡Reto superado! Índices: [" + indiceDelComplemento + ", " + i + "]");
                break; // Salir del bucle una vez que se encuentra la solución
            }

            // Paso 10: Si el complemento no ha sido visto, agregar el número actual y su índice al HashMap
            numerosVistos.put(numeroActual,i);
        }
    }
}


/// Código LeeCode 

package Suma_de_dos;

import java.util.HashMap;
import java.util.Arrays;

public class Sums {

    public static int[] encontrarDosSumas(int[] num, int objetivo) {
        HashMap<Integer, Integer> numerosVistos = new HashMap<>();

        for(int i = 0; i < num.length; i++){
            int numeroActual = num[i];
            int complemento = objetivo - numeroActual;

            if(numerosVistos.containsKey(complemento)){
                int indiceDelComplemento = numerosVistos.get(complemento);
                
                return new int[] { indiceDelComplemento, i }; 
            }

            numerosVistos.put(numeroActual, i);
        }
        
        throw new IllegalArgumentException("No se encontró ninguna pareja que sume el objetivo.");
    }
}