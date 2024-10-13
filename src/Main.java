import java.util.ArrayList;
import java.util.List;

interface  AnimalInteraction {
    void feed(String food);
    void play();
    void showInteractionHistory();
    void sleep(int hours);
}

abstract class SimpleAnimal implements AnimalInteraction {
    protected List<String> interactionHistory;  // To store interaction history

    public SimpleAnimal() {
        this.interactionHistory = new ArrayList<>();  // Initialize the history
    }

    public void feed(String food) {
        interactionHistory.add("Fed with: " + food);  // Log the food interaction
        System.out.println("You fed the animal with " + food);
    }

    public void play() {
        interactionHistory.add("Played with the animal");  // Log the play interaction
        System.out.println("You played with the animal");
    }

    public void showInteractionHistory() {
        System.out.println("Interaction History:");
        for (String interaction : interactionHistory) {
            System.out.println(interaction);
        }
    }

    public void sleep(int hours) {
        interactionHistory.add("Slept for " + hours + " hours");
        System.out.println("The animal slept for " + hours + " hours");
    }
}

class Dog extends SimpleAnimal {

    public void bark() {
        System.out.println("The dog is barking!");
        interactionHistory.add("Dog barked");
    }
}

class Cat extends SimpleAnimal {

    public void meow() {
        System.out.println("The cat is meowing!");
        interactionHistory.add("Cat meowed");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Dog instance
        Dog myDog = new Dog();
        myDog.feed("dog food");
        myDog.play();
        myDog.bark();
        myDog.sleep(5);
        myDog.showInteractionHistory();

        System.out.println();

        // Create a Cat instance
        Cat myCat = new Cat();
        myCat.feed("cat food");
        myCat.play();
        myCat.meow();
        myCat.sleep(3);
        myCat.showInteractionHistory();
    }
}
