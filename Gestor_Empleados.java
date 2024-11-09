/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestionempleados;

/**
 *
 * @author PC
 */
import java.util.ArrayList;
import java.util.List;

public class Gestor_Empleados {
    private final List<empleado> empleados;

    public Gestor_Empleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (empleado empleado : empleados) {
                empleado.imprimirInformacion();
            }
        }
    }
}