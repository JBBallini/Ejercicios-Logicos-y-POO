
import java.util.Scanner;

public class Ejercicio6{

    public static void main(String[] args) {

        /*
            En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos
            de secundaria. Se necesita un programa que permita a un profesor cargar,
            en las 3 columnas de cada fila, las notas del alumno y que en la última
            columna se calculen los promedios. Una vez realizados los cálculos,
            se desea mostrar las 3 notas de cada alumno y su promedio.
        */
        
        double tabla[][] = new double[4][4];
                
        Scanner teclado = new Scanner(System.in);
        
        for(int f = 0; f < 4; f++){
            System.out.println("Cargar notas del alumno " + (f+1));
            for(int c = 0; c < 3; c++){
                
                tabla[f][c] = teclado.nextDouble();
            }
            tabla[f][3] = (tabla[f][0] + tabla[f][1] + tabla[f][2])/3;
        }
        
        System.out.println("----------------------------------------");
         
        for(int f = 0; f < 4; f++){
            System.out.println("Notas del alumno " + (f+1));
            for(int c = 0; c < 3; c++){
                
                System.out.println(tabla[f][c]);
              
            }
            System.out.println("Promedio del alumno " + (f+1));
            System.out.println(tabla[f][3]);
        }
    }
}