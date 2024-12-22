package AssignmentsRivet;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class comonchars {

    public static void main(String[] args) {

        String[] x={"bella","label","roller"};

        String op=x[0];

        Map<Character,Integer> opl=new HashMap<Character,Integer>();

        for(int i=0;i<=op.length()-1;i++){

            if(opl.containsKey(op.charAt(i))){

                opl.put(op.charAt(i),opl.get(op.charAt(i))+1);
            }

            else{

                opl.put(op.charAt(i),1);
            }
        }


        for(int i=1;i<=x.length-1;i++){
            String m=x[i];
            Map<Character,Integer> oplz=new HashMap<Character,Integer>();




        }




    }



}





