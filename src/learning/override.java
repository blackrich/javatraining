package learning;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
class Horse extends Animal{
	//override가 없는 경우에 대한 동작
}

public class override {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Horse horse = new Horse();
        
        animal.makeSound(); // Output: Animal makes a sound
        cat.makeSound();    // Output: Cat meows
        dog.makeSound();    // Output: Dog barks
        horse.makeSound();  // Output: Animal makes a sound
    }
}