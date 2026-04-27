package com.tienda.pedido;


import com.tienda.cliente.Cliente;

public class Pedido {
    private Cliente cliente;
    private String producto;
    private int cantidad;

    public Pedido() {
    }

    public Pedido(Cliente cliente, String producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarDetalle() {
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
    }
}