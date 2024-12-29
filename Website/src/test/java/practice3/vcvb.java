package practice3;

import java.util.ArrayList;
import java.util.List;

public class vcvb {

    public static void main(String[] args) {



        /*
        words1 containg character
         */

        String[] words1 ={"leet","code"};
        char c ='x';
        List<Integer> ol=new ArrayList<Integer>();

        for(int i = 0; i<= words1.length-1; i++){

            if(words1[i].contains(Character.toString(c))){

                ol.add(i);

            }

        }


        int[] j=new int[ol.size()];

        for(int i=0;i<=j.length-1;i++){

            j[i]= ol.get(i);
        }








    }
}
