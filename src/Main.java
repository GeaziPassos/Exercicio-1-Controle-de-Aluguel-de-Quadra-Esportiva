import controller.AluguelController;
import model.Cliente;
import model.Horario;
import service.ClienteService;
import service.HorarioService;

public class Main {

    public static void main(String[] args) {

        ClienteService clienteService = new ClienteService();
        HorarioService horarioService = new HorarioService();
        AluguelController controller = new AluguelController();

        Cliente c1 = clienteService.cadastrar("João", "44999999999");

        Horario h1 = horarioService.cadastrar("18:00", 100);
        Horario h2 = horarioService.cadastrar("19:00", 100);

        controller.registrar("10/04/2026", c1, h1);
        controller.registrar("10/04/2026", c1, h2);

        controller.registrar("10/04/2026", c1, h1);

        controller.consultar("10/04/2026");
    }
}