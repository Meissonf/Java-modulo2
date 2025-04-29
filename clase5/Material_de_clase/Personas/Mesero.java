public class Mesero extends Empleado{


    public Mesero(String nombre, int idEmpleado){
        super(nombre, idEmpleado);
    }

    public Orden tomarOrden(Cliente cliente){ // Orden miOrden = mesero1.tomarOrden(cliente1);
        return new Orden(cliente, this);
    }

    
}
