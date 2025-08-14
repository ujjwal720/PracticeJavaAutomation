package studentphonebook;

import java.util.ArrayList;
import java.util.List;

public class ff {


    List<Student> po=new ArrayList<Student>();

    public void AddStudent(int id,int rollno,String name){

       po.add(new Student(id,rollno,name));

    }

    public void displayallstudents(){

        System.out.println("The numbe rof studnets are displaying here as follows");


    }

    public void updaterecords(int id){

        for(int i=0;i<=po.size()-1;i++){


        }


    }





}
