package observator;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Visitor kierownik = new Visitor();
        Visitor prezes = new Visitor();
        Visitor burmistrz = new Visitor();
        zoo.registerAnimalAddedListener(kierownik);
        zoo.registerAnimalAddedListener(prezes);
        zoo.registerAnimalAddedListener(burmistrz);

        zoo.addAnimal(new Animal("Kot"));

        zoo.unregisterAnimalAddedListener(prezes);

        zoo.addAnimal(new Animal("Pies"));


    }
}
