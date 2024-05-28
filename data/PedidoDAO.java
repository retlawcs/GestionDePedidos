package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PedidoDAO {
    private static final String URL = "jdbc:postgresql://localhost:5432/Pedido";
    private static final String USER = "postgres";
    private static final String PASSWORD = "8711wcs";

    public List<Pedido> getTodosPedidos() throws SQLException {
        List<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedido";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                pedidos.add(new Pedido(rs.getString("producto"), rs.getInt("cantidad")));
            }
        }
        
        return pedidos;
    }

    // Metodo para insertar un pedido en la base de datos
    public void insertarPedido(Pedido pedido) throws SQLException {
        String sql = "INSERT INTO pedido (producto, cantidad) VALUES (?, ?)";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, pedido.getProducto());
            stmt.setInt(2, pedido.getCantidad());
            stmt.executeUpdate();
        }
    }

    // Metodo para actualizar un pedido en la base de datos
    public void actualizarPedido(Pedido pedido, int nuevaCantidad) throws SQLException {
        String sql = "UPDATE pedido SET cantidad = ? WHERE producto = ?";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, nuevaCantidad);
            stmt.setString(2, pedido.getProducto());
            stmt.executeUpdate();
        }
    }
}