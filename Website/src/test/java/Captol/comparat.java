package Captol;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparat {

    public static void main(String[] args) {

        List<String> io= Arrays.asList("banana","sdf","klpp");
        Collections.sort(io,new ui());



    }
}


class ui implements Comparator<String>{

    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}






