public class App {
    public static void main(String[] args) throws Exception {
       /*
        * Recomendador de canciones según el estado de ánimo
       */
       
        ReproductorMusica reproductor = new ReproductorMusica("rebeldeb");
        reproductor.reproducirRecomendacion();
    }
}
