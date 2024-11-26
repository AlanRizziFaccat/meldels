public class AvaliacaoDecorator extends EspecialistaDecorator {
    private Avaliacao avaliacao;

    public AvaliacaoDecorator(Especialista especialista, Avaliacao avaliacao) {
        super(especialista);
        this.avaliacao = avaliacao;
    }

    @Override
    public String getDescricao() {
        return especialista.getDescricao() + ", Avaliação: " + avaliacao.getNota() + " - " + avaliacao.getComentario();
    }
}