package Dynamic;

import java.util.ArrayList;
import java.util.List;

public class codingproblem2 {

    public static void main(String[] args) {

     int[] a1 ={0,1,2,3,4};
     int[] index1 ={0,1,2,2,1};
     List<Integer> m=new ArrayList<Integer>();

     for(int i = 0; i<= a1.length-1; i++){

         m.add(index1[i], a1[i]);


     }


int[] b=new int[index1.length];

     for(int i=0;i<=b.length-1;i++){

         b[i]=m.get(i);
     }








    }
}
