package CodingProblems;

import org.apache.commons.io.output.ByteArrayOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class toreadinexcel {

    public static void main(String[] args) throws IOException {

        File a=new File("C:\\PracticeJavaAutomation\\Website\\src\\test\\java\\TestData\\AutomationPractice.xlsx");
        FileInputStream b=new FileInputStream(a);
        ByteArrayOutputStream buffer1 = new ByteArrayOutputStream();
        byte[] data1 = new byte[1024];
        int bytesRead1=0;
        System.out.println(data1.length);

        while(bytesRead1!=-1){
            bytesRead1 =b.read(data1,0,data1.length);
            System.out.println(bytesRead1);
            if (bytesRead1 == -1) {
                break;
            }
            buffer1.write(data1, 0, bytesRead1); // Writing read data into a buffer

            }
            }
        }





