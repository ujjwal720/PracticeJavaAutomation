package AssignmentsRivet;

public class pattern3 {

    public static void main(String[] args) {

        int rows=5;
        int cols=5;

        for(int i=1;i<=5;i++){

            for(int j=1;j<=5;j++){

             if(j>=1 && j<=i){

                 System.out.print("*");
             }
             else{

                 System.out.print("");
             }


            }

            System.out.println();
        }





    }
}
