public class Avaliacao {
    private int id;
    private int nota;
    private String comentario;

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}