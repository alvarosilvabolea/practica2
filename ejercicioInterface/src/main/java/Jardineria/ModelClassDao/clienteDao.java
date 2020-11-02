package Jardineria.ModelClassDao;

import java.util.*;

import Jardineria.ModelClass.cliente;

public class clienteDao implements Dao<cliente> {

    private List<cliente> clientes = new ArrayList<>();

    public clienteDao() {

        clientes.add(new cliente(1234, "nombre_cliente", "domicilio", 1200.7, "codigo_empleado_rep_ventas"));

    }

    @Override
    public Optional<cliente> get(long id) {
        return Optional.ofNullable(clientes.get((int) id));
    }

    @Override
    public List<cliente> getAll() {
        return clientes;
    }

    @Override
    public void save(cliente clients) {

        clientes.add(clients);
        

    }

    @Override
    public void update(cliente clients, String[] params) { //Consejo sobre setCodigo_cliente, etc.
        clients.setNombre_cliente(Objects.requireNonNull(params[0], "message"));

        //clients.setCodigo_cliente(Objects.requireNonNull(params[1],   ));

    }

    @Override
    public void delete(cliente clientes) {

        



    }

    

}
