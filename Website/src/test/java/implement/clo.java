package implement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class clo {


    @BeforeClass
    public void msk(){

        System.out.println("parent before class");
    }

    @AfterClass
    public void bs(){

        System.out.println("the following is an after class");
    }



}




