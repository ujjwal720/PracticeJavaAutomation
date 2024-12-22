package AssignmentsRivet;

public class gjg {

    public static void main(String[] args) {

          String k=" $Gee*k;s..fo, r’Ge^eks?";
        char[] kl=  k.toCharArray();
        String res="";

        for(int i=0;i<=kl.length-1;i++){

            if(Character.isLetter(kl[i])){

                res=res+kl[i];
            }


        }


        System.out.println(res);


    }
}
