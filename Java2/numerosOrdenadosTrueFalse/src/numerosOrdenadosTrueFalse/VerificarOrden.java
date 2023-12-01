package numerosOrdenadosTrueFalse;
public class VerificarOrden {

    public static boolean estaOrdenado(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 3, 549, 4222, 23232323};
        boolean resultado = estaOrdenado(numeros);
        System.out.println("¿El arreglo está ordenado de menor a mayor? " + resultado);
    }
}