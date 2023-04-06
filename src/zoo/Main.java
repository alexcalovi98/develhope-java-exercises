package zoo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    private static void exercise1() {
        System.out.println("Exercise 1");

        Animal monkeyGeorge = new Animal("George", "black", "monkey", 5);
        System.out.println(monkeyGeorge);

        System.out.println();
    }

    private static void exercise2() {
        System.out.println("Exercise 2");

        Animal monkeyGeorge = new Animal("George", "black", "monkey", 5);
        Animal monkeyJoe = new Animal("Joe", "black", "monkey", 3);
        Animal pandaJack = new Animal("Jack", "white", "panda", 3);

        Zoo zoo = new Zoo();
        zoo.addAnimal(monkeyGeorge);
        zoo.addAnimal(monkeyJoe);
        zoo.addAnimal(pandaJack);
        System.out.println("The zoo has the following animals: " + zoo.getAnimals());

        List<Animal> pandaInTheZoo = zoo.filterAnimalsByType("panda");
        System.out.println("The zoo has the following panda: " + pandaInTheZoo);

        int monkeysAverageAge = zoo.averageAgeOfAnimals("monkey");
        System.out.println("The average age of monkeys is " + monkeysAverageAge);
    }
}