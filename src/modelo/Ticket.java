/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author guama
 */
public class Ticket {
    private int tarifaId;
    private float costoTarifa;
    
    private Date fecha,hora_entrada,hora_salida;

    public Ticket(int tarifaId, float costoTarifa, Date fecha, Date hora_entrada, Date hora_salida) {
        this.tarifaId = tarifaId;
        this.costoTarifa = costoTarifa;
        this.fecha = fecha;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Date hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public Date getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Date hora_salida) {
        this.hora_salida = hora_salida;
    }

    @Override
    public String toString() {
        return "Ticket{" + "tarifaId=" + tarifaId + ", costoTarifa=" + costoTarifa + ", fecha=" + fecha + ", hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + '}';
    }


    
    
}
