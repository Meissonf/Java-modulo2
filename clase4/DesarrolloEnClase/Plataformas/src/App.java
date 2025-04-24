public class App {
    public static void main(String[] args) throws Exception {
        GestorDeContenido gestor = new GestorDeContenido();

        gestor.subirContenido(new TikTok());
        gestor.subirContenido(new YouTube());
        gestor.subirContenido(new Instagram());

    }
}
