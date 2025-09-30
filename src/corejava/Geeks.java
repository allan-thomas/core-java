// Example of Overriding in Java
package corejava;

class Animal {
    // Base class
      void move() { System.out.println(
      "Animal is moving."); }
    void eat() { System.out.println(
      "Animal is eating."); }
    void bark() { System.out.println("Dog is barking from animal class.");}
}

class Dog extends Animal {
    void move()
    { // move method from Base class is overriden in this
      // method
        System.out.println("Dog is running.");
    }
    void bark() { System.out.println("Dog is barking."); }
}

public class Geeks {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        Animal a = new Dog();
        a.move();// Output: Dog is running.
        d.move(); // Output: Dog is running.
        a.eat(); // Output: Animal is eating.
        a.bark();// Output: Dog is barking.
        d.eat();// Output: Animal is eating.
    }
}