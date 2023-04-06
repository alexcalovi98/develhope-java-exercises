package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Animal> animals = new ArrayList<>(); //ArrayList is an implementation of List

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> filterAnimalsByType(String type) {
        List<Animal> filteredAnimals = new ArrayList<>();
        for(Animal animal : animals) {
            if(animal.getType().equals(type)) {
                filteredAnimals.add(animal); //if the type match the requested one, we insert the element in the filtered list
            }
        }
        return filteredAnimals; //after the for we return the filtered list
    }

    public int averageAgeOfAnimals(String type) {
        List<Animal> filteredAnimals = filterAnimalsByType(type); //we retrieve the animals filtered by type using the previous function
        int ageSum = 0;
        for(Animal animal : filteredAnimals) {
            ageSum += animal.getAge();
        }
        return ageSum / filteredAnimals.size();
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }
}
