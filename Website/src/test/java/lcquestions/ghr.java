package lcquestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ghr {

    public static void main(String[] args) {


        String s="UST Global has a beautiful campus";
       char[] io= s.toCharArray();
       String results="";

       Set<Character> k=new HashSet<Character>();

       for(int i=0;i<=io.length-1;i++){

           if(io[i]!=' '){

               k.add(io[i]);


           }

       }

        List<Character> kl=new ArrayList<Character>(k);

       for(int i=0;i<=kl.size()-1;i++){
               int count=0;
               char res=kl.get(i);

           for(int j=0;j<=io.length-1;j++){

               if(Character.toString(res).equalsIgnoreCase(Character.toString(io[j]))){

                   count++;

                   if(count>1){

                       io[j]='@';

                   }

               }


           }
       }

       for(int i=0;i<=io.length-1;i++){

           results=results+io[i];
       }


        System.out.println(results);




    }
}
