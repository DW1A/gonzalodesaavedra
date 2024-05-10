package bicicletaEjemploJava;

class MountainBike extends Bicicleta {

	int montañasEscaladas;
	
	MountainBike(int numMont){
		this.montañasEscaladas = numMont;
	}
	
	void escalarMontaña() {
		System.out.println("Montaña escalada!");
		montañasEscaladas++;
	}
	
	@Override
	void printStates() {
	    System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear + " Montañas escaladas: " + montañasEscaladas);
	}
}
