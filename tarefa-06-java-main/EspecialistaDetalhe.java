import java.util.List;

public class EspecialistaDetalhe {
    private String nome;
    private String especialidade;
    private String endereco;
    private String mapa;
    private String horario;
    private float preco;
    private List<Avaliacao> avaliacoes;

    public void exibirMapaLocalizacao() {
        if (mapa != null && !mapa.isEmpty()) {
            System.out.println("Mapa de Localização: " + mapa);
        } else {
            System.out.println("Mapa de localização não disponível.");
        }
    }

    public String getHorariosDisponiveis() {
        if (horario != null && !horario.isEmpty()) {
            return "Horários Disponíveis: " + horario;
        } else {
            return "Horário não disponível.";
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}