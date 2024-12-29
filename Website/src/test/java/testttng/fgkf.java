package testttng;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class fgkf
{

    public static void main(String[] args){

        try {
            fgkf.readFile();
        }

        catch(Exception e){


            System.out.println("handel this exception");
        }


    }


    public static void readFile() throws FileNotFoundException {
        File file = new File("nonexistent.txt");
        FileReader reader = new FileReader(file); // Might throw FileNotFoundException
    }
}

