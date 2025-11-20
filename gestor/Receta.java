package gestor;

import java.util.HashMap;
import java.util.Map;

public class Receta {
    public String nombre;
    //mismo caso, las estructuras de datos pueden cambiar
    public Map<Insumo, Double> insumosNecesarios = new HashMap<>();
     
    //métodos propios
    public void agregarInsumo(){

    }
    public void calcularInsumosPara(int cantidadProductos){
        //debería retornar un mapa
    }
    public boolean verificarDisponibilidad(Inventario inventario, int cantidadProductos){
        return true;
    }
}
