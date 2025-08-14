package lcquestions;

import java.util.ArrayList;
import java.util.List;

public class form1 {

    public static void main(String[] args) {


/*
Remove one elements to make array strictly increasing
 */


       int[] a={105,924,32,968};
       List<Integer> k=new ArrayList<Integer>();
       List<Integer> l=new ArrayList<Integer>();

       for(int i=0;i<=a.length-1;i++){
           k.add(a[i]);
       }


   for(int i=0;i<=k.size()-1-1;i++){
       if(k.get(i)<k.get(i+1)){




       }

       else{
           int p=k.get(i);
           int q=k.get(i+1);
           if(k.get(i)>k.get(i+1)) {
               k.set(i, -101010);
               break;
           }
           else{

               k.set(i+1,-101010);
           }

       }



   }

       for(int i=0;i<=k.size()-1;i++){

       if(k.get(i)!=-101010){
           l.add(k.get(i));
       }

       }

       int count=0;

       for(int i=0;i<=l.size()-1-1;i++){

           if(l.get(i)<l.get(i+1)){

               count++;




           }

       }

       if(count==l.size()-1){

           System.out.println("it is strictly incresing");
       }
       else{

           System.out.println("it is not strictly incresing");
       }
    }
}
