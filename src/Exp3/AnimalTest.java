package Exp3;
/*
Create an abstract class Animal with instance variables name and age. Define abstract methods makeSound()
and move(), and provide a concrete method display() to show animal details. Create subclasses Dog, Cat, Bird,
and Fish, each implementing their respective behaviors in the makeSound() and move() methods. Write a test
class AnimalTest where a reference of Animal holds objects of all subclasses, calls their respective methods,
and displays their behaviors.
 */

abstract class Animal{
    public String name;
    public int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
    abstract void move();
    public void display(){
        System.out.println("Animal Name : " + this.name + " - " + "Animal Age : " + this.age);
    }

}

class Dog extends Animal{

    Dog(String name, int age){
        super(name,age);
    }

    void makeSound(){
        System.out.println(this.name + " Barks");
    }

    void move(){
        System.out.println(this.name + " is Walking");
    }
}

class Cat extends Animal{

    Cat(String name, int age){
        super(name,age);
    }

    void makeSound(){
        System.out.println(this.name + " Meows");
    }

    void move(){
        System.out.println(this.name + " is Walking");
    }
}

class Bird extends Animal{

    Bird(String name, int age){
        super(name,age);
    }

    void makeSound(){
        System.out.println(this.name + " Chirps");
    }

    void move(){
        System.out.println(this.name + " is flying");
    }
}

class Fish extends Animal{

    Fish(String name, int age){
        super(name,age);
    }

    void makeSound(){
        System.out.println(this.name + " squeaks");
    }

    void move(){
        System.out.println(this.name + " is swimming");
    }
}
public class AnimalTest {
    public static void main(String[] args){
        Animal[] animals = {
                new Dog("Dog1",2),
                new Cat("Cat1",3),
                new Bird("Bird1",2),
                new Fish("Fish1",2)
        };

        for(Animal animal : animals){
            animal.display();
            animal.makeSound();
            animal.move();
            System.out.println();
        }

    }
}
