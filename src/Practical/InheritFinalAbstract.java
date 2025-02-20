abstract class Animals{
    abstract void isAnimal();
}

abstract class Dogs extends Animals{
    final String type = "Dog";
    void isAnimal(){
        System.out.println(type+" Is An Animal");
    }

    abstract void DogType();
}

abstract class Cats extends Animals{
    final String type = "Cat";
    void isAnimal(){
        System.out.println(type+" Is An Animal");
    }

    abstract void CatType();
}

class GermanShepherds extends Dogs{
    void DogType(){
        System.out.println("Is A German Shepherd");
    }
}

class Persian extends Cats{
    void CatType(){
        System.out.println("Is A Persian Cat");
    }
}


public class InheritFinalAbstract {
    GermanShepherds g = new GermanShepherds();
    Persian p = new Persian();
}
