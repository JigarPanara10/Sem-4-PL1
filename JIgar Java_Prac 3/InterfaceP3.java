interface Animal {
    void animalSound(); // Abstract method
    void sleep(); // Abstract method
}

// Implement the Animal interface in a class named Dog
class Dog implements Animal {
    //Override
    public void animalSound() {
        System.out.println("The Dog says: bhavv bhavv ");
    }

    //Override
    public void sleep() {
        System.out.println("Zzz...");
    }
}
public class InterfaceP3 {
    public static void main(String[] args) {
        Dog myDog = new Dog(); // Create a Dog object
        myDog.animalSound();
        myDog.sleep();
    }
}
