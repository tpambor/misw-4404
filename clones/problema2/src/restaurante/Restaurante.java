package restaurante;

import java.util.ArrayList;

public class Restaurante {
    private ArrayList<Producto> productos;
    private ListaPedidos pedidos;

    public Restaurante(ArrayList<Producto> productos, ListaPedidos pedidos) {
        this.productos = productos;
        this.pedidos = pedidos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void generarReporte() {
        System.out.println("------------------------");
        System.out.println("El total de ventas para el restaurante es: " + pedidos.calcularTotal());
        pedidos.generarReportes();
    }

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Hamburguesa", 100));
        productos.add(new Producto("Papas", 50));
        productos.add(new Producto("Refresco", 30));
        productos.add(new Producto("Helado", 20));

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan", "Calle 1", new ListaPedidos()));
        usuarios.add(new Usuario("Pedro", "Calle 2", new ListaPedidos()));

        ArrayList<Producto> productosPedido1 = new ArrayList<>();
        productosPedido1.add(productos.get(0));
        productosPedido1.add(productos.get(1));

        ArrayList<Producto> productosPedido2 = new ArrayList<>();
        productosPedido2.add(productos.get(2));
        productosPedido2.add(productos.get(3));

        ArrayList<Producto> productosPedido3 = new ArrayList<>();
        productosPedido3.add(productos.get(0));
        productosPedido3.add(productos.get(1));
        productosPedido3.add(productos.get(2));

        ListaPedidos pedidos = new ListaPedidos();
        pedidos.add(new Pedido(usuarios.get(0), productosPedido1));
        pedidos.add(new Pedido(usuarios.get(0), productosPedido2));
        pedidos.add(new Pedido(usuarios.get(1), productosPedido3));

        ListaPedidos pedidosUsuario1 = new ListaPedidos();
        pedidosUsuario1.add(pedidos.get(0));
        pedidosUsuario1.add(pedidos.get(1));

        ListaPedidos pedidosUsuario2 = new ListaPedidos();
        pedidosUsuario2.add(pedidos.get(2));

        usuarios.get(0).setPedidos(pedidosUsuario1);
        usuarios.get(1).setPedidos(pedidosUsuario2);

        Restaurante restaurante = new Restaurante(productos, pedidos);

        restaurante.generarReporte();
        usuarios.get(0).generarReporte();
        usuarios.get(1).generarReporte();
    }
}
