package production;

public class Cajero {
    private Inventario inventario;

    public Cajero() {
        this.inventario = new Inventario();
    }

    public void procesarTransaccion(Carrito carrito) {
        double precio = this.calcularPrecio(carrito);
        System.out.println("El precio total es: " + precio);

        for (String producto : carrito.darProductos()) {
            inventario.eliminarProducto(producto);
        }
    }

    public double calcularPrecio(Carrito carrito) {
        double precio = 0;
        for (String producto : carrito.darProductos()) {
            precio += inventario.darProducto(producto).darPrecio();
        }
        return precio;
    }

    public static void main(String[] args) {
        Cajero cajero = new Cajero();
        Carrito carrito = new Carrito();

        carrito.agregarProducto("Producto 1");
        carrito.agregarProducto("Producto 2");

        cajero.procesarTransaccion(carrito);
    }
}
