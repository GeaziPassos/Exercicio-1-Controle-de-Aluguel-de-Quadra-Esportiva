package service;

import model.Cliente;

public class ClienteService {

    public Cliente cadastrar(String nome, String telefone) {
        if (nome.isEmpty()) {
            System.out.println("Nome inválido.");
            return null;
        }

        return new Cliente(nome, telefone);
    }
}