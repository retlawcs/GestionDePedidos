package data;

import java.sql.SQLException;
import java.util.List;

public class Pedido {
    private String producto;
    private int cantidad;

    public Pedido(String producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }

    // Metodo para mostrar todos los pedidos de la base de datos
    public static void mostrarPedidos() {
        PedidoDAO dao = new PedidoDAO();
        try {
            List<Pedido> pedidos = dao.getTodosPedidos();
            for (Pedido pedido : pedidos) {
                System.out.println("Producto: " + pedido.getProducto() + ", Cantidad: " + pedido.getCantidad());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Metodo para insertar un pedido en la base de datos tomando como parametros el
    // producto y la cantidad
    public static void insertarPedido(String producto, int cantidad) {
        PedidoDAO dao = new PedidoDAO();
        Pedido pedido = new Pedido(producto, cantidad);
        try {
            dao.insertarPedido(pedido);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}