public class Live extends Contenido {
    String anfitiron;

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo live de " + autor + " con anfitrion " + anfitiron);
    }
}
