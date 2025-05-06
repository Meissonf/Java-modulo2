public class ReproductorMusica {
    private String estadoAnimo;

    public ReproductorMusica(String estadoAnimo){
        this.estadoAnimo = estadoAnimo;
    }

    public void reproducirRecomendacion(){
        if(estadoAnimo.equals("feliz")){
            System.out.println("Te recomendamos: 'Happy' de REM");
        }
        else if(estadoAnimo.equals("triste")){
            System.out.println("te recomendamos: 'Creed' de Radiohead");
        }
        else if(estadoAnimo.equals("enfocado")){
            System.out.println("Te recomendamos: 'Lo-Fi' Beats para estudiar");
        }
        else if(estadoAnimo.equals("entusado")){
            System.out.println("Te recomendamos: 'Don´t speak' de No doubt");
        }
        else{
            System.out.println("No hay recomendaciones para este estado de ánimo");
        }
    }
}
