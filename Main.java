public class Main {

    public static void main(String[] args) {
       // Car myCar = new Car();
       //  myCar.setModelName("Mahindra");
       // System.out.println(myCar.modelName);

       // Polymorphism example 1
        Panther newPanther1 = new Panther();
        Owl newOwl1 = new Owl();

        newPanther1.animalSound();
        newOwl1.animalSound();

        // Polymorphism example 2
        Animal newPanther2 = new Panther();
        Animal newOwl2 = new Owl();

        newPanther2.animalSound();
        newOwl2.animalSound();
    }
}