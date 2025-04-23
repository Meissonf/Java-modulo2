public class App {
    
    
    public static void main(String[] args) throws Exception {
          PerfilInstagram perfil1 = new PerfilInstagram( "Alen1238");
          perfil1.getNombreUsuario();
          perfil1.seguir();
          perfil1.dejarSeguir();
          perfil1.cambiarPrivacidad();
          perfil1.seguir();//Alguien presionó el botón seguir a perfil1 

        
          PerfilInstagram perfil3 = new PerfilInstagram("Daniela12_gamer");
    }



}
