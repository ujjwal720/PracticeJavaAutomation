package CodingProblems;

public class plindromeew {

    /*
     armsstrong questins
     */
    public static void main(String[] args){

       int arm=153;
       String arms1=Integer.toString(arm);
       String[] arm2= arms1.split("");
       int sum=0;

       for(int i=0;i<=arm2.length-1;i++){

           int p=Integer.parseInt(arm2[i]);
           sum=sum+p*p*p;


       }

       if(sum==arm){
           System.out.println("The following is armstrong");
       }
       else{
           System.out.println("The following is not palindrome");
       }



    }


}
