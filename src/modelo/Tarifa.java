/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author guama
 */
public class Tarifa {
    private int tarifaId;
    private float costoTarifa;
    private String tipoVehiculo;

    public Tarifa(int tarifaId, float costoTarifa, String tipoVehiculo) {
        this.tarifaId = tarifaId;
        this.costoTarifa = costoTarifa;
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getTarifaId() {
        return tarifaId;
    }

    public void setTarifaId(int tarifaId) {
        this.tarifaId = tarifaId;
    }

    public float getCostoTarifa() {
        return costoTarifa;
    }

    public void setCostoTarifa(float costoTarifa) {
        this.costoTarifa = costoTarifa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "Tarifa{" + "tarifaId=" + tarifaId + ", costoTarifa=" + costoTarifa + ", tipoVehiculo=" + tipoVehiculo + '}';
    }
    
    
}
