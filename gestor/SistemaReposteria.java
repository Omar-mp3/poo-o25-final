package gestor;

import java.util.ArrayList;
import java.util.List;

public class SistemaReposteria {
    public Inventario inventario;
    public List<Producto> listaProductos = new ArrayList<>();
    public List<Receta> listaRecetas = new ArrayList<>();

    public void agregarProducto(Producto producto){
        listaProductos.add(producto);
    }
    public void agregarReceta(Receta receta){
        listaRecetas.add(receta);
    }
    public Producto obtenerProducto(String nombre){
        Producto resultado = null;
        for(Producto producto : listaProductos)
            if(producto.getNombre().equals(nombre)){
                resultado = producto;
                break;
            }
        return resultado;
    }
    public Receta obtenerReceta(String nombre){
        Receta resultado = null;
        for(Receta reseta : listaRecetas){
            if(reseta.getNombre().equals(nombre)){
                resultado = reseta;
                break;
            }
        }
        return resultado;
    }
    public void guardarTodo(){
        //implementar con archivos
    }
    public void cargarTodo(){
        //también
    }
}
