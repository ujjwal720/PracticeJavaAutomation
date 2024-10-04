package CodingProblems;

import java.sql.SQLOutput;

public class aciim {

    public static void main(String[] args){

        String s="uJJWAK123";
        int x=(char)'1';
        int b=(char)'z';
        int count=0;

        for(int i=0;i<=s.length()-1;i++){
            int m=(char)s.charAt(i);

            if(m>=65 && m<=122){

            }
            else{
                count++;
            }


        }
        System.out.println("The digit count for the following is"+" "+count);



    }
}
