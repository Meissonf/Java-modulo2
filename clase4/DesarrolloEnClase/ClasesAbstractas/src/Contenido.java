abstract class Contenido {
    String autor;
    int likes;

    // Constructor
    public Contenido(String autor) {
        this.autor = autor;
        this.likes = 0;
    }

    public abstract void reproducir();
}
