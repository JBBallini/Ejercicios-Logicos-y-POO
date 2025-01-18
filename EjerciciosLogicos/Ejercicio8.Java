
import java.util.Scanner;

public class Ejercicio8{

    public static void main(String[] args) {

        /*
            En 3 vectores diferentes se guardan los nombres, las temperaturas
            minimas y máximas de 3 ciudades. En el primero se guardan los nombres,
            en el segundo las temperaturas mínimas y en el tercero las máximas.
            Se necesita un programa al cual se le puedan cargar estos datos y 
            deberá informar por pantalla cual fue la ciudad con la temperatura
            minima y cual máxima, además de mostrar su valor.
        */
        
        String ciudad[] = new String[3];
        double temMin[] = new double[3];
        double temMax[] = new double[3];
        
        double max = 0;
        double min = 0;
        String nombreMin = "";
        String nombreMax = "";
        
        
        Scanner teclado = new Scanner(System.in);
        
        //Cargar Datos
        for(int i = 0; i < ciudad.length; i++){
            
            System.out.println("Ingresar nombre de ciudad " + (i+1));
            ciudad[i] = teclado.next();
            
            System.out.println("Ingresar temperatura minima ciudad " + (i+1));
            temMin[i] = teclado.nextDouble();
            
            System.out.println("Ingresar temperatura máxima ciudad " + (i+1));
            temMax[i] = teclado.nextDouble();
        }
        
        //Comprobar temperaturas
        for(int i = 0; i < ciudad.length; i++){
            
            if (temMin[i] <= min){
                min = temMin[i];
                nombreMin = ciudad[i];
            }
            if (temMax[i] >= max){
                max = temMax[i];
                nombreMax = ciudad[i];
            }
        }
        
        System.out.println("---------------------------------------");
        System.out.println("La ciudad " + nombreMax + " temperatura más alta de " + max);
        System.out.println("La ciudad " + nombreMin + " temperatura más baja de " + min);
    }
}