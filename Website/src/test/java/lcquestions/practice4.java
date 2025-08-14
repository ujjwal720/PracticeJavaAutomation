package lcquestions;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class practice4 {

    public static void main(String[] args) {

        String[] words={"blue","green","bu"};
        Set<String> ui=new LinkedHashSet<String>();

        for(int i=0;i<=words.length-1;i++){


            for(int j=0;j<=words.length-1;j++){

                if(i==j){

                  continue;
                }
                else{

                   boolean z=words[i].contains(words[j]);
                   if(z==true){

                       ui.add(words[j]);
                   }
                   else{


                   }
                }
            }




        }

        List<String> ids=new ArrayList<String>(ui);










    }
}
