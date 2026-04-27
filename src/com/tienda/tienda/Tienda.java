package com.tienda.tienda;

import com.tienda.cliente.Cliente;
import com.tienda.pedido.Pedido;

public class Tienda {
    private Cliente cliente;

    public Tienda() {
    }

    public Tienda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void procesarPedido(Cliente cliente, String producto, int cantidad) {
        Pedido pedido = new Pedido(cliente, producto, cantidad);
        pedido.mostrarDetalle();
    }

}

