package Jardineria.ModelClass;

import java.util.*;

public class pedido {

    private int codigo_pedido;
    private int codigo_pedido_cliente;
    private Calendar fecha_pedido;
    private Calendar fecha_entrega;
    private String estado;
    private String comentarios;

    public pedido(int codigo_pedido, int codigo_pedido_cliente, Calendar fecha_pedido, Calendar fecha_entrega, String estado,
            String comentarios) {
        this.codigo_pedido = codigo_pedido;
        this.codigo_pedido_cliente = codigo_pedido_cliente;
        this.fecha_pedido = fecha_pedido;
        this.fecha_entrega = fecha_entrega;
        this.estado = estado;
        this.comentarios = comentarios;
    }

    public int getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(int codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public int getCodigo_pedido_cliente() {
        return codigo_pedido_cliente;
    }

    public void setCodigo_pedido_cliente(int codigo_pedido_cliente) {
        this.codigo_pedido_cliente = codigo_pedido_cliente;
    }

    public Calendar getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Calendar fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public Calendar getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Calendar fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

}
