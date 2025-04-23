import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        PerfilInstagram usuario1 = new PerfilInstagram("gamer1234");
        
    
    
    }
   
    public static void reproducirCancion(String nombre){
        System.out.println("Reproduciendo: " + nombre);
    }

    public static void reproducirCancionAleatoria(String[] playlist){
        Random random = new Random();
        int indiceAleatorio = random.nextInt(playlist.length);
        String cancionSeleccionada = playlist[indiceAleatorio];
        reproducirCancion(cancionSeleccionada);
    }

}
