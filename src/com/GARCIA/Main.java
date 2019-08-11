package com.GARCIA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList();

        System.out.println("**** Corporacion flores ******");
        boolean continuar = true;
        while (continuar){
            System.out.println("1. Inscribir Nuevos Vehiculos");
            System.out.println("2. Mostrar Vehiculos");
            System.out.println("3. Salir");
            int leer = LectorError.SolicitarEntero("Ingrese Su Opcion: ");

            switch (leer){
                case 1:
                    System.out.println("1. Toyota");
                    System.out.println("2. Nissan");
                    System.out.println("3. Honda");
                    System.out.println("4. Ford");
                    int modelo = LectorError.SolicitarEntero("Ingrese El Model De Su Vehiculo:  ");
                    System.out.println("Color Del Vehiculo:  ");
                    String colour = Lector.nextLine();
                    int year = LectorError.SolicitarEntero("Año Del Vehiculo: ");
                    double cantidad = LectorError.SolicitarDouble("Precio Del Vehiculo: ");

                    if(modelo == 1){
                        Toyota toyota = new Toyota();
                        toyota.color = colour;
                        toyota.year = year;
                        toyota.precio = cantidad;
                        vehiculos.add(toyota);
                        System.out.println("Vehiculo Toyota Ingresado");
                    }else if (modelo == 2){
                        Nissan nissan = new Nissan();
                        nissan.color = colour;
                        nissan.year = year;
                        nissan.precio = cantidad;
                        vehiculos.add(nissan);
                        System.out.println("Vehiculo Nissan Ingresado");
                    }else if(modelo == 3){
                        Honda honda = new Honda();
                        honda.color = colour;
                        honda.year = year;
                        honda.precio = cantidad;
                        vehiculos.add(honda);
                        System.out.println("Vehiculo Honda Ingresado");
                    }else if (modelo == 4) {
                        Ford ford = new Ford();
                        ford.color = colour;
                        ford.year = year;
                        ford.precio = cantidad;
                        vehiculos.add(ford);
                        System.out.println("Vehiculo Ford ingresado");
                    }else {
                        System.out.println("La Marca No Existe");
                    }
                    break;
                case 2:
                    if( vehiculos.isEmpty()) {
                        System.out.println("++++ No Hay Vehiculos Para Mostrar +++");
                    }else {
                        System.out.println("+++ Mostrando Vehiculos  +++");
                    }

                    for(Vehiculo c: vehiculos) {
                        if(c instanceof Toyota ) {
                            System.out.println("Modelo: Toyota");
                            System.out.println("Color:  "+c.color);
                            System.out.println("Año:  "+c.year);
                            System.out.println("Precio: $. "+c.precio+"\n");
                        }else if (c instanceof Nissan){
                            System.out.println("Modelo: Nissan");
                            System.out.println("Color:  "+c.color);
                            System.out.println("Año:  "+c.year);
                            System.out.println("Precio: $.  "+c.precio+"\n");
                        }
                    }
                    break;
                case 3:
                    System.out.println("ADIOS!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion No Validad");
            }
        }
    }
}