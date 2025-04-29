import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private String direccion;
    private List<Mesa> mesas;
    private Menu menu;

    public Restaurante(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.mesas = new ArrayList<>();
        this.menu = new Menu();
    }

    public void agregarMesa(Mesa mesa){
        mesas.add(mesa);   
    }

    public Menu getMenu(){
        return menu;
    }


}
