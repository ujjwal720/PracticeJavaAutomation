package AssignmentsRivet;

import java.util.ArrayList;
import java.util.List;

public class wordformaton {

    public static void main(String[] args) {

        String[] op={"hello","world","leetcode"};
        int sum=0;



        for(int i=0;i<=op.length-1;i++){
            String hj="welldonehoneyr";
            int count=0;
            int count1=0;
           char[] h= op[i].toCharArray();

            List<Character> uy=new ArrayList<Character>();

            for(int j=0;j<=h.length-1;j++){

           boolean tr=     hj.contains(Character.toString(h[j]));

                if(tr==true){

                    uy.add(h[j]);
                   hj= hj.replaceFirst(Character.toString(h[j]),"?");
                    count++;
                }

                if(tr==false){

                    break;
                }

            }

            if(count==h.length){

                for(int k=0;k<=hj.length()-1;k++){

                    if(hj.charAt(k)=='?'){

                        count1++;

                    }
                }

                if(count1==h.length){

                    sum=sum+op[i].length();
                }


            }

            }




        }



    }

