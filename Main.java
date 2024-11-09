/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionempleados;

/**
 *
 * @author PC
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gestor_Empleados gestor = new Gestor_Empleados();

        while (true) {
            
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            System.out.println("Seleccione alguna opcion:");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); 

                    empleado nuevoEmpleado = new empleado(nombre, edad, salario);
                    gestor.agregarEmpleado(nuevoEmpleado);
                    System.out.println("Empleado agregado exitosamente.");
                }

                case 2 -> gestor.mostrarEmpleados();

                case 3 -> {
                    System.out.println("Saliendo del sistema......");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}