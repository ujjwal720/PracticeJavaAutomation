package CodingProblems;

import java.util.ArrayList;
import java.util.List;

public class increment1 {

    public static void main(String[] args) {


        /*
        [1,2,4]
         */

        int[] digits ={9};
        String results="";

        for(int i = 0; i<= digits.length-1; i++){

            results=results+Integer.toString(digits[i]);
        }

      int m=Integer.parseInt(results)+1;

        String[] l=Integer.toString(m).split("");

        List<Integer> io=new ArrayList<Integer>();

        for(int i=0;i<=l.length-1;i++){

            io.add(Integer.parseInt(l[i]));
        }

        System.out.println(io);

        digits=new int[io.size()];

        for(int i=0;i<=io.size()-1;i++){

            digits[i]=io.get(i);
        }



    }
}
