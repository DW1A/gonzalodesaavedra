package codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snail {

    public static int[] snail(int[][] array) {
        List<Integer> listaOrdenada = new ArrayList<>();
        for (Integer num : array[0]) {
            listaOrdenada.add(num);
        }

        boolean control = false;
        for (int i = array.length - 2; i > 0; i--) {
            control = !control;
            if (control) {
                for (int j = 0; j <= i; j++) {
                    listaOrdenada.add(array[i + j][array.length - 1]);
                }
                for (int j = i; j >= 0; j--) {
                    listaOrdenada.add(array[i + 1][j]);
                }
            } else {
            }
        }

        int[] resultado = listaOrdenada.stream().mapToInt(Integer::intValue).toArray();
        return resultado;
    }

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {4, 5, 6, 5},
            {7, 8, 9, 6},
            {6, 4, 2, 1}
        };

        System.out.println(Arrays.toString(snail(array)));
    }
}
