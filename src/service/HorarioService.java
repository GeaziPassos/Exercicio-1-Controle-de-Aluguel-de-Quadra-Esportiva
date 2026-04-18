package service;

import model.Horario;

public class HorarioService {

    public Horario cadastrar(String descricao, double valor) {
        if (valor < 0) {
            System.out.println("Valor inválido.");
            return null;
        }

        return new Horario(descricao, valor);
    }
}