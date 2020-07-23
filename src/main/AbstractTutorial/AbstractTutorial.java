package AbstractTutorial;

/*
* Abstract classes cannot be instantiated. You can extend that class and then instantiate it.
* Abstract method is a method that hasn't been implemented yet.
* Abstract class just like an interface exist to be extended.
* Abstract class can have normal methods that can be used when we use it in extended object.
* We use abstract classes like interfaces, we show what methods must be implemented.
* */

/*
* Interfaces have all their methods abstract by default.
* */

/*
* Summarizing, the difference between abstract class and interface. In abstract class you can implement
* some methods.
* */


interface DogInterface {
    // void bark();
    void usePower();
    public String name = "das";
    public static String surname = "dasdasda";
    abstract void bark();   // this is not necessary
//    public void bark(){   // Interface abstract methods cannot be implemented
//
//    }
}


abstract class Dog {
    public void bark(){
        System.out.println("Wof");
    }
    public static final int years = 10; // ok
    public static int years2 = 10;  //ok
    public int years3 = 10; //ok
//    abstract public void usePower(){
//
//    };    Can't be done

    abstract public void usePower();

}

class GermanShepherd extends Dog{

    @Override
    public void usePower() {
        System.out.println("Fly");
    }
}

public class AbstractTutorial {

    public static void main(String[] args) {
        new GermanShepherd().usePower();
    }
}
