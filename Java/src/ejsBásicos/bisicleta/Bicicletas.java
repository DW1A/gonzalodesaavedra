package ejsBásicos.bisicleta;
class Bicicletas {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicicleta bici1 = new Bicicleta();
        Bicicleta bici2 = new Bicicleta();

        // Invoke methods on 
        // those objects
        bici1.changeCadence(50);
        bici1.speedUp(10);
        bici1.changeGear(2);
        bici1.printStates();

        bici2.changeCadence(50);
        bici2.speedUp(10);
        bici2.changeGear(2);
        bici2.changeCadence(40);
        bici2.speedUp(10);
        bici2.changeGear(4);
        bici2.printStates();
    }
}