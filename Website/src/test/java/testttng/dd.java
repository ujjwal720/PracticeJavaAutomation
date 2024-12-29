package testttng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dd {

    @BeforeClass
    public void cd(){

        System.out.println("This is before class one");
    }


    @BeforeTest
    public void beforetest(){


        System.out.println("This is an before test method in the jjava");
    }


    @Test
    public void test(){

        System.out.println("this is an test 1");
    }
}
