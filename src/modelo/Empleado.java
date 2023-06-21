/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author guama
 */
public class Empleado {
    private int empleadoid;
    private String cargo;

    public Empleado(int empleadoid, String cargo) {
        this.empleadoid = empleadoid;
        this.cargo = cargo;
    }

    public int getEmpleadoid() {
        return empleadoid;
    }

    public void setEmpleadoid(int empleadoid) {
        this.empleadoid = empleadoid;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "empleadoid=" + empleadoid + ", cargo=" + cargo + '}';
    }
    
    
}
