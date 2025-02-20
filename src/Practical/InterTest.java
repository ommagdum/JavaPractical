
interface Animal_Int{
    int age = 10;
    void makeSound();
}

interface Action extends Animal_Int{
    void move();
}

class Dog1 implements Action{
    public void makeSound(){
        System.out.println("Dog Is Barking");
    }

    public void move(){
        System.out.println("Dog Is Sprinting");
    }
}

public class InterTest {
    public static void main(String[] args){
        Dog1 d = new Dog1();
        d.makeSound();
        d.move();
    }
}
