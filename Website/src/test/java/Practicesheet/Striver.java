package Practicesheet;

public class Striver {

    public static void main(String[] args){

        /*
        sum of all elements
         */

        int[] sum={1,2,3,4,5,6};
        int sum1=0;
        for(int i=0;i<=sum.length-1;i++){

            sum1=sum1+sum[i];
        }

        System.out.println("The sum of all elemnts for the following is"+" "+sum1);

    }
}
