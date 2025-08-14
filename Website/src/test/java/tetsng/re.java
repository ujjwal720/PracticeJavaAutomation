package tetsng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class re extends fs{

    @BeforeClass
    public void jh(){

        System.out.println("this is child");

    }

    @AfterClass
    public void gg(){

        System.out.println("this is child after class");
    }

    @Test
    public void ter(){


    }
}
