public class FiltroLocalizacaoStrategy implements FiltroStrategy {
    @Override
    public boolean filtrar(Especialista especialista, FiltroDeBusca filtros) {
        return especialista.getLocalizacao().equalsIgnoreCase(filtros.getLocalizacao());
    }
}