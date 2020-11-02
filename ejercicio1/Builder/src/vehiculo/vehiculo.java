package vehiculo;

public class vehiculo {

    public String marca;
    public int ruedas;
    public int asientos;
    public String matricula = "";
    public int caballos_potencia;
    public float peso;
    public float precio;

    public vehiculo(String marca, int ruedas, int asientos, String matricula, int caballos_potencia, float peso,
            float precio) {
        this.marca = marca;
        this.ruedas = ruedas;
        this.asientos = asientos;
        this.matricula = matricula;
        this.caballos_potencia = caballos_potencia;
        this.peso = peso;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCaballos_potencia() {
        return caballos_potencia;
    }

    public void setCaballos_potencia(int caballos_potencia) {
        this.caballos_potencia = caballos_potencia;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /*
     * @Override public String toString() { return "vehiculo [asientos=" + asientos
     * + ", caballos_potencia=" + caballos_potencia + ", marca=" + marca +
     * ", matricula=" + matricula + ", peso=" + peso + ", precio=" + precio +
     * ", ruedas=" + ruedas + "]"; }
     */

}
