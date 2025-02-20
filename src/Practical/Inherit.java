
class Animal{
    Animal(){
        System.out.println("Is An Animal");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Is A Dog");
    }
}

class GermanShepherd extends Dog{
    GermanShepherd(){
        System.out.println("Is A German Shepherd");
    }
}

public class Inherit {
    public static void main(String[] args){
        GermanShepherd g = new GermanShepherd();
    }
}
