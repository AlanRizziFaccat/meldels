import java.util.ArrayList;
import java.util.List;

public class ResultadoBusca {
    private int id;
    private List<Especialista> listaEspecialistas;

    // Implementação da função filtrarResultados
    public List<Especialista> filtrarResultados(FiltroDeBusca filtros) {
        List<Especialista> especialistasFiltrados = new ArrayList<>();

        for (Especialista especialista : listaEspecialistas) {
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

    public List<Especialista> getListaEspecialistas() {
        return listaEspecialistas;
    }

    public void setListaEspecialistas(List<Especialista> listaEspecialistas) {
        this.listaEspecialistas = listaEspecialistas;
    }
}