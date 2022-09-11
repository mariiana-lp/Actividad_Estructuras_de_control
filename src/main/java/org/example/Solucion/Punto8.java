package org.example.Solucion;

import java.util.Scanner;

public class Punto8 {
    /*Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número
    es positivo, nulo o negativo.*/

    public static void indicar_tipo_numero(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int numero = scan.nextInt();

        if (numero > 0)
            System.out.println("El numero es positivo");
        else if (numero < 0)
            System.out.println("El numero es negativo");
        else
            System.out.println("El numero es nulo");
    }
}
