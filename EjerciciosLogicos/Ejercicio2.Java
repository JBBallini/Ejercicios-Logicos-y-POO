
import java.util.Scanner;

public class Ejercicio2{

    public static void main(String[] args) {

        /*
        Realizar un programa que dado por teclado in indice númerico, muestre
        por pantalla todos los números hasta ese límite
        */
        
        int indice, contador = 1;
        
        System.out.println("Ingresar un número");
        Scanner teclado = new Scanner(System.in);
        indice = teclado.nextInt();
        
        while (contador <= indice){
            System.out.println(contador);
            contador++;
        }
    }
}