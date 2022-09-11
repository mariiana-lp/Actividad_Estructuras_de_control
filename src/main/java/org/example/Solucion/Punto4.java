package org.example.Solucion;

import java.util.Scanner;

public class Punto4 {
    /*Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar
    un mensaje "Promocionado".*/

    public static void promocion() {
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
        else
            System.out.println("No promocoonado");
    }
}
