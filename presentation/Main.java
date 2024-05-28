package presentation;

import data.Pedido;
import business.PedidoServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PedidoServicio pedidoServicio = new PedidoServicio();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos pedidos quieres hacer?");
        int numPedidos = scanner.nextInt();
        scanner.nextLine();  

        Pedido pedido = null;

        for (int i = 0; i < numPedidos; i++) {
            System.out.println("Ingrese el nombre del producto para el pedido " + (i + 1) + ":");
            String producto = scanner.nextLine();
            System.out.println("Ingrese la cantidad para el pedido " + (i + 1) + ":");
            int cantidad = scanner.nextInt();
            scanner.nextLine();  
            pedido = PedidoFactory.crearPedido(producto, cantidad);
            pedidoServicio.crearPedido(pedido);
        }

        Pedido.mostrarPedidos();

        System.out.println("¿Quieres modificar un pedido? (s/n)");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el nombre del producto del pedido que quieres modificar:");
            String producto = scanner.nextLine();
            System.out.println("Ingrese la nueva cantidad para el pedido:");
            int nuevaCantidad = scanner.nextInt();
            pedidoServicio.actualizarPedido(pedido, nuevaCantidad);
        }

        scanner.close();
    }
}