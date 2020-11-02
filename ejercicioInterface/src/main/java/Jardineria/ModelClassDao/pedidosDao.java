package Jardineria.ModelClassDao;

import java.util.*;

import Jardineria.ModelClass.pedido;

public class pedidosDao implements Dao<pedido> {

    private List<pedido> pedidos = new ArrayList<>();

    public pedidosDao() {

        pedidos.add(new pedido(1111, 11112, , , "ahi va", "cuando llega?"));
    }

    @Override
    public Optional<pedido> get(long id) {
        
        return null;
    }

    @Override
    public List<pedido> getAll() {
        
        return null;
    }

    @Override
    public void save(pedido clientes) {
        

    }

    @Override
    public void update(pedido clientes, String[] params) {
       

    }

    @Override
    public void delete(pedido clientes) {
        

    }
    
}
