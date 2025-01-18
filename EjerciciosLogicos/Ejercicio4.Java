
import java.util.Scanner;

public class Ejercicio4{

    public static void main(String[] args) {

        /*
            En la ciudad de Óbera, Misiones, se realiza año a año una maratón.
            Se requieren los siguientes datos para la inscripción de los
            participantes: nombre, edad y dni.
            Y las categorías posibles son:
            - Menores A (6 a 10 años)
            - Menores B (11 a 17 años)
            - Juveniles (18 a 30 años)
            - Adultos (31 a 50 años)
            - Adultos Mayores (más de 50 años)
            Se necesita un programa que, a partir de los datos de cada participante,
            se muestre por pantalla a que categoría debe ser inscripto. Además,
            al ingresar las inscripciones, se debe ingresar un dni con valor 0 y un
            nombre con la palabra "fin"
        */
        
        int edad, dni = -1;
        String nombre = "";
        String categoria = "";
        
        Scanner teclado = new Scanner(System.in);
        
        while((dni != 0) && (!nombre.equals("fin"))){
            
            System.out.println("Ingresar nombre");
            nombre = teclado.next();

            System.out.println("Ingresar edad");
            edad = teclado.nextInt();

            System.out.println("Ingresar DNI");
            dni = teclado.nextInt();
            
            if(edad >= 6 && edad <= 10){
                categoria = "Categoria: Menores A";
            } else if(edad >= 11 && edad <= 17){
                categoria = "Categoria: Menores B";
            } else if(edad >= 18 && edad <= 30){
                categoria = "Categoria: Juveniles";
            } else if(edad >= 31 && edad <= 50){
                categoria = "Categoria: Adultos";
            } else if(edad > 50){
                categoria = "Categoria: Adultos Mayores";
            }
            
            System.out.println("Su categoria es: " + categoria);  
        }
        System.out.println("FIN DE LAS INSCRIPCIONES");
    }
}