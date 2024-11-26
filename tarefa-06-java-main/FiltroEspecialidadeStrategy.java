public class FiltroEspecialidadeStrategy implements FiltroStrategy {
    @Override
    public boolean filtrar(Especialista especialista, FiltroDeBusca filtros) {
        return especialista.getEspecialidade().equalsIgnoreCase(filtros.getEspecialidade());
    }
}