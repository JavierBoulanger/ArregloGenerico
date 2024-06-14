public class Main {
    public static void main(String[] args) {
        Arreglo<Integer> arregloEntero = new Arreglo<>();
        arregloEntero.agregarElemento(10);
        arregloEntero.agregarElemento(45);
        arregloEntero.mostrarElementos();

        Arreglo<Character> arregloCaracter = new Arreglo<>();
        arregloCaracter.agregarElemento('%');
        arregloCaracter.agregarElemento('X');
        arregloCaracter.agregarElemento('%');
        arregloCaracter.agregarElemento('6');
        arregloCaracter.mostrarElementos();
    }
}