package Jardineria.PatronBuilder;

import Jardineria.ModelClass.pedido;
import java.util.*;

public class BuilderPedido {
    pedido pedido;

    public BuilderPedido(int codigo_pedido, int codigo_pedido_cliente, Calendar fecha_pedido, Calendar fecha_entrega, String estado,
    String comentarios) {

            pedido = new pedido(codigo_pedido, codigo_pedido_cliente, fecha_pedido, fecha_entrega, estado, comentarios);

    }

    public pedido Buildeo() {

        if (pedido.getCodigo_pedido()==0) {
            System.out.println("añade un nuevo codigo al pedido");
            
            return null;
            
        }
        

        Calendar diasminimos = (Calendar) pedido.getFecha_entrega().clone();
        diasminimos.add(Calendar.DAY_OF_MONTH, -3);

        if (pedido.getFecha_entrega().after(diasminimos)) {
            
        }
        return pedido;

    }

}
