/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author guama
 */
public class Cliente {
    private int clienteid;

    public Cliente(int clienteid) {
        this.clienteid = clienteid;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    @Override
    public String toString() {
        return "Cliente{" + "clienteid=" + clienteid + '}';
    }
    
    
}
