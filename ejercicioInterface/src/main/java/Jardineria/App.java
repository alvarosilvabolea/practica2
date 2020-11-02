package Jardineria;

import java.util.Calendar;

import Jardineria.ModelClass.cliente;
import Jardineria.ModelClass.pedido;
import Jardineria.ModelClassDao.Dao;
import Jardineria.ModelClassDao.clienteDao;
import Jardineria.ModelClassDao.pedidosDao;
import Jardineria.PatronBuilder.BuilderCliente;
import Jardineria.PatronBuilder.BuilderPedido;

public class App {

    private static Dao<cliente> clientesDao;
    private static Dao<pedido> pedidosDao;

    public static void main(String[] args) {
        clientesDao = new clienteDao();
        pedidosDao = new pedidosDao(clientesDao);

        try {
            clientesDao.save(new BuilderCliente(69, "Dario", "zaragoza", 696969696, 69.69, "9669p").Buildeo());
        } catch (Exception e) {
            System.out.println("Has intentado meter uno duplicado, vuelvelo a hacer");

        }

        try {
            Calendar millegada = Calendar.getInstance();
            millegada.add(Calendar.DAY_OF_MONTH, 40);

            pedidosDao.save(
                    new BuilderPedido(1, 12, Calendar.getInstance(), millegada, "estado", "comentarios").Buildeo());
        } catch (Exception e) {
            System.out.println("Has intentado meter uno duplicado, vuelvelo a hacer");

        }

    }

}
