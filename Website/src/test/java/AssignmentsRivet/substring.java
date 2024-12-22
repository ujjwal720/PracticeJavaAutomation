package AssignmentsRivet;

import java.util.ArrayList;
import java.util.List;

public class substring {

    public static void main(String[] args) {


        String jk = "my name  is vikas       ";
        /*
        My Name Is Vikas


        Example:
Input:
p = "abc"
s = "cbaebabacd"

Output:
[0, 6]
(Explanation: The substring "cba" starting at index 0 and "bac" starting at index 6 are anagrams of "abc").
         */

        List<String> k = new ArrayList<String>();
        String[] kl=jk.split(" ");
        String resultant="";

        for(int i=0;i<=kl.length-1;i++){

            if(!kl[i].equals("")){

                k.add(kl[i]);


            }
        }

        for(int i=0;i<=k.size()-1;i++){

            String words=k.get(i);
            char[] wor1=words.toCharArray();
            for(int j=0;j<=wor1.length-1;j++){

                if(j==0){

                    resultant=resultant+Character.toUpperCase(wor1[j]);
                }

                else{
                    resultant=resultant+wor1[j];

                }
            }
            resultant=resultant+" ";
        }


        System.out.println(resultant);





    }
}
