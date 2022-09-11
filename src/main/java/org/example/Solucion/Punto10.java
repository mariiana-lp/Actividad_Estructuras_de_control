package org.example.Solucion;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

public class Punto10 {
    /*Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
    siguiente información: cantidad total de preguntas que se le realizaron y la cantidad
    de preguntas que contestó correctamente. Se pide confeccionar un programa que
    ingrese los dos datos por teclado e informe el nivel del mismo según el porcentaje de
    respuestas correctas que ha obtenido, y sabiendo que:
    Nivel máximo: Porcentaje>=90%.
    Nivel medio: Porcentaje>=75% y <90%.
    Nivel regular: Porcentaje>=50% y <75%.
    Fuera de nivel: Porcentaje<50%.*/

    public static void porcentaje_preguntas_empleado(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cantidad total de preguntas: ");
        int cant_total = scan.nextInt();
        System.out.println("Ingrese la cantidad de preguntas aprobadas ");
        int cant_aprob = scan.nextInt();

        double porcentaje  =(cant_aprob * 100)/ cant_total;

        System.out.println("El empledo se encuentra en: ");
        if(porcentaje >= 95)
            System.out.println("Nivel Máximo");
        else if(porcentaje >= 75 && porcentaje < 90)
            System.out.println("Nivel Medio");
        else if(porcentaje >= 50 && porcentaje < 75)
            System.out.println("Nivel Regular");
        else if (porcentaje < 50)
            System.out.println("Fuera de nivel");
    }
}
