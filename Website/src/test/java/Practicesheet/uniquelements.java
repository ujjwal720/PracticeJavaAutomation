package Practicesheet;

import java.util.ArrayList;
import java.util.*;

public class uniquelements {

    public static void main(String[] args){

        /*
          elements unique frequency to solve the following
         */

        int[] a={1,2,2,3,4,5};
        List<Integer> elements=new ArrayList<Integer>();
        for(int i=0;i<=a.length-1;i++){
            int count=0;
            for(int j=0;j<=a.length-1;j++){

                if(a[i]==a[j]){
                    count++;
                }


                if(count>1){
                    break;
                }

            }

            if(count==1){

                elements.add(a[i]);

            }


        }

        System.out.println(elements);


    }
}
