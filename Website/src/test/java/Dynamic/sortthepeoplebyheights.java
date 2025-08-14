package Dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortthepeoplebyheights {

    /*
        sort the people with name of height
     */
public static void main(String[] args) {
    String[] a = {"Mary", "John", "Emma"};
    int[] b = {180, 165, 170};
    List<Integer> c = new ArrayList<Integer>();
    List<String> kl=new ArrayList<String >();
    String[] finals=new String[b.length];

    for(int i=0;i<=b.length-1;i++){

        c.add(b[i]);
    }
    List<Integer> k=new ArrayList<>(c);
    Collections.sort(c);

    for(int i=0;i<=a.length-1;i++){

        int p=c.get(i);

        for(int j=0;j<=k.size()-1;j++){

            if(p==k.get(j)){

                kl.add(a[j]);
                break;

            }
        }


    }


    System.out.println(kl);
    int x=0;

    for(int i=a.length-1;i>=0;i--){
        finals[x]=kl.get(i);
        x++;

    }





}



}
