package com.tienda;

import com.tienda.cliente.Cliente;
import com.tienda.tienda.Tienda;
import com.tienda.pedido.Pedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Tienda tienda = new Tienda();
        Pedido pedido = new Pedido();
        Scanner entrada = new Scanner(System.in);
        String opc, pantalla = "1. Agregar Cliente\n2.Agregar Pedido\n3.Ver Pedido\n4.Salir\nIngrese una opción: ", datos;
        int cantidad = 0;
        do {
            System.out.println(pantalla);
            opc = entrada.nextLine();

            switch (opc) {
                case "1" -> {
                    System.out.println("Ingrese el nombre del cliente: ");
                    datos = entrada.nextLine();
                    if (datos != null && !datos.isBlank()) {
                        cliente.setNombre(datos);
                    } else {
                        System.out.println("ERROR. Campo vacío. Intente Nuevamente.");
                    }
                }

                case "2" -> {
                    tienda.setCliente(cliente);
                    pedido.setCliente(cliente);
                    System.out.println("Ingrese el nombre del producto: ");
                    datos = entrada.nextLine();
                    if (datos != null && !datos.isBlank()) {
                        pedido.setProducto(datos);
                    }
                    System.out.println("Ingrese el cantidad del producto: ");
                    try {
                        cantidad = Integer.parseInt(entrada.nextLine());
                        if (cantidad > 0)
                            pedido.setCantidad(cantidad);
                        else {
                            System.out.println("ERROR. Cantidad invalida. Intente Nuevamente.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ERROR. Ingrese un número entero valido.");
                    }
                }

                case "3" -> {
                    System.out.println("=".repeat(3) + "FACTURA" + "=".repeat(3));
                    cliente.realizarPedido(tienda, pedido.getProducto(), pedido.getCantidad());
                    System.out.println("Pedido procesado correctamente!");
                    System.out.println("=".repeat(9));
                }

                case "4" -> {
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                }

                default -> {
                    System.out.println("Ingrese una opcion valida. Intente nuevamente.");
                }

            }

        } while (!opc.equals("4"));
        entrada.close();

    }
}
