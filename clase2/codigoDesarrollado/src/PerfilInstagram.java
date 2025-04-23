public class PerfilInstagram {

    //atributos
    private String nombreUsuario;
    private int seguidores;
    private boolean cuentaPrivada;

    //Constructor
    public PerfilInstagram(String nombreUsuarioEnviado){
        
        nombreUsuario = nombreUsuarioEnviado;
        seguidores = 0; //método seguir();
        cuentaPrivada = false;
    }
    //métodos - getters
    public String getNombreUsuario(){ //es sencilla la función de ete método get.
        return nombreUsuario;
    }

    public int getSeguidores(){
        return seguidores;   
    }

    public boolean getCuentaprivada(){
      
        return cuentaPrivada;
    }

    public int seguir(){
        //seguidores = seguidores + 1;
         return seguidores++;
    }

    public int dejarSeguir(){
        if(seguidores > 0){
            seguidores--;
        }
        return seguidores; 
    }

    public void cambiarPrivacidad(){
       cuentaPrivada =! cuentaPrivada;//lo que esté en cuentaPrivada cambielo.
    }

}
