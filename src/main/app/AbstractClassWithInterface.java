package app;

interface SomeInterface {
    void doSomething(); // abstract method to implement
}

class Implementator implements SomeInterface {
    public void doSomething(){
        System.out.println("Im doing something");
    }
}


public class AbstractClassWithInterface {
    public static void main(String[] args) {


        // we want to do this
        // SomeInterface in = new SomeInterface();

        // we can do it by annonymous like this
        SomeInterface in = new SomeInterface() {
            @Override
            public void doSomething() {

            }
        };

        SomeInterface obj = new Implementator();
        obj.doSomething();
    }
}
