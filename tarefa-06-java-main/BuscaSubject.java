import java.util.ArrayList;
import java.util.List;

public class BuscaSubject {
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservers(Busca busca) {
        for (Observer observer : observers) {
            observer.atualizar(busca);
        }
    }
}