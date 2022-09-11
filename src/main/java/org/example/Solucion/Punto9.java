package org.example.Solucion;

import java.util.Scanner;

public class Punto9 {
    /*Confeccionar un programa que permita cargar un número entero positivo de hasta
    tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras. Mostrar un mensaje
    de error si el número de cifras es mayor.*/

    public static void contador_cifras(){
        Scanner scan = new Scanner(System.in);
        int numero;
        boolean bandera = false;
        do {
            System.out.println("Ingrese numero entero posivito: ");
            numero = scan.nextInt();
            if(numero < 0){
                System.out.println("Recuerda que el numero debe ser positivo");
                bandera = true;
            }else
                bandera = false;
        }while(bandera);


        if(numero >= 0 && numero < 10)
            System.out.println("El  numero tiene 1 cifra");
        else if (numero >= 10 && numero < 100)
            System.out.println("El numero tiene 2 cifras");
        else if (numero >= 100 && numero < 1000)
            System.out.println("El numero tiene 3 cifras");
        else
            System.out.println("¡ERROR: El numero tiene mas de 3 cifras!");

    }
}
