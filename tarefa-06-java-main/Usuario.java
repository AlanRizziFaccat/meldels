import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observer {
    private int id;
    private String nome;
    private String email;
    private List<Busca> historicoBuscas;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.historicoBuscas = new ArrayList<>();
    }

    public List<Busca> visualizarHistoricoBuscas() {
        if (historicoBuscas.isEmpty()) {
            System.out.println("Nenhuma busca realizada anteriormente.");
        } else {
            System.out.println("Histórico de Buscas:");
            for (Busca busca : historicoBuscas) {
                System.out.println("ID da Busca: " + busca.getId());
                System.out.println("Data da Busca: " + busca.getData());
                System.out.println("Filtros Utilizados: " + busca.getFiltros().toString());
                System.out.println("---------------------------");
            }
        }
        return historicoBuscas;
    }

    public void adicionarBuscaAoHistorico(Busca novaBusca) {
        if (novaBusca != null) {
            historicoBuscas.add(novaBusca);
        }
    }

    @Override
    public void atualizar(Busca busca) {
        System.out.println("Nova busca adicionada: " + busca.toString());
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Busca> getHistoricoBuscas() {
        return historicoBuscas;
    }

    public void setHistoricoBuscas(List<Busca> historicoBuscas) {
        this.historicoBuscas = historicoBuscas;
    }
}