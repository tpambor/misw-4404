package restaurante;

public class Usuario {
    private String nombre;
    private String direccion;
    private ListaPedidos pedidos;

    public Usuario(String nombre, String direccion, ListaPedidos pedidos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pedidos = pedidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ListaPedidos getPedidos() {
        return pedidos;
    }

    public void setPedidos(ListaPedidos pedidos) {
        this.pedidos = pedidos;
    }

    public void generarReporte() {
        System.out.println("------------------------");
        System.out.println("El total de compras para " + nombre + " es: " + pedidos.calcularTotal());
        pedidos.generarReportes();
    }
}
