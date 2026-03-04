
//Recuerda activar Show suggestions as you type

import javax.swing.*;
import java.util.Arrays;
import java.util.Map;

//"Actualizar",Eliminar","Agregar","Listar","Salir"

public class Exercise {
    public static void main(String[] args) {
        var opciones = Map.of("Actualizar",1,"Eliminar",2, "Agregar",3,"Listar",4, "Salir",5);
        Object[] opcArreglos = opciones.keySet().toArray();
        int sel = 0;

        Arrays.stream(opcArreglos).forEach(System.out::println);

        do{
            Object opcion = JOptionPane.showInputDialog(null, "Elige una opción", "Mantenederos", 1, null, opcArreglos, opcArreglos[0]);

            if(opcion == null)break;

            sel = opciones.get(opcion.toString());

            String msg = switch(sel){
                case 1 -> "Usuario actualizado";
                case 2 -> "Usuario Eliminado";
                case 3 -> "Usuario Agregado";
                case 4 -> "Usuario Listado";
                case 5 -> "Salir";
                default -> "Opción no válido";
            };

            JOptionPane.showMessageDialog(null, msg + (sel == 5? "":" correctamente"));

        }while(sel!=5);

    }
}
