package org.example.Solucion;

import java.util.Scanner;

public class Punto3 {
    /*Realizar un programa que lea por teclado dos números, si el primero es mayor al
    segundo informar su suma y diferencia, en caso contrario informar el producto y la
    división del primero respecto al segundo.*/

    public static void operaciones_segun_numero_mayor() {
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
            System.out.println("La suma es: " + (num1 + num2) + "\nLa diferncia es:" + (num1-num2));
        else
            System.out.println("El pruducto es: " + (num1 * num2) + "\nLa division es: " + (num1 / num2));

    }
}
