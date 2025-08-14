package caiop;

import java.util.ArrayList;
import java.util.List;

public class uyye {

    public String name;
    public int age;
    public String city;

    List<uyye> student=new ArrayList<>();

    public String name1="varun";

     public uyye(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }



    public void addstudent(String name, String age, String city){
         student.add(new uyye(name,Integer.parseInt(age),city));
     }

     public void removestudent(int index){
         student.remove(index);
     }

     public void displaystudent(){
         for(int i=0;i<=student.size()-1;i++){
             System.out.println("Name: "+student.get(i).name+" Age: "+student.get(i).age+" City: "+student.get(i).city);
         }


     }








}
