public abstract class EspecialistaDecorator extends Especialista {
    protected Especialista especialista;

    public EspecialistaDecorator(Especialista especialista) {
        super(especialista.getId(), especialista.getNome(), especialista.getEspecialidade(), especialista.getLocalizacao(), especialista.getPreco(), especialista.getAvaliacoes());
        this.especialista = especialista;
    }

    public abstract String getDescricao();
}