package SdetCodingPractice;

import java.util.ArrayList;
import java.util.List;

public class preservesopaces {

    public static void main(String[] args) {

        String name="India is ab good country";
        String[] arr1=name.split("");
        int count=arr1.length-1;
        List<String> io=new ArrayList<String>();

        for(int i=0;i<=name.length()-1;i++){

            if(!arr1[i].equals(" ")){
                io.add(arr1[i]);
            }

        }

        int count1=io.size()-1;

        String results="";

        for(int i=0;i<=name.length()-1;i++){

            if(arr1[i].equals(" ")){

                results=results+" ";
            }

            else{

                results=results+io.get(count1);
                count1--;


            }


        }

        System.out.println(results);







    }
}
