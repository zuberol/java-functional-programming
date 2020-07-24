package app;

/*
*   Syfiasty troche ale co poradzisz.
* */


public class StaticBlockExample {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("static block called ");
    }
    StaticBlockExample(){
        System.out.println("Constructor called");
    }
}

class Main {
    public static void main(String args[]) {

        // Although we have two objects, static block is executed only once.
        StaticBlockExample t1 = new StaticBlockExample();
        StaticBlockExample t2 = new StaticBlockExample();
    }
}