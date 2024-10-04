package CodingProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class code1 {

    public static void main(String[] args){

        /*
        common prefix
         */

        String[] s={"flower","flow","flight"};
        /*
        find the min length
         */
        List<Integer> il=new ArrayList<Integer>();

        for(int i=0;i<=s.length-1;i++){

            il.add(s[i].length());
        }
        Collections.sort(il);
        int minlength=il.get(0);
        String results="";

       for(int i=0;i<=minlength-1;i++){
          int count=0;
           int l=0;

           String y=Character.toString(s[0].charAt(i));

           for(int j=0;j<=s.length-1;j++){
             String z=Character.toString(s[j].charAt(i));
               if (y.equals(z)) {   // Check if 'y' equals the character at position 'j'
                   count++;  // Increment the count if 'y' matches
               }
               else{
                   break;
               }


               }

           if(count==s.length){

               results=results+y;

           }



           }

        System.out.println(results);


       }





    }



