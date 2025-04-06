package codeWars;
public class ChangeCounter {
    public static int countChange(final int money, final int[] coins) {
        int[] combinaciones = new int[money + 1];
        combinaciones[0] = 1; // Solo hay una forma de hacer cambio para 0: no usar monedas

        for (int coin : coins) {
            for (int j = coin; j <= money; j++) {
                combinaciones[j] += combinaciones[j - coin];
            }
        }
        
        return combinaciones[money];
    }
    public static void main(String[] args) {
        System.out.println(countChange(4, new int[]{1, 2})); // 3
        System.out.println(countChange(10, new int[]{5, 2, 3})); // 4
        System.out.println(countChange(11, new int[]{5, 7})); // 0
    }
}

//¿?¿?¿?¿