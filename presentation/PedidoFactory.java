package presentation;
import data.Pedido;

public class PedidoFactory {
    public static Pedido crearPedido(String producto, int cantidad) {
        return new Pedido(producto, cantidad);
    }
}