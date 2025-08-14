package Automationwithjava;

public class Constructorwithinheri {

    public static void main(String[] args) {

        crompton a=new crompton();
        a.start();

    }
}


class fan{

    int z;

    public fan(){
        z=10;
        System.out.println("Hi i am an contructor of fan class");
    }

}

class crompton extends fan{

    public crompton(){

        System.out.println("Hi i am an cromption i will excute after my parent");
    }

    public void start(){

        System.out.println("Hi i am running the fan");
        System.out.println(z);
    }

}