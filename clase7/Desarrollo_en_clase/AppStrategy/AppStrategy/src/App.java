public class App {
    public static void main(String[] args) throws Exception {
       RecomendacionFeliz feliz = new RecomendacionFeliz();
       RecomendacionTriste triste = new RecomendacionTriste();
        RecomendacionEntusado entusado = new RecomendacionEntusado();

       ReproductorMusica reproductor = new ReproductorMusica(triste); //recomendacion triste
       reproductor.reproducirRecomendacion();
       reproductor = new ReproductorMusica(feliz);
       reproductor.reproducirRecomendacion();

        reproductor = new ReproductorMusica(entusado);
        reproductor.reproducirRecomendacion();

    }
}
