package gestor;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    /*
    Creo que para manejar los insumos sería más conveniente un mapa, o un set
    que permita que no se repitan los insumos que agreguemos
    */
    public List<Insumo> listaInsumos = new ArrayList<>();

    //métodos propios
    public void agregarInsumo(Insumo insumo){
        listaInsumos.add(insumo);
    }
    public void eliminarInsumo(String nombre){
        //descartar un insumo de la lista
        listaInsumos.remove(buscarInsumo(nombre));
    }
    public Insumo buscarInsumo(String nombre){
        for(Insumo insumo : listaInsumos)
            if(insumo.nombre.equals(nombre))
                return insumo;
        //hay que buscar un mejor caso de error
        return null;
    }
    public void actualizarStock(Insumo insumo, double cantidad){
        double diferencia = insumo.getCantidadDisponible() - cantidad;
        insumo.disminuirCantidad(diferencia);
        //creo que este método sería más útil con otro para settear la
        //lista de insumos
    }
    
}
