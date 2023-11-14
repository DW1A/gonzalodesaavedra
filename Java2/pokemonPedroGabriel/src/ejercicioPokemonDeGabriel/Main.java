package ejercicioPokemonDeGabriel;
public class Main {
    public static void main(String[] args) {
        
        Pokemon pokemon1, pokemon2;

        int ganador;
        
        pokemon1 = new Pokemon('E', 4, 5, 5);
        pokemon2 = new Pokemon('W', 50, 3, 28);

        System.out.println(pokemon1);
        pokemon1.comerBaya(); //esto hace que el pokemon 1 se coma una baya y sus puntos de vida aumenten
        System.out.println("Pokemon come baya, suma +5hp " +pokemon1);

        System.out.println("A luchar owo");
        pokemon1.lucha(pokemon2);

        ganador = pokemon1.ganador;

        if (ganador==1) {
            System.out.println("Has ganado!");
        } else {
            if (ganador==2) {
                System.out.println("Has perdido :(");
            } else {
                System.out.println("Habeis empatado!");
            }
        }

    }
}