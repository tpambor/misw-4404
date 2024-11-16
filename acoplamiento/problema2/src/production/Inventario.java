package production;

import java.util.HashMap;

public class Inventario {
    private HashMap<String, Producto> productos;

    public Inventario(){
        this.productos = new HashMap<String, Producto>();

        this.loadData();
    }

    private void loadData() {
        Producto producto1 = new Producto("Producto 1", 1000);
        Producto producto2 = new Producto("Producto 2", 2000);
        Producto producto3 = new Producto("Producto 3", 3000);

        this.agregarProducto(producto1);
        this.agregarProducto(producto2);
        this.agregarProducto(producto3);
    }

    private void agregarProducto(Producto producto) {
        this.productos.put(producto.darNombre(), producto);
    }

    public void eliminarProducto(String producto) {
        this.productos.remove(producto);
    }

    public Producto darProducto(String producto) {
        return this.productos.get(producto);
    }
}
