package TestNg;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class firstunique {

    public static void main(String[] args) {


        String a="vsv";
        List<Character> tr=new ArrayList<Character>();
        Set<Character> b=new LinkedHashSet<Character>();
        List<Character> finala=new ArrayList<Character>();

        for(int i=0;i<=a.length()-1;i++){

            tr.add(a.charAt(i));
        }

        b=new LinkedHashSet<Character>(tr);

        finala=new ArrayList<>(b);



        for(int i=0;i<=finala.size()-1;i++){
            int count =0;

            for(int j=0;j<=a.length()-1;j++){

                if(finala.get(i)==a.charAt(j)){

                    count++;
                }
            }

            if(count==1){

                System.out.println(finala.get(i));
                break;
            }
        }
    }
}
