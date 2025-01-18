
import java.util.Scanner;

public class Ejercicio5{

    public static void main(String[] args) {

        /*
            Realizar un programa que permita cargar 6 números en un vector. Una vez
            cargados, se necesita que se cuente e informe por pantalla cuantas
            veces aparece el número 3.
        */

        int vector[] = new int[6];
        int contador = 0;
        
        Scanner teclado = new Scanner(System.in);
        
        for(int i = 0; i < vector.length; i++){
            
            System.out.println("Ingrese un número:");
            vector[i] = teclado.nextInt();
            
            if(vector[i] == 3){
                contador++;
            }
        }
         System.out.println("Cantidad de 3s: " + contador);
    }
}