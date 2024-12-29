package practice3;

import java.util.ArrayList;
import java.util.List;

public class iiuoiu {

    public static void main(String[] args) {

     String text1 ="we will we will rock you";
     String first1 ="we";
     String second1 ="will";
     String[] ui= text1.split(" ");
     List<String> l=new ArrayList<String>();

     for(int i=0;i<=ui.length-1-1;i++){

         if(ui[i].equals(first1)){

             if(ui[i+1].equals(second1)){


                   l.add(ui[i+1+1]);
                   i=i+1;



             }


         }



     }


     String[] res=new String[l.size()];

     for(int i=0;i<=l.size()-1;i++){

         res[i]=l.get(i);
     }






    }
}
