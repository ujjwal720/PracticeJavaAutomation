package CodingProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class peactice {


    public static void main(String[] args) {

  /*
  uncommon words
   */

//        String s1 = "this apple is sweet";
//        String s2 = "this apple is sour";
//        List<String> l = new ArrayList<String>();
//        List<String> l2 = new ArrayList<String>();
//        String[] s4 = s1.split(" ");
//        String[] s5 = s2.split(" ");
//        Map<String, Integer> k = new HashMap<String, Integer>();
//        Map<String, Integer> k1 = new HashMap<String, Integer>();
/*
        for (int i = 0; i <= s4.length - 1; i++) {

            if (k.containsKey(s4[i])) {

                k.put(s4[i], k.get(s4[i]));

            } else {

                k.put(s4[i], 1);

            }


        }


        for (int i = 0; i <= s5.length - 1; i++) {

            if (k1.containsKey(s5[i])) {

                k1.put(s4[i], k.get(s5[i]));

            } else {

                k1.put(s5[i], 1);

            }


        }

        */

        String s1 = "apple apple";
      String s2 = "banana";
      List<String> l = new ArrayList<String>();
        String[] s4 = s1.split(" ");
       String[] s5 = s2.split(" ");

       for(int i=0;i<=s4.length-1;i++){

           l.add(s4[i]);

       }

        for(int i=0;i<=s5.length-1;i++){

            l.add(s5[i]);

        }

        Set<String> iou=new HashSet<String>(l);
        List<String> hj=new ArrayList<String>(iou);
        List<String> hjM=new ArrayList<String>();

        for(int i=0;i<=hj.size()-1;i++){

            int count=0;

            for(int j=0;j<=l.size()-1;j++){

                if(hj.get(i).equals(l.get(j))){

                    count++;

                }
            }

            if(count==1){

                hjM.add(hj.get(i));
            }


        }


        System.out.println(hjM);















    }
}
