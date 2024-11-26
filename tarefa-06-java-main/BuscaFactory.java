import java.util.Date;

public class BuscaFactory {
    public static Busca criarBusca(int id, Date data, FiltroDeBusca filtros) {
        Busca busca = new Busca();
        busca.setId(id);
        busca.setData(data);
        busca.setFiltros(filtros);
        return busca;
    }
}