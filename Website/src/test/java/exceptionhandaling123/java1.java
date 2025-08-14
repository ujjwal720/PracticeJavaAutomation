package exceptionhandaling123;

import com.github.javafaker.File;

import java.io.FileNotFoundException;

public class java1 {

    public static void main(String[] args) {

        try{

            int a=10/0;
        }

        catch(ArithmeticException a){

            System.out.println("hello");
        }

        finally {
            System.out.println("hello");
        }






    }
}
