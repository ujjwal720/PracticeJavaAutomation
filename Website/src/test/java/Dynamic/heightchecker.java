package Dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class heightchecker {

    public static void main(String[] args) {

      int[] a={1,1,4,2,1,3};
      int count=0;
      List<Integer> b=new ArrayList<Integer>();
      for(int i=0;i<=a.length-1;i++){


          b.add(a[i]);
      }

      List<Integer> p=new ArrayList<Integer>(b);
        Collections.sort(b);

        for(int i=0;i<=a.length-1;i++){

            if(b.get(i)!=p.get(i)){

                count++;

            }
        }

        System.out.println(count);


    }
}
