package bicicletaEjemploJava;

class Main {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicicleta bike1 = new Bicicleta();
        Bicicleta bike2 = new Bicicleta();
        MountainBike mBike1 = new MountainBike(4);

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
        
        mBike1.speedUp(400);
        mBike1.escalarMontaña();
        mBike1.printStates();
    }
}