package AssignmentsRivet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class trre {

    public static void main(String[] args) {

         /*
         kid with greates candy
          */

        int candy=3;
        int[] a={2,3,5,1,3};
        boolean[] arr=new boolean[a.length];

        List<Integer> io=new ArrayList<Integer>();
        List<Boolean> iom=new ArrayList<Boolean>();

        for(int i=0;i<=a.length-1;i++){

             io.add(a[i]);
        }

        Collections.sort(io);

        int p=io.get(io.size()-1);

        for(int i=0;i<=a.length-1;i++){

            int op=a[i]+candy;
            if(op>=p){


                iom.add(true);
            }

            else{


                iom.add(false);
            }
        }

        System.out.println(iom);


        
    }
}
