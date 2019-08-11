package com.GARCIA;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LectorError {

    public static int SolicitarEntero(String mensaje){
        Scanner lector = new Scanner(System.in);
        System.out.print(mensaje);
        try{
            int Numero = lector.nextInt();
            return Numero;
        }catch (InputMismatchException e){
            System.out.println("El dato es inavalido");
            return SolicitarEntero(mensaje);
        }
    }


    public static double SolicitarDouble(String mensaje){
        Scanner lector = new Scanner(System.in);
        System.out.print(mensaje);
        try{
            double Numero =lector.nextDouble();
            return Numero;
        }catch (InputMismatchException e){
            System.out.println("El dato es invalido");
            return SolicitarDouble(mensaje);
        }
    }
}
