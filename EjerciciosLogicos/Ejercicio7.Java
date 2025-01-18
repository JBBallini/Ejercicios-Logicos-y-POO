
import java.util.Scanner;

public class Ejercicio7{

    public static void main(String[] args) {

        /*
            Diseñar un programa que incluya un vector que almacene los nombres:
            Alejandra, Juan, Pedro, Lucas y Maria. Realizar un recorrido para
            cargarlos y mostrarlos por pantalla.
        */
        
        String vector[] = new String[5];
        
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i < vector.length; i++){
            
            System.out.println("Ingresar un nombre:");
            vector[i] = teclado.next();
        }
        
         System.out.println("Nombres Cargados:");
         
        for(int i = 0; i < vector.length; i++){
            System.out.println("-> " + vector[i]);
        }
    }
}