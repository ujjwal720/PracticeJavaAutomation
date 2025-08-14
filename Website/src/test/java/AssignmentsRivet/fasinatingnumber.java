package AssignmentsRivet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fasinatingnumber {

    public static void main(String[] args) {


        int x=853;
        String p=Integer.toString(x*2);
        String z=Integer.toString(x*3);
        String op=Integer.toString(x);
        String results=op+p+z;
        String[] io=results.split("");
        List<Integer> ioi=new ArrayList<Integer>();
        for(int i=0;i<=io.length-1;i++){
            if(io[i].equals("0")) {
                ioi.add(Integer.parseInt(io[i]));

            }
        }

        Set<Integer> uy=new HashSet<Integer>(ioi);

        System.out.println(uy.size());
        if(uy.size()==9){

            System.out.println("true");
        }

        else{

            System.out.println("false");
        }








    }
}
