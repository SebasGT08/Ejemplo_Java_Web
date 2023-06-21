/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author guama
 */
public class Vehiculo {
    private int vehiculoId;
    private String placa;

    public Vehiculo(int vehiculoId, String placa) {
        this.vehiculoId = vehiculoId;
        this.placa = placa;
    }

    public int getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(int vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "vehiculoId=" + vehiculoId + ", placa=" + placa + '}';
    }
    
    
}
