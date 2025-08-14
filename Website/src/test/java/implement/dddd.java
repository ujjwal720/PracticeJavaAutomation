package implement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dddd extends clo{


  @BeforeClass
    public void op(){

        System.out.println("Child Before class");
    }

    @AfterClass
    public void opl(){

        System.out.println("child after class");
    }


    @Test
    public void kk(){

        System.out.println("This is an test method");

    }


}
