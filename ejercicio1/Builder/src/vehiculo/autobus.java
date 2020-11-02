package vehiculo;

public class autobus {

    public int pasajeros;
    public String compañia;
    public String tipo_bus;

    public autobus(int pasajeros, String compañia, String tipo_bus) {
        this.pasajeros = pasajeros;
        this.compañia = compañia;
        this.tipo_bus = tipo_bus;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getTipo_bus() {
        return tipo_bus;
    }

    public void setTipo_bus(String tipo_bus) {
        this.tipo_bus = tipo_bus;
    }

    @Override
    public String toString() {
        return "autobus [compañia=" + compañia + ", pasajeros=" + pasajeros + ", tipo_bus=" + tipo_bus + "]";
    }

    

    
    
}
