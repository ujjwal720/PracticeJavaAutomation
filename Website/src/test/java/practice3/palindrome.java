package practice3;

import java.util.List;

public class palindrome {

    public static void main(String[] args) {
       String a="0P";
       char[] y=a.toCharArray();
       String resultant="";
       for(int i=0;i<=y.length-1;i++){

           if(Character.isLetter(y[i])){

               char t=Character.toLowerCase(y[i]);
               resultant=resultant+t;

           }

           else if(Character.isDigit(y[i])){
               String c=Character.toString(y[i]);
               resultant=resultant+c;
           }
       }

      StringBuilder j=new StringBuilder(resultant);
       if(j.reverse().toString().equals(resultant)){
           System.out.println("true");
       }
       else{
           System.out.println("false");
       }



    }
}
