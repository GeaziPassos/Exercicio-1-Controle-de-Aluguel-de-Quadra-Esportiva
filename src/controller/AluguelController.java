package controller;

import model.Cliente;
import model.Horario;
import service.AluguelService;

public class AluguelController {

    private AluguelService service = new AluguelService();

    public void registrar(String data, Cliente cliente, Horario horario) {
        service.registrar(data, cliente, horario);
    }

    public void consultar(String data) {
        service.consultarPorData(data);
    }
}