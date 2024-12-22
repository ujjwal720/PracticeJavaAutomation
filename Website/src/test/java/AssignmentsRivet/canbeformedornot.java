package AssignmentsRivet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class canbeformedornot {

    public static void main(String[] args) {

        int[] a={1, 2, 3, 4, 5};
        int[] b={3, 7, 10, 8, 1};
        Set<Integer> canbeformed =new HashSet<Integer>();

        int target=0;

        while(target<=b.length-1){
            int tg=b[target];
           for(int i=0;i<=a.length-1;i++){
               for(int j=i+1;j<=a.length-1;j++){
             if(tg==a[i]+a[j]){

                 canbeformed.add(tg);
                 break;
             }
               }
           }

           target++;
        }
        System.out.println(canbeformed);

      List<Integer> k=new ArrayList<Integer>(canbeformed);
      List<Integer> cannotbeformed=new ArrayList<Integer>();

     for(int i=0;i<=b.length-1;i++){

        if(k.contains(b[i])==true){

        }
        else{

            cannotbeformed.add(b[i]);
        }



     }


        System.out.println(cannotbeformed);
















    }
}
