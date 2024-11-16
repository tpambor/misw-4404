package production;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<String> productos;

    public Carrito(){
        this.productos = new ArrayList<String>();
    }

    public void agregarProducto(String producto) {
        this.productos.add(producto);
    }

    public String[] darProductos() {
        String[] productos = new String[this.productos.size()];
        return this.productos.toArray(productos);
    }
}
