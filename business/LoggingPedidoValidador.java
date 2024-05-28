package business;
import data.Pedido;

class LoggingPedidoValidador implements PedidoValidador {
    private PedidoValidador wrapped;
 
 
    public LoggingPedidoValidador(PedidoValidador wrapped) {
        this.wrapped = wrapped;
    }
 
 
    @Override
    public boolean validarPedido(Pedido pedido) {
        boolean result = wrapped.validarPedido(pedido);
        System.out.println("Pedido de " + pedido.getProducto() + " validado: " + result);
        return result;
    }
 }
 
