package org.example.Solucion;

import java.util.Scanner;

public class Punto6 {
    /*Confeccionar un programa que pida por teclado tres notas de un alumno, calcule el
    promedio e imprima alguno de estos mensajes:
    Si el promedio es >=7 mostrar "Promocionado".
    Si el promedio es >=4 y <7 mostrar "Regular".
    Si el promedio es <4 mostrar "Reprobado".*/

    public static void promedio_notas() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar nota 1");
        double nota1 = scan.nextDouble();
        System.out.println("Ingresar nota 2");
        double nota2 = scan.nextDouble();
        System.out.println("Ingresar nota 3");
        double nota3 = scan.nextDouble();
        double promedio = (nota3 + nota2 + nota1) / 3;
        if(promedio >= 7)
            System.out.println("Promocionado");
        else if (promedio >= 4 && promedio < 7)
            System.out.println("Regular");
        else if (promedio < 4)
            System.out.println("Reprobado");
    }
}
