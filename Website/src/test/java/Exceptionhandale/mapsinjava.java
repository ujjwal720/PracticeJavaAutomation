package Exceptionhandale;

import java.util.HashMap;
import java.util.*;


public class mapsinjava {

    public static void main(String[] args) {

        Map<String,String> iu=new HashMap<String,String>();
        iu.put("Mam","man");
        iu.put("Mam1","man2");
        iu.put("Mam2","man1");

       for(Map.Entry<String, String> io: iu.entrySet()){

           System.out.println(io.getKey());
           System.out.println(io.getValue());


       }



    }
}


