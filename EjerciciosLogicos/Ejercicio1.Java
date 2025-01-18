
import java.util.Scanner;

public class Ejercicio1{

    public static void main(String[] args) {

        /*
            Una pequeña despensa desea calcular el sueldo de sus empleados.
            Los puestos de los mismos pueden tener 3 categorias:
                1. Repositor
                2. Cajero
                3. Supervisor
            - Los repositores cobran $15890 + 10%
            - Los cajeros cobran $25630.89 fijos
            - Los supervisores cobran $35560.20 en bruto al cual se le descuenta el 11%
            por la jubilación.
            Diseñar un algoritmo que calcule el sueldo para cada tipo de empleado
       */
       
       int categoria;
        double sueldo = 0;

        System.out.println("Ingresar su categoria");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();
        
        switch(categoria) {
            case 1 -> sueldo = 15890 + (15890 * 0.1);
            case 2 -> sueldo = 25630.89;
            case 3 -> sueldo = 35560.20 - (35560.20 * 0.11 );
            default -> System.out.println("ERROR");
        }
        
        System.out.println("El sueldo para categoria " + categoria + " es: " + sueldo);
    }
}