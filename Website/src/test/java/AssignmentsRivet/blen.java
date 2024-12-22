package AssignmentsRivet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class blen {

    public static void main(String[] args) {

        String[] kl={"Ajay","MAN"};
        List<String> io=new ArrayList<String>();

        for(int i=0;i<=kl.length-1;i++){

            io.add(kl[i]);
        }

       Collections.sort(io,new mn());

        System.out.println(io);

    }
}


class mn implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}