package CodingProblems;

import java.util.*;

public class firstrepeatingvharacter {
    public static void main(String[] args){

        String s="abc";
        char[] io= s.toCharArray();
        List<Character> charList = new ArrayList<>();
        List<Integer> charList2 = new ArrayList<Integer>();
        int flag=0;
        for (char c : io) {
            charList.add(c);
        }
      //  Set<Character> ui=new LinkedHashSet<Character>(charList);
   //     List<Character> charList1 = new ArrayList<>(ui);
        List<Character> charList3 = new ArrayList<>(charList);
        int index=0;
        int max=0;
        for(int i=0;i<=charList.size()-1;i++){

            if(charList.get(i)!='?') {
                for (int j = i + 1; j <= charList.size() - 1; j++) {
                    char y=charList.get(i);
                    char z=charList.get(j);
                    if (charList.get(i) == charList.get(j)) {

                        charList2.add(j);

                        charList.set(j,'?');
                        flag=1;

                    }

                }}

        }
        if(flag==1) {
            Collections.sort(charList2);
            int point = charList2.get(0);
            System.out.println(charList3.get(point));
        }
        else{
            System.out.println("no repeating characters");
        }


    }
}
