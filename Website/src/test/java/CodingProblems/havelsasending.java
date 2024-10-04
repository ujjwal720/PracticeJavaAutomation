package CodingProblems;

public class havelsasending {

    /*
    {1, 1, 0, 1, 1, 1}
    maximum consecutive ones
    in an array
     */
public static void main(String[] args){


    int[] x1={1, 1, 0, 1, 1, 1};
    int num=1;
    int count=0;
    int max1=0;

    for(int i=0;i<=x1.length-1;i++){

     if(x1[i]==num ){

         count++;
     }
     else{

         count=0;
     }
    }
    max1=Math.max(count,max1);
    System.out.println(max1+""+"This is the consecutive time the 1 is coming");
}

















}
