package AssignmentsRivet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutelength {


    public static void main(String[] args) {
      String s="cbaebabacd";
      String p="abc";
        String arm=s;
        String arm1=p;

        List<Integer> po=new ArrayList<Integer>();
        int[] x=new int[26];
        for(int i=0;i<=arm1.length()-1;i++){

            int u =arm1.charAt(i)-'a';
            x[u]++;
        }



        for(int i=0;i<=arm.length()-arm1.length();i++){
            int[] win=new int[26];
            int count=i;
            int len=1;
            String results="";

            while(len<=arm1.length()){

                results=results+arm.charAt(count);

                count++;
                len++;
            }

            for(int j=0;j<=results.length()-1;j++){

                int u =results.charAt(j)-'a';
                win[u]++;
            }

            boolean res=Arrays.equals(x,win);

            if(res==true){

                po.add(i);
            }


        }


        System.out.println(po);



    }
}
