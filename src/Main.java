import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Aluguel> alugueis = new ArrayList<>();

        // Cadastro cliente
        Cliente cliente1 = null;

        if (!"João".isEmpty()) {
            cliente1 = new Cliente("João", "44999999999");
        }

        // Cadastro horários
        Horario h1 = null;
        Horario h2 = null;

        if (100 >= 0) {
            h1 = new Horario("18:00", 100);
        }

        if (100 >= 0) {
            h2 = new Horario("19:00", 100);
        }

        // Registrar aluguel
        String data = "10/04/2026";

        Aluguel aluguel = new Aluguel(data, cliente1);

        boolean ocupado = false;

        for (Aluguel a : alugueis) {
            if (a.data.equals(data)) {
                for (Horario h : a.horarios) {
                    if (h.descricao.equals(h1.descricao)) {
                        ocupado = true;
                    }
                }
            }
        }

        if (!ocupado) {
            aluguel.adicionarHorario(h1);
            aluguel.adicionarHorario(h2);
            alugueis.add(aluguel);
        } else {
            System.out.println("Horário ocupado.");
        }

        // Consultar por data
        for (Aluguel a : alugueis) {
            if (a.data.equals("10/04/2026")) {
                System.out.println("Cliente: " + a.cliente.nome);
                System.out.println("Total: R$ " + a.valorTotal);
                System.out.println("------------------");
            }
        }
    }
}