package org.example.Solucion;

import java.util.Scanner;

public class Punt5 {
    /*Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un
    mensaje indicando si el número tiene uno o dos dígitos. (Tener en cuenta que
    condición debe cumplirse para tener dos dígitos, un número entero)*/

    public static void cantidad_digitos() {
        Scanner scan = new Scanner(System.in);
        boolean bandera = false;
        int numero;

        do {
            System.out.println("Ingresa un numero entero y positivo entre 0 y 99: ");
            numero = scan.nextInt();

            if (numero < 0 || numero>99){
                bandera = true;
                System.out.println("Recuerda que debe ser positivo y entero y estar en el rango indicado");
            }else
                bandera=false;

        }while(bandera);


        if(numero>9)
            System.out.println("El numero tiene dos digitos");
        else
            System.out.println("El numero tiene un digito");
    }
}
