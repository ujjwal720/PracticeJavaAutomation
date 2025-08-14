package codingques;



import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.*;

public class reversearrayingroups {

    public static void main(String[] args) {



        int[] a={1, 2, 3, 4, 5, 6, 7, 8};
        int[] b=new int[a.length];
        int k=10;
        int count=0;
        int kcount=0;
        List<Integer> op=new ArrayList<Integer>();
        List<Integer> ans=new ArrayList<Integer>();

        for(int i=0;i<=a.length-1;i++){



            if(count==a.length-1) {
                op.add(a[count]);
                Collections.reverse(op);
                for (int j = 0; j <= op.size() - 1; j++) {
                    ans.add(op.get(j));
                }

            }

                if(kcount==k){

                    Collections.reverse(op);

                    for(int l=0;l<=op.size()-1;l++){

                        ans.add(op.get(l));
                    }

                    kcount=0;
                    op=new ArrayList<Integer>();


                }
            op.add(a[count]);
            kcount++;
            count++;


            }


        System.out.println(ans);

        }








    }



