package Dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maximum69 {

    public static void main(String[] args) {

        int num1 =9996;
        List<String> po=new ArrayList<String>();
        String k=Integer.toString(num1);
        po.add(k);
        char[] k1=k.toCharArray();
        char[] k2=k.toCharArray();
        List<Integer> kl=new ArrayList<Integer>();
        StringBuilder b=new StringBuilder(k);
        for(int i=0;i<=k.length()-1;i++){

            if(k.charAt(i)=='9'){
                b.setCharAt(i,'6');
                po.add(b.toString());
                b.setCharAt(i,'9');
            }
        }

        for(int i=0;i<=k.length()-1;i++){

            if(k.charAt(i)=='6'){
                b.setCharAt(i,'9');
                po.add(b.toString());
                b.setCharAt(i,'6');
            }
        }


        for(int i=0;i<=po.size()-1;i++){

            kl.add(Integer.parseInt(po.get(i)));



        }

        Collections.sort(kl);

        System.out.println(kl.get(kl.size()-1));





    }
}
