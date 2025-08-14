package AssignmentsRivet;

import java.util.ArrayList;
import java.util.List;

public class coding3 {

    public static void main(String[] args) {

        /*
        strinh ha;fs alike
         */

        String a="book";
        String results="";
        int p=a.length()/2;
        List<String> po=new ArrayList<String>();


        for(int i=0;i<=a.length()-1;i++){

             results=results+a.charAt(i);

             if(i==p-1){
                 po.add(results);
                 results="";

             }


        }

        po.add(results);

        String one=po.get(0);
        String two=po.get(1);
        int count=0;
        int cn=0;

        for(int i=0;i<=one.length()-1;i++){

            if(one.charAt(i)=='a'|| one.charAt(i)=='e' || one.charAt(i)=='i'
            || one.charAt(i)=='o' || one.charAt(i)=='u' || one.charAt(i)=='A' ||
                    one.charAt(i)=='E' || one.charAt(i)=='I' || one.charAt(i)=='O'
            || one.charAt(i)=='U'){

                count++;
            }

            if(two.charAt(i)=='a'|| two.charAt(i)=='e' || two.charAt(i)=='i'
                    || two.charAt(i)=='o' || two.charAt(i)=='u' || two.charAt(i)=='A' ||
                    two.charAt(i)=='E' || two.charAt(i)=='I' || two.charAt(i)=='O'
                    || two.charAt(i)=='U'){

                cn++;
            }



        }

        if(count==cn){

            System.out.println("true");
        }

        else{

            System.out.println("false");
        }




    }
}
