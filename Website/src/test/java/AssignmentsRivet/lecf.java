package AssignmentsRivet;

public class lecf {

    public static void main(String[] args) {


        /*
        remove consecytive character
         */

        String s="aabb";
        StringBuilder op=new StringBuilder(s);
        for(int i=0;i<=op.length()-1-1;i++){

            if(op.charAt(i)==op.charAt(i+1)){

                op.deleteCharAt(i+1);
            }
        }

        s=op.toString();

        System.out.println("The final result after deleting consecutive character is"+" "+op);




    }
}
