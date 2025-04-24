public class Video extends Contenido {
    int duracion;

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo video de " + autor + " con duración de " + duracion + " minutos");
    }
}
