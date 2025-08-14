package codingques;

public class bubblesort {

    public static void main(String[] args) {

        int[] p={2,1,1,5,2,6};

        for(int i=0;i<=p.length-1;i++){

            for(int j=0;j<=p.length-1-1;j++){


                if(p[j]>p[j+1]){

                    /*
                    swap bubble sort logic
                     */

                    int num1=p[j];
                    int num2=p[j+1];

                    p[j]= num2;
                    p[j+1]= num1;


                }



            }
        }



    }
}
