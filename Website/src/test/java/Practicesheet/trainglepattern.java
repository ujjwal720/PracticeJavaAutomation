package Practicesheet;

public class trainglepattern {

    public static void main(String[] args){

        int n=3;
        int p=3;
        int cols=3;
        int rows=5;

        for(int i=1;i<=cols;i++){

            for(int j=1;j<=rows;j++){
                if(j>=n && j<=p){

                    System.out.print("*");


                }
                else{
                    System.out.print(" ");
                }

            }
            n--;
            p++;
            System.out.println();

        }


    }
}
