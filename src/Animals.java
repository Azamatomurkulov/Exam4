import java.util.HashMap;
import java.util.Map;

public class Animals {
    public static void main(String[] args){
        Map<String,Pet> animals = new HashMap<>();
        Cat cat = new Cat("Catty");
        Dog dog = new Dog("Rex");
        Parrot parrot = new Parrot("Jack");

        animals.put(cat.getName(),cat);
        animals.put(dog.getName(),dog);
        animals.put(parrot.getName(),parrot);

        Pet.petsInfo(animals);
    }
}
