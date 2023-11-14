package hazteConTodos;

public class NotARipOff {
	public static void main(String[] args) {

		Entrenador Juan;
		Poki otherPoki, primerPoki;

		int ganador;

		Juan = new Entrenador();
		primerPoki = new Poki();

		otherPoki = new Poki();

		// System.out.println(Planty);
		// Planty.comerBaya(); // esto hace que el pokemon 1 se coma una baya y sus
		// puntos de vida aumenten
		// System.out.println("Pokimon come baya, suma +5hp " + Planty);

		primerPoki.setTipo();

		System.out.println(primerPoki);

		System.out.println("A luchar owo");

		otherPoki.setTipo();

		otherPoki.resetStat();

		System.out.println(otherPoki);

		primerPoki.lucha(otherPoki);

		ganador = primerPoki.getGanador();

		if (ganador == 1) {
			System.out.println("Has ganado!");
		} else {
			if (ganador == 2) {
				System.out.println("Has perdido :(");
			} else {
				System.out.println("Habeis empatado!");
			}
		}

		otherPoki.resetStat();

		System.out.println(otherPoki);
		System.out.println(Juan);
	}

}