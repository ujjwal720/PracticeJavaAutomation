package CodingProblems;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removerepeating {

    public static void main(String[] args){


        String s="abab";
       char[] io= s.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c : io) {
            charList.add(c);
        }
        Set<Character> ui=new LinkedHashSet<Character>(charList);
        List<Character> charList1 = new ArrayList<>(ui);

        while(true){





        }








    }

}
