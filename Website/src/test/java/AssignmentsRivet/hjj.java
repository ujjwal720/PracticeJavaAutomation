package AssignmentsRivet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class hjj {

    public static void main(String[] args) {

  /*
  maximum consecutive ones in an array
   */

        int[] a={1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        int count=0;
        List<Integer> po=new ArrayList<Integer>();

        for(int i=0;i<=a.length-1;i++){

            if(a[i]==1){

                count++;

            }

            else{

                po.add(count);
                count=0;
            }

            if(i==a.length-1){

                po.add(count);
            }
        }

        Collections.sort(po);
        System.out.println(po.get(po.size()-1) +" "+"This is an maximum consecutive water");









    }
}
