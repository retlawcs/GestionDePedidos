package business;

import data.Pedido;

interface PedidoCreador {
    void crearPedido(Pedido pedido);
}

interface PedidoValidador {
    boolean validarPedido(Pedido pedido);
}

interface PedidoActualizador {
    void actualizarPedido(Pedido pedido, int nuevaCantidad);
}

interface PedidoObserver {
    void onPedidoCreado(Pedido pedido);
}