package gestor;

import java.util.HashMap;
import java.util.Map;

public class Receta {
    public String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //mismo caso, las estructuras de datos pueden cambiar
    public Map<Insumo, Double> insumosNecesarios = new HashMap<>();
     
    //métodos propios
    public void agregarInsumo(Insumo insumo, double cantidadNecesaria){
        insumosNecesarios.put(insumo, cantidadNecesaria);
    }
    public Map<Insumo, Double> calcularInsumosPara(int cantidadProductos){
        Map<Insumo, Double> resultado = new HashMap<>();
        for(Map.Entry<Insumo, Double> entrada : insumosNecesarios.entrySet()){
            resultado.put(entrada.getKey(), cantidadProductos*entrada.getValue());
        }
        return resultado;
    }
    public boolean verificarDisponibilidad(Inventario inventario, int cantidadProductos){
        for(Insumo insumo : inventario.listaInsumos){
            if(!insumosNecesarios.containsKey(insumo)) return false;
            if(insumo.getCantidadDisponible() < insumosNecesarios.get(insumo)) return false;
        }
        return true;
    }
}
