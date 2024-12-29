package practice3;

public class ggr {

    public static void main(String[] args) {


        /*
        reverse prefix of words
         */

        String dm="abcd";
        char tg='z';
        String res="";
        StringBuilder yu;
        int flag=0;
        for(int i=0;i<=dm.length()-1;i++){
            if(dm.charAt(i)==tg && flag==0){
                flag=1;
                res=res+dm.charAt(i);
                yu=new StringBuilder(res);
                String x=yu.reverse().toString();
                res="";
                res=res+x;

            }

            else{

                res=res+dm.charAt(i);
            }

        }

        System.out.println(res);


    }
}
