package model;

import java.util.ArrayList;

public class Aluguel {
    private String data;
    private Cliente cliente;
    private ArrayList<Horario> horarios;
    private double valorTotal;

    public Aluguel(String data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
        this.horarios = new ArrayList<>();
        this.valorTotal = 0;
    }

    public void adicionarHorario(Horario horario) {
        horarios.add(horario);
        valorTotal += horario.getValor();
    }

    public String getData() {
        return data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }
}