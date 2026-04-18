package service;

import model.Aluguel;
import model.Cliente;
import model.Horario;

import java.util.ArrayList;

public class AluguelService {

    private ArrayList<Aluguel> alugueis = new ArrayList<>();

    public void registrar(String data, Cliente cliente, Horario horario) {

        for (Aluguel a : alugueis) {
            if (a.getData().equals(data)) {
                for (Horario h : a.getHorarios()) {
                    if (h.getDescricao().equals(horario.getDescricao())) {
                        System.out.println("Horário já ocupado.");
                        return;
                    }
                }
            }
        }

        for (Aluguel a : alugueis) {
            if (a.getData().equals(data) &&
                    a.getCliente().getNome().equals(cliente.getNome())) {

                a.adicionarHorario(horario);
                return;
            }
        }

        Aluguel aluguel = new Aluguel(data, cliente);
        aluguel.adicionarHorario(horario);
        alugueis.add(aluguel);
    }

    public void consultarPorData(String data) {
        for (Aluguel a : alugueis) {
            if (a.getData().equals(data)) {
                System.out.println("Cliente: " + a.getCliente().getNome());
                System.out.println("Total: R$ " + a.getValorTotal());
                System.out.println("----------------");
            }
        }
    }
}