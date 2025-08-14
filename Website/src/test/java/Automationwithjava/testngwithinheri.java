package Automationwithjava;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testngwithinheri extends a {

    @Test
    public void name(){
        System.out.println(z);
        System.out.println("Hi this is an test");
    }

    @BeforeClass
    public void init(){

        System.out.println("This is an second of parent");
    }

}


class a{

    public a(){

        System.out.println("This is an constructor");
    }

    int z;

    @BeforeClass
    public void first(){
        z=10;
        System.out.println("This is an first of parent");
    }

}

