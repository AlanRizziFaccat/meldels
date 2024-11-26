import java.util.Date;
import java.util.List;

public class TesteUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "João Silva", "joao.silva@email.com");

        FiltroDeBusca filtro1 = FiltroDeBuscaFactory.criarFiltro("Cardiologista", "Centro", 10.0f, "Disponível", "Consulta");
        FiltroDeBusca filtro2 = FiltroDeBuscaFactory.criarFiltro("Dermatologista", "Zona Sul", 15.0f, "Indisponível", "Tratamento");

        Busca busca1 = BuscaFactory.criarBusca(1, new Date(), filtro1);
        Busca busca2 = BuscaFactory.criarBusca(2, new Date(), filtro2);

        usuario.adicionarBuscaAoHistorico(busca1);
        usuario.adicionarBuscaAoHistorico(busca2);

        System.out.println("---- Teste: Visualizar Histórico de Buscas ----");
        List<Busca> historico = usuario.visualizarHistoricoBuscas();

        if (!historico.isEmpty()) {
            System.out.println("Histórico contém " + historico.size() + " busca(s).");
        } else {
            System.out.println("Histórico está vazio.");
        }
    }
}