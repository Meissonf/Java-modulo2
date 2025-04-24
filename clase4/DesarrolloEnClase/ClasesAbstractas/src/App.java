public class App {
    public static void main(String[] args) throws Exception {
       
       Contenido c = new Live();
       c.reproducir();
      
      
       c = new Video();
       c.reproducir();

       Live live =  new Contenido();
    }
}
