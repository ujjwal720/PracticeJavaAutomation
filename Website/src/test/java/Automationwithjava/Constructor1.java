package Automationwithjava;

import java.sql.SQLOutput;

public class Constructor1 {

    public static void main(String[] args) {

        abc a=new abc();


    }
}


class abc{


    /*
    Constructor it will invoke first so we can inlize something here if
    anything needed in our class in terms on inlilization
     */
    public abc(){

        System.out.println("This is an constructor will execute first");
    }

    public void hello(){

        System.out.println("This is an hello world");
    }

    /*
    shoot in the sky for the following as its not working for the limtebdtime
     */

}