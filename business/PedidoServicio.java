package business;

import data.Pedido;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import data.PedidoDAO;

public class PedidoServicio implements PedidoCreador, PedidoValidador, PedidoActualizador {
    private List<Pedido> pedidos = new ArrayList<>();

    @Override
    public void crearPedido(Pedido pedido) {
        if (validarPedido(pedido)) {
            pedidos.add(pedido);
            PedidoDAO dao = new PedidoDAO();
            try {
                dao.insertarPedido(pedido);
            } catch (SQLException e) {
                e.printStackTrace();

            }
            System.out.println("Pedido de " + pedido.getCantidad() + " " + pedido.getProducto() + " creado.");
        } else {
            System.out.println("Pedido inválido.");
        }
    }

    @Override
    public boolean validarPedido(Pedido pedido) {
        return pedido.getCantidad() > 0;
    }

    @Override
    public void actualizarPedido(Pedido pedido, int nuevaCantidad) {
        if (pedidos.contains(pedido)) {
            pedido.setCantidad(nuevaCantidad);
            PedidoDAO dao = new PedidoDAO();
            try {
                dao.actualizarPedido(pedido, nuevaCantidad);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("Pedido de " + pedido.getProducto() + " actualizado a " + nuevaCantidad);
        } else {
            System.out.println("Pedido no encontrado.");
        }
    }
}