package gestor;

public class Producto {
    private String nombre;
    private double costoElaboracion;
    private double precioVenta;
    private double margenGanancia;
    private Receta receta;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
