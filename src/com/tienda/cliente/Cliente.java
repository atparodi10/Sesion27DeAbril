package com.tienda.cliente;
import com.tienda.tienda.Tienda;

public class Cliente {
     private String nombre;

    public Cliente() {
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void realizarPedido(Tienda tienda, String producto, int cantidad) {
        tienda.procesarPedido(this, producto, cantidad);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}