import java.util.ArrayList;

public class Aluguel {
    String data;
    Cliente cliente;
    ArrayList<Horario> horarios;
    double valorTotal;

    public Aluguel(String data, Cliente cliente) {
        this.data = data;
        this.cliente = cliente;
        this.horarios = new ArrayList<>();
        this.valorTotal = 0;
    }

    public void adicionarHorario(Horario horario) {
        horarios.add(horario);
        valorTotal += horario.valor;
    }
}