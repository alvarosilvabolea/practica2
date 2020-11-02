package Jardineria.ModelClass;


public class cliente {

    private int codigo_cliente;
    private String nombre_cliente;
    private String domicilio;
    private int telefono;
    private double limite_credit;
    private String codigo_empleado_rep_ventas;

    public cliente(int codigo_cliente, String nombre_cliente, String domicilio, int telefono, double limite_credit,
            String codigo_empleado_rep_ventas) {
        this.codigo_cliente = codigo_cliente;
        this.nombre_cliente = nombre_cliente;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.limite_credit = limite_credit;
        this.codigo_empleado_rep_ventas = codigo_empleado_rep_ventas;
    }

    public int getCodigo_cliente() {
        return codigo_cliente;
    }

    public void setCodigo_cliente(int codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getLimite_credit() {
        return limite_credit;
    }

    public void setLimite_credit(double limite_credit) {
        this.limite_credit = limite_credit;
    }

    public String getCodigo_empleado_rep_ventas() {
        return codigo_empleado_rep_ventas;
    }

    public void setCodigo_empleado_rep_ventas(String codigo_empleado_rep_ventas) {
        this.codigo_empleado_rep_ventas = codigo_empleado_rep_ventas;
    }

    

   

}
