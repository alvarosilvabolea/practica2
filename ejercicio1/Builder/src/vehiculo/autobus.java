package vehiculo;

public class autobus {

    public int pasajeros;
    public String compagnia;
    public String tipo_bus;

    public autobus(int pasajeros, String compagnia, String tipo_bus) {
        this.pasajeros = pasajeros;
        this.compagnia = compagnia;
        this.tipo_bus = tipo_bus;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getcompagnia() {
        return compagnia;
    }

    public void setCompagnia(String compagnia) {
        this.compagnia = compagnia;
    }

    public String getTipo_bus() {
        return tipo_bus;
    }

    public void setTipo_bus(String tipo_bus) {
        this.tipo_bus = tipo_bus;
    }

    @Override
    public String toString() {
        return "autobus [compagnia=" + compagnia + ", pasajeros=" + pasajeros + ", tipo_bus=" + tipo_bus + "]";
    }

    

    
    
}
