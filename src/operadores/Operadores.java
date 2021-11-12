
package Operadores;

import java.util.Scanner;

public class Operadores {
    public static void main (String [] args){
        Scanner datos = new Scanner (System.in);
        float decimal1, decimal2, suma, suma1, multiplicacion, division1, division2;
        int numero1;
        
        System.out.println("\t\t\t Operaciones aritmeticas basicas para aprender a usar los operadores\n");
        System.out.println("\t\t\t Haremos 2 sumas, 1 multiplicacion y 1 division");
        
        System.out.println(" Introduce un numero decimal: ");
        decimal1 = datos.nextFloat();
        
        System.out.println(" Otro numero decimal porfa: ");
        decimal2 = datos.nextFloat();
        
        System.out.println(" Un numero entero, gracias: ");
        numero1 = datos.nextInt();
        
        suma = decimal1 + decimal2;
        suma1 = decimal1 + numero1;
        
        multiplicacion = decimal1 * numero1;
        
        division1 = decimal1/decimal2;
        
        System.out.println("La suma de: "+decimal1+ " y de "+decimal2+ " es: "+suma);
        
        System.out.println("La suma de: "+decimal1+ " mas el "+numero1+ " es:"+suma1);
        
        System.out.println(" El resultado de la multiplicacion de "+decimal1+ " * " +numero1+ " es:"+multiplicacion);
        
        System.out.println("La division de: " +decimal1 + " entre " +decimal2+ " es:"+division1);

        
    }
}