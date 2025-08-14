package Dynamic;

import java.util.ArrayList;
import java.util.List;

public class astrikcunt {

    public static void main(String[] args) {

        String jk ="|**|*|*|**||***||";
        /*
        count astriks
         */

       char[] op= jk.toCharArray();
        List<String> ui=new ArrayList<String>();
        String results="";

       for(int i=0;i<=op.length-1;i++){



           if(op[i]=='|'){

               for(int j=i+1;j<=op.length-1;j++){
                   if(op[j]=='|'){
                       i=j-1;
                       break;
                   }

                   else{
                       results=results+op[j];

                   }

               }

               ui.add(results);
               results="";


           }
       }

        int count=0;

       for(int i=1;i<=ui.size()-1-1-1;i++){

           String l=ui.get(i);

           for(int j=0;j<=l.length()-1;j++){
               if(l.charAt(j)=='*'){

                   count++;
               }


           }


       }

        System.out.println(ui);
        System.out.println(count);



    }
}
