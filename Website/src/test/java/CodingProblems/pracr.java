package CodingProblems;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class pracr {

    /*
    logical questions
     */
    public static void main(String[] args){

        int count=0;
        String s="geekksforgggeekss";
        List<String> iu=new ArrayList<String>();
        List<String> res1=new ArrayList<String>();
        String results="";
       // Set<String> u=new LinkedHashSet<String>();
        /*

        ee
        kk
        ggg
        brute force approch for the following
         */
        for(int i=0;i<=s.length()-1;i++){

            iu.add(Character.toString(s.charAt(i)));

        }

        Set<String> u=new LinkedHashSet<String>(iu);
        List<String> iuz=new ArrayList<String>(u);

        for(int i=0;i<=iuz.size()-1;i++){

            for(int j=0;j<=s.length()-1;j++){

                if(iuz.get(i).equals(Character.toString(s.charAt(j)))){

                    count++;
                }
                else{

                    if(count>1){

                        for(int k=1;k<=count;k++){

                            results=results+iuz.get(i);

                        }
                        res1.add(results);
                        count=0;
                        results="";

                    }

                    else{
                        count=0;
                    }
                }


                }
            if(count>1){


            }

            }


        System.out.println(res1);
        }



    }

