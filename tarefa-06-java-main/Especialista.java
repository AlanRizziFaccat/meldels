import java.util.List;

public class Especialista {
    private int id;
    private String nome;
    private String especialidade;
    private String localizacao;
    private float preco;
    private List<Avaliacao> avaliacoes;

    public Especialista(int id, String nome, String especialidade, String localizacao, float preco, List<Avaliacao> avaliacoes) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
        this.localizacao = localizacao;
        this.preco = preco;
        this.avaliacoes = avaliacoes;
    }

    public EspecialistaDetalhe visualizaDetalhes() {
        EspecialistaDetalhe detalhes = new EspecialistaDetalhe();
        detalhes.setNome(this.nome);
        detalhes.setEspecialidade(this.especialidade);
        detalhes.setEndereco(this.localizacao);
        detalhes.setPreco(this.preco);
        detalhes.setAvaliacoes(this.avaliacoes);
        detalhes.setHorario("08:00 - 18:00");
        detalhes.setMapa("Link do Mapa Simulado");
        return detalhes;
    }

    public float calcularMediaAvaliacoes() {
        if (avaliacoes == null || avaliacoes.isEmpty()) {
            return 0;
        }

        int somaNotas = 0;
        for (Avaliacao avaliacao : avaliacoes) {
            somaNotas += avaliacao.getNota();
        }
        return (float) somaNotas / avaliacoes.size();
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
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

    public String getDescricao() {
        return "Especialista: " + nome + ", Especialidade: " + especialidade + ", Localização: " + localizacao + ", Preço: " + preco;
    }
}