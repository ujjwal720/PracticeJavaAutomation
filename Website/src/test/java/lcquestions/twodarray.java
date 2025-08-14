package lcquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class twodarray {

    public static void main(String[] args) {


        int[][] a={{1,5},{7,3},{4,5}};
        List<Integer> op=new ArrayList<Integer>();

        for(int i=0;i<=a.length-1;i++){

            int[] x=a[i];
            int sum=0;
            for(int j=0;j<=x.length-1;j++){

                sum=sum+x[j];


            }

            op.add(sum);


        }

        Collections.sort(op);

        System.out.println("tHE MAX AMONG THAT IS"+" "+op.get(op.size()-1));


    }
}
