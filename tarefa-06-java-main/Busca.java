import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Busca {
    private int id;
    private Date data;
    private FiltroDeBusca filtros;

    // Implementação do método processarBusca
    public ResultadoBusca processarBusca(FiltroDeBusca filtros) {
        this.data = new Date();
        this.filtros = filtros;

        // Simulação da lista de especialistas disponíveis (normalmente seria uma consulta a um banco de dados)
        List<Especialista> especialistasDisponiveis = new ArrayList<>();
        especialistasDisponiveis.add(new Especialista(1, "Dr. João", "Cardiologista", "Centro", 200.0f, new ArrayList<>()));
        especialistasDisponiveis.add(new Especialista(2, "Dra. Maria", "Dermatologista", "Zona Sul", 150.0f, new ArrayList<>()));

        ResultadoBusca resultado = new ResultadoBusca();
        resultado.setListaEspecialistas(especialistasDisponiveis);
        resultado.setListaEspecialistas(filtrarEspecialistas(filtros, especialistasDisponiveis));
        return resultado;
    }

    private List<Especialista> filtrarEspecialistas(FiltroDeBusca filtros, List<Especialista> especialistasDisponiveis) {
        List<Especialista> especialistasFiltrados = new ArrayList<>();

        for (Especialista especialista : especialistasDisponiveis) {
            boolean match = true;

            // Filtro de especialidade
            if (filtros.getEspecialidade() != null && !filtros.getEspecialidade().isEmpty()) {
                match &= especialista.getEspecialidade().equalsIgnoreCase(filtros.getEspecialidade());
            }

            // Filtro de localização
            if (filtros.getLocalizacao() != null && !filtros.getLocalizacao().isEmpty()) {
                match &= especialista.getLocalizacao().equalsIgnoreCase(filtros.getLocalizacao());
            }

            // Filtro de distância
            if (filtros.getDistancia() >= 0) {
                match &= calcularDistancia(especialista.getLocalizacao(), filtros.getLocalizacao()) <= filtros.getDistancia();
            }

            // Filtro de disponibilidade
            if (filtros.getDisponibilidade() != null && !filtros.getDisponibilidade().isEmpty()) {
                // Implementar lógica de disponibilidade se necessário
            }

            // Filtro de tipo de serviço
            if (filtros.getTipoServico() != null && !filtros.getTipoServico().isEmpty()) {
                match &= especialista.getEspecialidade().equalsIgnoreCase(filtros.getTipoServico());
            }

            if (match) {
                especialistasFiltrados.add(especialista);
            }
        }

        return especialistasFiltrados;
    }

    private float calcularDistancia(String localizacao1, String localizacao2) {
        // Implementar lógica de cálculo de distância
        // Exemplo simples: retornar uma distância fixa
        return 5.0f;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public FiltroDeBusca getFiltros() {
        return filtros;
    }

    public void setFiltros(FiltroDeBusca filtros) {
        this.filtros = filtros;
    }
}