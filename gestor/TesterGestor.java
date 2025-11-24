package gestor;

public class TesterGestor {
    public static void main(String[] args){
        Insumo leche = new Insumo("leche");
        leche.setCostoPorUnidad(20.0);
        leche.setUnidad("litros");
        leche.setCantidadDisponible(2.0);
        System.out.println(leche.getNombre());
        System.out.println(leche.calcularCostoTotal(1));
    }
}
