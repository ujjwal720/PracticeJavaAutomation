package AssignmentsRivet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jkkg {

    public static void main(String[] args) {

        /*
        even and odd number
         */

        int[] a={4,3,2,1};

        for(int i=0;i<=a.length-1;i++){

            if(a[i]%2==0){

                a[i]=0;


            }

            else{

                a[i]=1;


            }
        }

        List<Integer> p=new ArrayList<Integer>();

        for(int i=0;i<=a.length-1;i++){

            p.add(a[i]);
        }

        Collections.sort(p);

        for(int i=0;i<=p.size()-1;i++){

            a[i]=p.get(i);
        }







    }
}
