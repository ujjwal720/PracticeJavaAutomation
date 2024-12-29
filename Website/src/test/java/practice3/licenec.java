package practice3;

import java.util.ArrayList;
import java.util.List;

public class licenec {

    public static void main(String[] args) {


        /*
        licemce key formatting
         */

        String ui="2-4A0r7-4k";
       String[] l= ui.split("-");
       String res="";
       res=res+l[0]+"-";
       int k1 =4;
       List<Character> io=new ArrayList<Character>();


       for(int i=1;i<=l.length-1;i++){

           String ioz=l[i];

           for(int j=0;j<=ioz.length()-1;j++){

               io.add(ioz.charAt(j));
           }


       }
        int count1=0;

       for(int i=0;i<=io.size()-1;i++){
           int count=1;


           while (count<= k1 && count1<=io.size()-1){
           if(Character.isLowerCase(io.get(count1))){
               res=res+Character.toUpperCase(io.get(count1));
               count++;
               count1++;


           }

           else{

               res=res+io.get(count1);
               count++;
               count1++;
           }

           }
           if(count1<io.size()-1) {
               res = res + "-";
               i = count1;
           }

           else{

               i=count1-1;
           }


       }

        System.out.println(res);







    }
}
