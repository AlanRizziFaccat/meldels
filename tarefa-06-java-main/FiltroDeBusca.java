public class FiltroDeBusca {
    private String especialidade;
    private String localizacao;
    private float distancia;
    private String disponibilidade;
    private String tipoServico;

    public FiltroDeBusca() {}

    public boolean validarFiltros() {
        if (especialidade == null || especialidade.trim().isEmpty()) {
            return false;
        }
        if (localizacao == null || localizacao.trim().isEmpty()) {
            return false;
        }
        if (distancia < 0) {
            return false;
        }
        if (disponibilidade == null || 
            (!disponibilidade.equalsIgnoreCase("disponível") && !disponibilidade.equalsIgnoreCase("indisponível"))) {
            return false;
        }
        if (tipoServico == null || tipoServico.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    public void definirFiltros(String especialidade, String localizacao, float distancia, String disponibilidade, String tipoServico) {
        this.especialidade = especialidade;
        this.localizacao = localizacao;
        this.distancia = distancia;
        this.disponibilidade = disponibilidade;
        this.tipoServico = tipoServico;
    }

    // Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    @Override
    public String toString() {
        return "Especialidade: " + especialidade + ", Localização: " + localizacao + ", Distância: " + distancia + ", Disponibilidade: " + disponibilidade + ", Tipo de Serviço: " + tipoServico;
    }
}