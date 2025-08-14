package AssignmentsRivet;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sol56 {

    public static void main(String[] args) {


        /*
        letter occurs in both uper and loser
         */

        String a="arRAzFif";
        Set<Character> chart=new HashSet<Character>();

        for(int i=0;i<=a.length()-1;i++){

            char z=a.charAt(i);
            char up=Character.toUpperCase(z);
            char low=Character.toLowerCase(z);

            if(a.contains(Character.toString(up)) && a.contains(Character.toString(low))){

                chart.add(up);

            }


        }

        System.out.println(chart);

        List<Character> op=new ArrayList<Character>(chart);

        List<Character> op1=new ArrayList<Character>(op);

        List<Integer> ik=new ArrayList<Integer>();




    }
}
