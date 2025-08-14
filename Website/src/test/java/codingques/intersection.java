package codingques;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class intersection {

    public static void main(String[] args) {



        int[] a={4,9,5};
        int[] b={9,4,9,8,4};
        List<Integer> s=new ArrayList<Integer>();
        List<Integer> m=new ArrayList<Integer>();
        List<Integer> res=new ArrayList<Integer>();

        for(int i=0;i<=a.length-1;i++){

               s.add(a[i]);
        }

        for(int i=0;i<=b.length-1;i++){

            m.add(b[i]);
        }

        Set<Integer> k=new HashSet<Integer>(s);

        Set<Integer> kz=new HashSet<Integer>(m);

        s=new ArrayList<>();
        s=new ArrayList<>(k);

        m=new ArrayList<>();
        m=new ArrayList<>(kz);

        for(int i=0;i<=m.size()-1;i++){


            s.add(m.get(i));
        }

        kz=new HashSet<Integer>(s);
        m=new ArrayList<>(kz);

        for(int i=0;i<=m.size()-1;i++){

            int count=0;

            for(int j=0;j<=s.size()-1;j++){



                if(m.get(i)==s.get(j)){

                    count++;

                    if(count==2){
                        res.add(m.get(i));
                        break;

                    }

                }

            }




        }

        System.out.println(res);

       int[] results=new int[res.size()];

        for(int i=0;i<=res.size()-1;i++){

            results[i]=res.get(i);
        }

    }
}
