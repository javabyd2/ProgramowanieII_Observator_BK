package observator;

public class Visitor implements AnimalAddedListener {
    public void onAnimalAdded(Animal animal) {
        System.out.println("Nowy: " + animal.getName());
    }
}
