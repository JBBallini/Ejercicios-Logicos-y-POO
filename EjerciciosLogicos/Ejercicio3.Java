
import java.util.Scanner;

public class Ejercicio3{

    public static void main(String[] args) {
        /*
            Realizar un programa que muestre por pantalla palabras ingresadas por
            teclado hasta que se ingrese la palabra "salir"
        */
        
        String palabra;
        
        System.out.println("Ingresar una palabra");
        Scanner teclado = new Scanner(System.in);
        palabra = teclado.next();
        
        while(!palabra.equals("salir")){
            
            System.out.println("Palabra ingresada: " + palabra);
            
            System.out.println("Ingresar una palabra");
            palabra = teclado.next();
        }
        System.out.println("FIN");
    }
}