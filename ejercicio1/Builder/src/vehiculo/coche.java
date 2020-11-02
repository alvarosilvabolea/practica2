package vehiculo;

public class coche extends vehiculo {

    public String modelo = "";
    public String tipo_coche = "";
    public String tipo_motor = "";

    public coche(String marca, int ruedas, int asientos, String matricula, int caballos_potencia, float peso,
            float precio, String modelo, String tipo_coche, String tipo_motor) {
        super(marca, ruedas, asientos, matricula, caballos_potencia, peso, precio);
        this.modelo = modelo;
        this.tipo_coche = tipo_coche;
        this.tipo_motor = tipo_motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo_coche() {
        return tipo_coche;
    }

    public void setTipo_coche(String tipo_coche) {
        this.tipo_coche = tipo_coche;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    @Override
    public String toString() {
        return "coche [modelo=" + modelo + ", tipo_coche=" + tipo_coche + ", tipo_motor=" + tipo_motor
                + ", caballos_potencia=" + caballos_potencia + ", precio=" + precio + "]";
    }

}
