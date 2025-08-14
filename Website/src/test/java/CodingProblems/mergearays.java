package CodingProblems;

import java.util.ArrayList;
import java.util.List;

public class mergearays {

    public static void main(String[] args){

        int[] arr1={1, 2, 3, 4, 5, 6};  //first array
        int[] arr2={7, 8, 9, 0};
        int x=0;//parent array
        List<Integer> p=new ArrayList<Integer>();
        int max=Math.max(arr1.length,arr2.length);

        for(int i=0;i<=max;i++){
      try {
          p.add(arr1[i]);
          p.add(arr2[i]);
      }
      catch(Exception e){

      }

        }

    }
}
