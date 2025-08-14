package exception;

import java.util.ArrayList;
import java.util.List;

public class pract56 {

    public static void main(String[] args) {
        List<hj> io=new ArrayList<>();
        io.add(new hj("Varun","shrivaastava"));
        io.add(new hj("Varun1","shrivaastava"));
        for(hj u:io){

            System.out.println(u.name);
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