package testttng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gggg {

    @BeforeClass
    public void cd(){

        System.out.println("This is before class two");
    }


    @BeforeTest
    public void beforetest(){


        System.out.println("This is an before test method in the two");
    }

    @Test
    public void test(){

        System.out.println("this is an test 2");
    }
}
