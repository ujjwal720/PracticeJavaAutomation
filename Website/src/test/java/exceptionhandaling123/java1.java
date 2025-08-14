package exceptionhandaling123;

import com.github.javafaker.File;

import java.io.FileNotFoundException;

public class java1 {

    public static void main(String[] args) {

        try{

            int a=10/0;
        }


        catch (ArithmeticException e){

            System.out.println("hs");
        }

        catch(Exception e){

            System.out.println("Hello");
        }


        finally {
            System.out.println("hello");
        }






    }
}
