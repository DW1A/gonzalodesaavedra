package arraysEjemploOracle;
public class Array {
    public static void main(String[] args) throws Exception {

        // se crean arrays poninedo [] al lado de cualquier tipo de coso (int, double,
        // etc) int[] anArray;
        // se pone nombreArray = new int [10]; para alocar la memoria para 10 num
        // enteros por ejemplo
        // anArray[0] = 100; asigna valor 100 al primer elemento del arary (como una
        // casilla vamos)
        // anArray[1] = 200; le asgina valor 200 al segundo elemento, etcetc
        // sysout("Element at index 1: " + anArray[0]); muestra "Element at index 1:
        // 100"

        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);
        System.out.println("Element at index 9: "
                + anArray[9]);
    }

}