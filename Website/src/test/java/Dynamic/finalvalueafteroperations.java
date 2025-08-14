package Dynamic;

import java.util.ArrayList;
import java.util.List;

public class finalvalueafteroperations {

    public static void main(String[] args) {


        String[] iu={"++X","++X","X++"};
        int initial=0;
        List<String> io=new ArrayList<String>();

        for(int i=0;i<=iu.length-1;i++){

            String ap=iu[i];

            if(ap.charAt(0)=='-' || ap.charAt(1)=='-'){

                initial=initial-1;
            }
            else{

                initial=initial+1;

            }
        }

        System.out.println(initial);





    }
}
