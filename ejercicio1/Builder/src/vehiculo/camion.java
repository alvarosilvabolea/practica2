package vehiculo;

public class camion extends vehiculo {

    private String modelo_camion;
    private float carga_max;
    private float carga_min;

    public camion(String marca, int ruedas, int asientos, String matricula, int caballos_potencia, float peso,
            float precio, String modelo_camion, float carga_max, float carga_min) {
        super(marca, ruedas, asientos, matricula, caballos_potencia, peso, precio);
        this.modelo_camion = modelo_camion;
        this.carga_max = carga_max;
        this.carga_min = carga_min;
    }

    public String getModelo_camion() {
        return modelo_camion;
    }

    public void setModelo_camion(String modelo_camion) {
        this.modelo_camion = modelo_camion;
    }

    public float getCarga_max() {
        return carga_max;
    }

    public void setCarga_max(float carga_max) {
        this.carga_max = carga_max;
    }

    public float getCarga_min() {
        return carga_min;
    }

    public void setCarga_min(float carga_min) {
        this.carga_min = carga_min;
    }

    
    

    
    

    

}
