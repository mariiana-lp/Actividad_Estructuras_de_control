package org.example.Solucion;

import java.util.Arrays;
import java.util.Scanner;

public class Punto7 {
    /*Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.*/
    public static void numero_mayor(){
        Scanner scan = new Scanner(System.in);
        int numeros [] = new int [3];
        for(int i = 0; i<numeros.length; i++){
            System.out.println("Ingrese numero: ");
            numeros[i] = scan.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println("El numero mayor es:" + numeros[numeros.length-1]);

    }
}
