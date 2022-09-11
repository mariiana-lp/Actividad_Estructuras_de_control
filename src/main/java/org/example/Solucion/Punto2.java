package org.example.Solucion;

import java.util.Scanner;

public class Punto2 {
    /*Realizar un programa que solicite ingresar dos números distintos y muestre por
    pantalla el mayor de ellos.*/

    public static void mayor() {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        boolean bandera = false;
        do {
            System.out.println("ingrese un numero:");
            num1 = scan.nextInt();
            System.out.println("ingrese un numero:");
            num2 = scan.nextInt();

            if (num1 == num2) {
                bandera =true;
                System.out.println("Recuerde que los valores deben ser difernetes, intentalo de nuevo");
            }
            else
                bandera = false;
        }while (bandera);

        if (num1 > num2)
            System.out.println("EL numero mayor es: " + num1);
        else
            System.out.println("EL numero mayor es: " + num2);

    }

}
