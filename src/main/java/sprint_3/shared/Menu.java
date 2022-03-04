package sprint_3.shared;

import java.util.List;

/**
 * clase que imprime los menús de la consola.
 * Cualquier cosa que queramos mostrar por consola pasará por este menú.
 */
public class Menu {
    
    /**
     * Printea un string en la consola
     * @param value -> string a imprimir
     */
    public static void printLine(final String value){
        System.out.println(value);
    }

    /**
     * Printea una lista<?> con indice empezando en 1, donde:
     * n.- Class.toString()
     * TODO: cambiar para que sea variable.
     * @param list -> lista a imprimir
     */
    public static void printList(final List<?> list){
        int[] c = {1};
        list.forEach((i) -> {System.out.println(String.format("%d.- %s", c[0], i.toString()));c[0]++;});   
            
        /*for(int i = 0; i < list.size(); i++){
            System.out.println(String.format("%d.- %s", i+1, list.get(i).toString()));
        }*/
    }

    /**
     * Printea una línea vacia
     */
    public static void printEmpty(){
        System.out.println();
    }

    /**
     * Prinetea un número <amount> de líneas vacías
     * @param amount -> cantidad de líneas a imprimir
     */
    public static void printEmpty(int amount){
        for(int i = 0; i < amount; i++){
            System.out.println();
        }
    }
}
