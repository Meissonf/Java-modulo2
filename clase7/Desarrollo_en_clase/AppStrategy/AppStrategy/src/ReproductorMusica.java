public class ReproductorMusica {
    private EstrategiaRecomendacion estrategia;

    public ReproductorMusica(EstrategiaRecomendacion estrategia){
        this.estrategia = estrategia;
    }

    public void reproducirRecomendacion(){
        estrategia.recomendar();
    }
}
