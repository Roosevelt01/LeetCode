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
import java.util.Arrays; // Solo lo usamos en el main para imprimir el arreglo bonito

public class Sums {

    // 🧠 1. TU MOTOR DE INGENIERÍA (La "Caja Negra")
    // Este es el método exacto que copiarías y pegarías en LeetCode
    public static int[] encontrarDosSumas(int[] num, int objetivo) {
        HashMap<Integer, Integer> numerosVistos = new HashMap<>();

        for(int i = 0; i < num.length; i++){
            int numeroActual = num[i];
            int complemento = objetivo - numeroActual;

            if(numerosVistos.containsKey(complemento)){
                int indiceDelComplemento = numerosVistos.get(complemento);
                
                // 🔥 EL CAMBIO CLAVE: En vez de imprimir (println), DEVOLVEMOS el arreglo.
                // Y al hacer "return", el bucle y el método se detienen automáticamente (ya no hace falta el "break").
                return new int[] { indiceDelComplemento, i }; 
            }

            numerosVistos.put(numeroActual, i);
        }
        
        // 🛡️ PROGRAMACIÓN DEFENSIVA: ¿Qué pasa si le pasas un arreglo sin solución?
        // Un ingeniero nunca deja que el método termine en el aire. Lanza una excepción controlada.
        throw new IllegalArgumentException("No se encontró ninguna pareja que sume el objetivo.");
    }


    // 🏎️ 2. TU PISTA DE PRUEBAS (El cliente que usa tu motor)
    public static void main(String[] args) {
        // Preparamos los datos
        int[] num = {2, 7, 11, 15};
        int objetivo = 9;
        
        // Llamamos a tu método y guardamos lo que nos devuelve en una variable
        int[] resultado = encontrarDosSumas(num, objetivo);
        
        // Imprimimos el resultado para confirmar la victoria
        System.out.println("¡Reto superado! Índices: " + Arrays.toString(resultado));
    }
}