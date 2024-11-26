import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto Usuario
        Usuario usuario = new Usuario(1, "João Silva", "joao.silva@email.com");

        // Criação de um objeto BuscaSubject
        BuscaSubject buscaSubject = new BuscaSubject();

        // Adiciona o usuário como observador
        buscaSubject.adicionarObserver(usuario);

        // Criação de alguns objetos FiltroDeBusca para teste
        FiltroDeBusca filtro1 = FiltroDeBuscaFactory.criarFiltro("Cardiologista", "Centro", 10.0f, "Disponível", "Consulta");
        FiltroDeBusca filtro2 = FiltroDeBuscaFactory.criarFiltro("Dermatologista", "Zona Sul", 15.0f, "Indisponível", "Tratamento");

        // Criação de objetos Busca para teste
        Busca busca1 = BuscaFactory.criarBusca(1, new Date(), filtro1);
        Busca busca2 = BuscaFactory.criarBusca(2, new Date(), filtro2);

        // Processa as buscas
        ResultadoBusca resultado1 = busca1.processarBusca(filtro1);
        ResultadoBusca resultado2 = busca2.processarBusca(filtro2);

        // Exibe os resultados das buscas
        System.out.println("---- Resultado da Busca 1 ----");
        for (Especialista especialista : resultado1.getListaEspecialistas()) {
            System.out.println(especialista.getDescricao());
        }

        System.out.println("---- Resultado da Busca 2 ----");
        for (Especialista especialista : resultado2.getListaEspecialistas()) {
            System.out.println(especialista.getDescricao());
        }

        // Adiciona as buscas ao histórico do usuário
        usuario.adicionarBuscaAoHistorico(busca1);
        usuario.adicionarBuscaAoHistorico(busca2);

        // Notifica os observadores sobre as novas buscas
        buscaSubject.notificarObservers(busca1);
        buscaSubject.notificarObservers(busca2);

        // Testa a visualização do histórico de buscas
        System.out.println("---- Teste: Visualizar Histórico de Buscas ----");
        usuario.visualizarHistoricoBuscas();
    }
}