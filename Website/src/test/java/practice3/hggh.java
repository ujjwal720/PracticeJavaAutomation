package practice3;

import java.util.*;

public class hggh {

    public static void main(String[] args) {


        /*
        ismorphics string
         */

        String a="paper";
        String b="title";
        String res="";
        Set<Character> uh=new LinkedHashSet<Character>();
        Set<Character> z =new LinkedHashSet<Character>();

        if(a.length()==b.length()){

         for(int i=0;i<=a.length()-1;i++){

             z.add(a.charAt(i));

         }
         List<Character> uiy=new ArrayList<Character>(z);
         List<Integer> jm=new ArrayList<>(a.length());
            List<Integer> jm1=new ArrayList<>(a.length());

            for (int i = 0; i < a.length(); i++) {
                jm.add(0);
            }

         for(int i=0;i<=uiy.size()-1;i++){
             int count=0;

             for(int j=0;j<=a.length()-1;j++){

                 if(uiy.get(i)==a.charAt(j)){

                     count++;
                     jm.set(j,count);
                 }

             }



         }

         /*

          */


            for(int i=0;i<=b.length()-1;i++){

                uh.add(b.charAt(i));

            }

            List<Character> uiyb=new ArrayList<Character>(uh);
            List<Integer> jmb=new ArrayList<>(a.length());

            for (int i = 0; i < b.length(); i++) {
                jmb.add(0);
            }


            for(int i=0;i<=uiyb.size()-1;i++){
                int count=0;

                for(int j=0;j<=b.length()-1;j++){

                    if(uiyb.get(i)==b.charAt(j)){

                        count++;
                        jmb.set(j,count);
                    }

                }



            }



            if(jmb.size()==jm.size()){
                int count=0;

                for(int i=0;i<=jmb.size()-1;i++){

                    if(jmb.get(i)==jm.get(i)){

                        count++;

                    }
                }

                if(count==jm.size()){

                    System.out.println("its ismorphic");
                }
                else{

                    System.out.println("its not");
                }
            }














        }

        }



    }

