package codingques;

public class reversedigits {

    public static void main(String[] args) {


        int x=1234;
        String k=Integer.toString(x);
        String res="";
        int p=0;

        for(int i=k.length()-1;i>=0;i--){

            res=res+k.charAt(i);
        }

        p=Integer.parseInt(res);

        System.out.println(p);







    }
}
