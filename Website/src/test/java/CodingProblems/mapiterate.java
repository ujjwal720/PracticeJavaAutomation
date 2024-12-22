package CodingProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapiterate {

    public static void main(String[] args) {

  Map<Integer,Integer> ol=new HashMap<Integer,Integer>();
  ol.put(1,2);
  ol.put(2,2);
  ol.put(3,3);

  List<Integer> gh=new ArrayList<Integer>();

        for(Map.Entry<Integer,Integer> num:ol.entrySet()){

            if(num.getValue()==2){

                gh.add(num.getKey());

            }


        }

        System.out.println(gh);


        }










    }

