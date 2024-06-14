import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arreglo <T> {
    private final List<T> arreglo;

    public Arreglo() {
        this.arreglo = new ArrayList<>();
    }


    public void agregarElemento(T e) {
        arreglo.add(e);
    }


    public void mostrarElementos() {
        System.out.println("Los Elementos del Arreglo: ");
//        for (T e : arreglo) {
//            System.out.println(e);
//        }
        System.out.println(Arrays.toString(arreglo.toArray()));
    }

}
