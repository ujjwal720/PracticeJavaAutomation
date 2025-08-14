package selenium;

import java.util.ArrayList;
import java.util.List;

public abstract class EXCER {


    abstract void kl();

    public static void main(String[] args) {
        List<hj> io=new ArrayList<>();
        io.add(new hj("Varun","shrivaastava"));
        io.add(new hj("Varun1","shrivaastava"));


        for(hj z:io){

            System.out.println(z.name);
        }

    }}


class hj{
    String name;
    String surname;
    public hj(String name,String surname){


        this.name=name;
        this.surname=surname;
    }


    @Override
    public String toString(){


        return "{"+name+"+"+surname+"}";}
}









