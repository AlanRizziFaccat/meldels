public class FiltroDeBuscaFactory {
    public static FiltroDeBusca criarFiltro(String especialidade, String localizacao, float distancia, String disponibilidade, String tipoServico) {
        FiltroDeBusca filtro = new FiltroDeBusca();
        filtro.definirFiltros(especialidade, localizacao, distancia, disponibilidade, tipoServico);
        return filtro;
    }
}