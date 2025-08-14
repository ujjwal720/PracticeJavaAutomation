package SdetCodingPractice;

public class patt {

    public static void main(String[] args) {

        int sum=0;

        for(int i=1;i<=5;i++){

            sum=sum+i;

            for(int j=1;j<=sum;j++){
                if(j>=1 && j<=sum){

                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.println();


        }


    }
}
