package org.example.Solucion;

import java.util.Scanner;

public class Punto1 {
    /*Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en
    pantalla indicando que debe abonar impuestos.*/

    public static void impuestos(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su sueldo: ");
        int sueldo = scan.nextInt();
        if(sueldo >3000)
            System.out.println("Debe abonar impuesto");
        else
            System.out.println("No debe abonar impuestos");
    }

}
