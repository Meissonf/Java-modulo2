import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numero;
    private int capacidad;
    private List<Orden> ordenes;   
    
    public Mesa(int numero, int capacidad){ // Mesa mesa1 = new Mesa(23, 6);
        this.numero = numero;
        this.capacidad = capacidad;
        this.ordenes = new ArrayList<>();//inicializa la lista vacía
    }

    public void agregarOrden(Orden orden){
        ordenes.add(orden);
    }
}
