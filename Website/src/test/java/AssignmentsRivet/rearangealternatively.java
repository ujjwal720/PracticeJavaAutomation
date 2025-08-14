package AssignmentsRivet;

public class rearangealternatively {
    public static void main(String[] args) {

          /*
          Remaning String after occuarance
           */


        String s="Thisisdemostring";
        char t='i';
        int count=3;
        String o="";
        int count2=0;
        int j=0;

        for(int i=0;i<=s.length()-1;i++){

            if(s.charAt(i)=='i'){

                   count2++;

                if(count2==count){
                    j=i;
                    break;
                }
            }
        }

        for(int k=j+1;k<=s.length()-1;k++){

            o=o+s.charAt(k);
        }


        System.out.println("The following is an substring answer"+" "+o);



    }
}
