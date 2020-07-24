package app;

class Normal {
    public void show(){
        System.out.println("Im normal class mate");
    }
}

class NormalExt extends Normal {
    @Override
    public void show(){
        System.out.println("I exist only to override Normal class");
    }
}


public class AbstractInnerClass {

    public static void main(String[] args) {
        Normal n = new Normal();
        n.show();

        Normal ex = new NormalExt();
        ex.show();

        // anonnymous
        Normal an = new Normal(){
          public void show(){
              System.out.println("Anonymous classe here");
          }
        };

        an.show();


    }
}
