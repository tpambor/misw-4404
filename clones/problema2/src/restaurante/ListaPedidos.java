package restaurante;

import java.util.ArrayList;
import java.util.Collections;

public class ListaPedidos extends ArrayList<Pedido> {
    public ListaPedidos() {
        super();
    }
    
    public ListaPedidos(ArrayList<Pedido> pedidos) {
        super(pedidos);
    }

    public int calcularTotal() {
        int total = 0;
        for (Pedido pedido : this) {
            total += pedido.calcularTotal();
        }
        return total;
    }

    private ArrayList<Pedido> ordenarPedidosPorPrecio() {
        ArrayList<Pedido> pedidosOrdenados = new ArrayList<>();
        for (Pedido pedido : this) {
            pedidosOrdenados.add(pedido);
        }
        for (int i = 0; i < pedidosOrdenados.size(); i++) {
            for (int j = 0; j < pedidosOrdenados.size() - 1; j++) {
                if (pedidosOrdenados.get(j).calcularTotal() > pedidosOrdenados.get(j + 1).calcularTotal()) {
                    Pedido aux = pedidosOrdenados.get(j);
                    pedidosOrdenados.set(j, pedidosOrdenados.get(j + 1));
                    pedidosOrdenados.set(j + 1, aux);
                }
            }
        }
        Collections.reverse(pedidosOrdenados);
        return pedidosOrdenados;
    }

    public void generarReportes() {
        ArrayList<Pedido> pedidosOrdenados = this.ordenarPedidosPorPrecio();
        for(Pedido pedido : pedidosOrdenados) {
            pedido.generarReporte();
        }
    }
}
