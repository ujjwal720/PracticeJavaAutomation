package AssignmentsRivet;

public class reversedegreeofstring {

    public static void main(String[] args) {


        String a="abc";

       char[] op= a.toCharArray();

       int p=0;
       int sum=0;

       for(int i=0;i<=op.length-1;i++){

           int p1=a.charAt(i);
           int op1='z'-p1+1;
           int z=(i+1)*op1;
           sum=sum+z;

       }

        System.out.println(sum);







    }
}
