package tetsng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class fs {


    @BeforeClass
    public void ms(){

        System.out.println("This is an fs");

    }

    @AfterClass
    public void gfy(){

        System.out.println("this is an paretn cfter class");
    }
}
