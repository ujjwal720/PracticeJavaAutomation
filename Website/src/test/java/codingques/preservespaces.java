package codingques;

import java.util.ArrayList;
import java.util.List;

public class preservespaces {

    public static void main(String[] args) {

        /*
        preserve spaces
         */


        String a="India is a good country";
        char[] p=a.toCharArray();
        String results="";
        List<Character> l=new ArrayList<Character>();
        int count=0;


        for(int i=0;i<=p.length-1;i++){

            if(Character.isLetter(p[i])){

                l.add(p[i]);
            }
        }

        count=l.size()-1;

        for(int i=0;i<=p.length-1;i++){

            if(p[i]==' '){

                results=results+" ";
            }

            else{

                results=results+l.get(count);
                count--;
            }




        }

        System.out.println(results);




    }
}
